import { Component, OnInit } from '@angular/core';
import { UserDTO } from 'src/dto/userdto';
import { AuthService } from 'src/service/auth.service';

/**
 * Componente della dashboard admin. Nell'ngOnInit recupera
 * l'utente loggato per il messaggio di benvenuto.
 */
@Component({
  selector: 'app-admin-dashboard',
  templateUrl: './admin-dashboard.component.html',
  styleUrls: ['./admin-dashboard.component.css']
})
export class AdminDashboardComponent implements OnInit {

  user: UserDTO;

  constructor(private auth: AuthService) { }

  ngOnInit() {
    this.user = this.auth.getCurrentUser();
    if(this.user === null || this.user.usertype != 1){
      alert('non hai le autorizzazioni necessarie per accedere a questa pagina');
    }
  }

}
