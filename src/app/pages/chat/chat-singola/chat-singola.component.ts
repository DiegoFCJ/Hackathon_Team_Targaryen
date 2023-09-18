import { CommonModule } from '@angular/common';
import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-chat-singola',
  templateUrl: './chat-singola.component.html',
  styleUrls: ['./chat-singola.component.scss'],
  standalone: true,
  imports: [CommonModule]
})
export class ChatSingolaComponent {

  @Input() messages!: any

  ngOnInit() {
    console.log(this.messages)
  }

}
