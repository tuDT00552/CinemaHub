import { Component, OnInit } from '@angular/core';
import {CinemaService} from './cinema.service';
import {Cinema} from './Cinema';

@Component({
  selector: 'app-cinema',
  templateUrl: './cinema.component.html',
  styleUrls: ['./cinema.component.css']
})
export class CinemaComponent implements OnInit {
  cinemas: Cinema[];
  constructor(private cinemaService: CinemaService) { }

  ngOnInit(): void {
    this.getCinemas();
  }

  getCinemas(): void {
    this.cinemaService.getCinemas()
      .subscribe(cinemas => this.cinemas = cinemas);
  }

}
