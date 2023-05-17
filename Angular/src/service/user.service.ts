import { Injectable } from '@angular/core';
import { AbstractService } from './abstractservice';
import { UtenteDTO } from 'src/dto/utenteDTO';
import { HttpClient } from '@angular/common/http';
import { LoginDTO } from 'src/dto/logindto';
import { Observable } from 'rxjs';
import { environment } from './../environments/environment';

/**
 * I service sono decorati da @Injectable.
 * Qui trovate, oltre ai metodi ereditati dall'Abstract,
 *  il metodo per il login (in mirror con il backend).
 *
 * @author Vittorio Valent
 *
 * @see AbstractService
 */
@Injectable({
  providedIn: 'root'
})
export class UserService extends AbstractService<UtenteDTO>{

  constructor(http: HttpClient) {
    super(http);
    this.type = 'user';
  }

}
