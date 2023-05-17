import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthService } from 'src/service/auth.service';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss'],
  standalone: true
})
export default class LoginComponent implements OnInit {
  submitted: boolean = false;

  constructor(private authServ: AuthService, private router: Router) {}

  ngOnInit(): void {
  }

  register(form: NgForm) {
    if(form.valid) {
      this.authServ.register(form.value).subscribe();
    }
  }

  login(form: NgForm) {
    form.control.markAllAsTouched();
    if (form.valid) {
      this.authServ.login(form.value).subscribe({
        next: (response: any) => {
          this.authServ.saveUserInLocalStorage(response);
          this.router.navigateByUrl("/landing-page");
        }
      })
    }
  }

  cambiaPagina(){
    this.router.navigate(['login']);
    this.router.navigate(['chat']);
  }

}
