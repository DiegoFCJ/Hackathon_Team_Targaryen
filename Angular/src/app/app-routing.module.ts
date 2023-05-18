import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path: '',
    redirectTo: 'landing-page',
    pathMatch: 'full'
  },
  {
    path: 'landing-page',
    loadComponent: () => import ('./pages/landing-page/landing-page.component')
  },
  {
    path: 'login',
    loadComponent: () => import ('./pages/login/login.component')
  },
  {
    path: 'chat',
    loadComponent: () => import ('./pages/chat/chat.component')
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
