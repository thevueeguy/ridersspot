import { Component } from '@angular/core';
import {MatIconModule} from '@angular/material/icon';
import {MatButtonModule} from '@angular/material/button';
import {MatToolbarModule} from '@angular/material/toolbar';
import { CommonModule } from '@angular/common';
import { Router, RouterLink } from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss'],
  standalone: true,
  imports: [CommonModule, MatToolbarModule, MatButtonModule, MatIconModule, RouterLink],
})
export class HeaderComponent {
    isLoggedIn = false;
    audio = new Audio("../../../assets/click.wav");

    constructor(private router: Router){}

    navigateToHomeWithSound =  () => {
      this.audio.play();
      this.router.navigate(['/']);
    }; 

    navigateToHome =  () => {
      this.router.navigate(['/']);
    }; 

    navigateToLogin = () => {
      this.router.navigate(['/login']);
    }

    navigateToRegister = () => {
      this.router.navigate(['/register']);
    }
}
