import { Component } from '@angular/core';
import { Title } from '@angular/platform-browser';
import {CinemaService} from './cinema/cinema.service';
import {Cinema} from './cinema/Cinema';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  cinemas: Cinema[];
  title = 'Cinema Hub';

  getCinemas(): void {
    this.cinemaService.getCinemas()
      .subscribe(cinemas => this.cinemas = cinemas);
  }

  constructor(private titleService: Title, private cinemaService: CinemaService) {
    titleService.setTitle(this.title);
    this.getCinemas();
  }

}
