import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {CinemaComponent} from './cinema/cinema.component';
import {LoginComponent} from './login/login.component';
import {RegisterComponent} from './register/register.component';
import {MoviesComponent} from './movies/movies.component';
import {ShowtimesComponent} from './showtimes/showtimes.component';
import {DefaultComponent} from './default/default.component';


const routes: Routes = [
  { path: 'cinema', component: CinemaComponent },
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'movies', component: MoviesComponent },
  { path: 'showtimes', component: ShowtimesComponent },
  { path: 'default', component: DefaultComponent },
  { path: '', redirectTo: '/default', pathMatch: 'full' },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
