import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { LoginDTO } from 'src/dto/logindto';
import { UserDTO } from 'src/dto/userdto';
import { environment } from 'src/environments/environment';
import { of } from 'rxjs';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  type: string = 'user';

  constructor(private http: HttpClient, private router: Router) {
  }

  login(loginDTO: LoginDTO): Observable<UserDTO> {
    return this.http.post<any>(environment.APIEndpoint + this.type + '/login', loginDTO)
  }

  logout() {
    localStorage.removeItem('user');
  } 

  fullLogout() {
    localStorage.clear();
    this.router.navigateByUrl('');
  }

  isAuthenticated() {
    return localStorage.getItem('user');
  }

  getCurrentUser() {
    return JSON.parse(localStorage.getItem('user')) as UserDTO;
  }

  saveUserInLocalStorage(loginData: Partial<LoginDTO>) {
    localStorage.setItem('user', JSON.stringify(loginData));
    return of('login ok');
  }
}
