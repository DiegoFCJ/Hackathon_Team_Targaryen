import { Component, OnInit } from '@angular/core';
import { UserDTO } from 'src/dto/userdto';
import { AuthService } from 'src/service/auth.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  user: UserDTO = new UserDTO;
  constructor(private auth: AuthService) { }

  ngOnInit() {
    this.user = this.auth.getCurrentUser();
  }

}
