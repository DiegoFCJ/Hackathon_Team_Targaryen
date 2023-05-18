import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { CloneDTO } from 'src/dto/cloneDTO';
import { AbstractService } from './abstractservice';

@Injectable({
  providedIn: 'root'
})
export class CloneService extends AbstractService<CloneDTO>{

  constructor(http: HttpClient) {
    super(http);
    this.type = 'clone'; 
  }
}
