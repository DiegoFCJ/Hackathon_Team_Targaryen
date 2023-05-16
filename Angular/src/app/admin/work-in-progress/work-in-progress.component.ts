import { Component, OnInit } from '@angular/core';
import { UserDTO } from 'src/dto/userdto';
import { AuthService } from 'src/service/auth.service';

@Component({
  selector: 'app-work-in-progress',
  templateUrl: './work-in-progress.component.html',
  styleUrls: ['./work-in-progress.component.css']
})
export class WorkInProgressComponent implements OnInit {
  currentUser: UserDTO;

  constructor(private auth: AuthService) { }

  ngOnInit() {
    this.currentUser = this.auth.getCurrentUser();
    this.auth.isAdminOrUser(this.currentUser, 'ADMIN');
  }

}
