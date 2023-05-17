import { CommonModule } from '@angular/common';
import { Component, ElementRef, ViewChild } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-landing-page',
  templateUrl: './landing-page.component.html',
  styleUrls: ['./landing-page.component.scss'],
  standalone: true,
  imports: [CommonModule]
})
export default class LandingPageComponent {
  open=false;
  @ViewChild('videoPlayer', {static:false}) videoplayer!:ElementRef

  constructor(private router: Router){
    this.videoplayer?.nativeElement.play();
  }

  changePage() {
    this.router.navigate(['login'])
  }

}
