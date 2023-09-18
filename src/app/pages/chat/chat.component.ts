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
    ReactiveFormsModule
  ],
})
export default class ChatComponent {
  list = Mock;
  indexNumber: number = 0;
  msg: FormControl = new FormControl();
  @ViewChild('scroll') scroll!: ElementRef;

  submit() {
    this.list[this.indexNumber].messaggi.push({
      messaggio: this.msg.value,
      mio: true,
    });
    let value = this.msg.value;
    this.msg.setValue('');
    setTimeout(() => {
      if (value === 'ciao me come va?') {
        this.list[this.indexNumber].messaggi.push({
          messaggio: 'Tutto bene, tu?',
          mio: false,
        });
      } else if (value === 'non male dai') {
        this.list[this.indexNumber].messaggi.push({
          messaggio: 'Perche\' che succede?',
          mio: false,
        });
      } else if (value === 'etero ?') {
        this.list[this.indexNumber].messaggi.push({
          messaggio: 'Certamente',
          mio: false,
        });
      } else {
        this.list[this.indexNumber].messaggi.push({
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
  setAction(index: number) {
    console.log(index);
    this.indexNumber = index;
    this.list.map((item, i) => {
      console.log(i);

      if (index !== i) {
        item.active = false;
      } else {
        item.active = true;
      }
    });
    console.log(this.list);
  }
}
