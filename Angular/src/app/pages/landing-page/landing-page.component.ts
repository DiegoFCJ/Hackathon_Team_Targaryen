import { CommonModule } from '@angular/common';
import { Component, ElementRef, HostListener, ViewChild } from '@angular/core';
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
  @ViewChild('first', {static:false}) first!:ElementRef
  @ViewChild('second', {static:false}) second!:ElementRef
  @ViewChild('third', {static:false}) third!:ElementRef
  @HostListener('window:scroll', ['$event']) onScroll() {
  this.scroll()
}

  constructor(private router: Router){
    this.videoplayer?.nativeElement.play();
  }

  changePage() {
    this.router.navigate(['login'])
  }

  scroll() {
    console.log(this.first.nativeElement.offsetHeight)
  }
}
