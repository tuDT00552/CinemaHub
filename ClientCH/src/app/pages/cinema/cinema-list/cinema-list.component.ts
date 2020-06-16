import { Component, OnInit } from '@angular/core';
import {CinemaModel} from '../../../model/cinema.model';
import {CinemaService} from '../../../shared/service/cinema.service';

@Component({
  selector: 'app-cinema-list',
  templateUrl: './cinema-list.component.html',
  styleUrls: ['./cinema-list.component.css']
})
export class CinemaListComponent implements OnInit {

  cinemas: CinemaModel[] = [];

  constructor(private cinemaService: CinemaService) { }

  ngOnInit(): void {
    this.loadCinemas();
  }

  loadCinemas() {
    this.cinemaService.fetch().subscribe(cinemas => {
      this.cinemas = cinemas;
    }, error => console.log(error));
  }

}
