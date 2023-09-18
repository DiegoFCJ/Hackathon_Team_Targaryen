import { Injectable } from '@angular/core';
import { TabellaPonteDTO } from 'src/dto/tabellaPonteDTO';
import { AbstractService } from './abstractservice';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class TabellaPonteService extends AbstractService<TabellaPonteDTO>{

  constructor(http: HttpClient) {
    super(http);
    this.type = 'ponte'; 
  }
}
