import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { Mock } from 'src/app/mock';

@Component({
  selector: 'app-chat',
  templateUrl: './chat.component.html',
  styleUrls: ['./chat.component.scss'],
  standalone: true,
  imports: [CommonModule]
})
export default class ChatComponent {
  list = Mock;

}
