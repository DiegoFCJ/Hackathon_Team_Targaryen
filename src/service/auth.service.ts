import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { LoginDTO } from 'src/dto/logindto';
import { UtenteDTO } from 'src/dto/utenteDTO';
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

  login(loginDTO: LoginDTO): Observable<UtenteDTO> {
    return this.http.post<any>(environment.APIEndpoint + this.type + '/login', loginDTO)
  }

  logout() {
    localStorage.removeItem('user');
    this.router.navigateByUrl('');
  }

  fullLogout() {
    localStorage.clear();
    this.router.navigateByUrl('');
  }

  isAuthenticated() {
    return localStorage.getItem('user');
  }

  getCurrentUser() {
    let userString = localStorage.getItem('user');
    return userString ? JSON.parse(userString) as UtenteDTO : null;
  }

  saveUserInLocalStorage(loginData: Partial<LoginDTO>) {
    localStorage.setItem('user', JSON.stringify(loginData));
    return of('login ok');
  }

  register(user: UtenteDTO){
    return this.http.post<any>(environment.APIEndpoint + this.type + '/insert', user);
  }
}
