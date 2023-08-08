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

    constructor(private router: Router){}

    navigateToHome =  () => {
      this.router.navigate(['/']);
    }; 

    navigateToRegister = () => {
      this.router.navigate(['/register']);
    }
}
