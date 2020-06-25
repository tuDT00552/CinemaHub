import {Component, Input, OnInit} from '@angular/core';
import {RoomModel} from '../../../model/room.model';
import {MovieModel} from '../../../model/movie.model';
import {CinemaService} from '../../../shared/service/cinema.service';
import {EventManagement} from '../../../shared/service/event.management';
import {NgbModal} from '@ng-bootstrap/ng-bootstrap';
import {CinemaModel} from '../../../model/cinema.model';
import {SeatModel} from '../../../model/seat.model';

@Component({
  selector: 'app-movie-list',
  templateUrl: './movie-list.component.html',
  styleUrls: ['./movie-list.component.css']
})
export class MovieListComponent implements OnInit {
  @Input() movies: MovieModel[];
  @Input() seats: SeatModel[];
  mv: MovieModel[];
  constructor() {

  }
  select: number;
  ngOnInit(): void {

  }
  status : boolean = false;
  OnSelect(movie: MovieModel) {
    console.log(movie);
    this.status = !this.status;
    if (this.status) {
      this.select = movie.id;
      this.mv = this.movies;
      this.movies = [movie];
    }
    else {
      this.select = null;
      this.movies = this.mv;
    }
  }
}
