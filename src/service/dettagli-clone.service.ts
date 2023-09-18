import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { DettagliCloneDTO } from 'src/dto/dettagliCloneDTO';
import { AbstractService } from './abstractservice';

@Injectable({
  providedIn: 'root'
})
export class DettagliCloneService extends AbstractService<DettagliCloneDTO>{

  constructor(http: HttpClient) {
    super(http);
    this.type = 'dettagliClone'; 
  }
}
