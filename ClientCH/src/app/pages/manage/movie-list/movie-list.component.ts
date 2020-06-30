import {Component, Input, OnInit} from '@angular/core';
import {RoomModel} from '../../../model/room.model';
import {MovieModel} from '../../../model/movie.model';
import {CinemaService} from '../../../shared/service/cinema.service';
import {EventManagement} from '../../../shared/service/event.management';
import {NgbModal} from '@ng-bootstrap/ng-bootstrap';
import {CinemaModel} from '../../../model/cinema.model';
import {SeatModel} from '../../../model/seat.model';
import {ShowtimeModel} from '../../../model/showtime.model';
import {ShowtimeService} from '../../../shared/service/showtime.service';

@Component({
  selector: 'app-movie-list',
  templateUrl: './movie-list.component.html',
  styleUrls: ['./movie-list.component.css']
})
export class MovieListComponent implements OnInit {

  constructor(private cinemaService: CinemaService,
              private showtimeService: ShowtimeService) {

  }
  @Input() movies: MovieModel[];
  @Input() ciid: number;
  showtimes: ShowtimeModel[];
  seats: SeatModel[];
  select: number;

  status = false;

  ngOnInit(): void {
      this.seats = [];
  }
  OnSelect(movie: MovieModel) {
    this.status = !this.status;
    if (this.status) {
      this.select = movie.id;
      this.movies = [movie];
      this.seats = [];
      this.showtimeService.findbyMovieID(movie.id).subscribe((showtime) => {
        this.showtimes = showtime;
      });
    } else {
      this.select = null;
      this.sSelect = null;
      this.cinemaService.findOne(this.ciid).subscribe((cinema) => {
        this.movies = cinema.movies;
      });
    }
  }

  showtimeClick(s: ShowtimeModel) {
    this.seats = s.roomEntity.gheEntities;
  }

  sSelect: Array<SeatModel> = [];

  seatSelect(s: SeatModel) {
    this.sSelect.push(s);
  }
}
