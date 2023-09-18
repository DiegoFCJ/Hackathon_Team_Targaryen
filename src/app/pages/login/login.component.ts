import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, NgForm, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthService } from 'src/service/auth.service';
import { ChatSingolaComponent } from '../chat/chat-singola/chat-singola.component';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss'],
  standalone: true,
  imports: [
    CommonModule,
    ChatSingolaComponent,
    FormsModule,
    ReactiveFormsModule,
  ],
})
export default class LoginComponent implements OnInit {
  submitted: boolean = false;

  loginForm!: FormGroup;

  constructor(
    private authServ: AuthService,
    private router: Router,
    private fb: FormBuilder
  ) {
    this.loginForm = this.fb.group({
      username: ['', Validators.required],
      password: [],
    });
  }

  ngOnInit(): void {}

  register(fR: NgForm) {
    if (fR.valid) {
      this.authServ.register(fR.value).subscribe();
      this.router.navigateByUrl('/landing-page');
    }
  }

  login() {
    if (this.loginForm.valid) {
      this.authServ.login(this.loginForm.value).subscribe({
        next: (response: any) => {
          this.authServ.saveUserInLocalStorage(response);
          this.router.navigateByUrl('/chat');
        },
      });
    }
  }

  cambiaPagina(fL: NgForm) {
    this.router.navigate(['login']);
    this.router.navigate(['chat']);
  }
}
