import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CinemaComponent } from './cinema/cinema.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { DefaultComponent } from './default/default.component';
import { MoviesComponent } from './movies/movies.component';
import { ShowtimesComponent } from './showtimes/showtimes.component';

@NgModule({
  declarations: [
    AppComponent,
    CinemaComponent,
    LoginComponent,
    RegisterComponent,
    DefaultComponent,
    MoviesComponent,
    ShowtimesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
