import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomepageComponent } from './components/homepage/homepage.component';
import { LoginComponent } from './authentication/login/login.component';
import { RegisterComponent } from './authentication/register/register.component';

const routes: Routes = [
  {
    path: "",
    pathMatch: 'full',
    component: HomepageComponent,
    data: { animation: 'isLeft' }
  },
  {
    path: 'login',
    component: LoginComponent,
    data: { animation: 'isLeft' }
  },
  {
    path: 'register',
    component: RegisterComponent,
    data: { animation: 'isRight' }
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
