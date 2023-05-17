import { CommonModule } from '@angular/common';
import { Component, ElementRef, ViewChild } from '@angular/core';
import { Mock } from 'src/app/mock';
import { ChatSingolaComponent } from './chat-singola/chat-singola.component';
import { FormControl } from '@angular/forms';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-chat',
  templateUrl: './chat.component.html',
  styleUrls: ['./chat.component.scss'],
  standalone: true,
  imports: [
    CommonModule,
    ChatSingolaComponent,
    FormsModule,
    ReactiveFormsModule,
  ],
})
export default class ChatComponent {
  list = Mock;
  msg: FormControl = new FormControl();
  @ViewChild('scroll') scroll!: ElementRef;

  submit() {
    this.list[0].messaggi.push({ messaggio: this.msg.value, mio: true });
    let value = this.msg.value;
    this.msg.setValue('');
    console.log(value)
    setTimeout(() => {
      if (value === 'ciao') {
        this.list[0].messaggi.push({
          messaggio: 'Ciao ME, come va?',
          mio: false,
        });
      } else if (value === 'come stai') {
        this.list[0].messaggi.push({
          messaggio: 'Tutto bene e tu?',
          mio: false,
        });
      } else if (value === 'etero ?') {
        this.list[0].messaggi.push({ messaggio: 'Certamente', mio: false });
      } else {
        this.list[0].messaggi.push({
          messaggio: 'Al momento sono impegnato, riprova piu tardi',
          mio: false,
        });
      }
      this.goToBottom();
    }, 800);
  }

  goToBottom() {
    this.scroll.nativeElement.scrollTop =
      this.scroll.nativeElement.scrollHeight;
  }
}
