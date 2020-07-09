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
import {FormBuilder, FormGroup} from '@angular/forms';
import {TicketService} from '../../../shared/service/ticket.service';
import {TicketModel} from '../../../model/ticket.model';
import {Router} from '@angular/router';
import {MovieService} from '../../../shared/service/movie.service';
import {SeatService} from '../../../shared/service/seat.service';

@Component({
  selector: 'app-movie-list',
  templateUrl: './movie-list.component.html',
  styleUrls: ['./movie-list.component.css']
})
export class MovieListComponent implements OnInit {

  constructor(private cinemaService: CinemaService,
              private showtimeService: ShowtimeService,
              private ticketService: TicketService,
              private movieService: MovieService,
              private seatService: SeatService,
              private router: Router,
              private fb: FormBuilder) {

  }
  isUpdate: any = false;
  @Input() movies: MovieModel[];
  @Input() ciid: number;
  showtimes: ShowtimeModel[];
  seats: SeatModel[];
  select: number;
  status = false;
  ticket: TicketModel;
  error: string;
  sSelect: SeatModel;
  teng: string;
  giave: number;
  ticketShow: TicketModel[];
  showtime: ShowtimeModel;



  ngOnInit(): void {
      this.seats = null;
      this.sSelect = null;
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
      this.movieService.findbyRap(this.ciid).subscribe((mov) => {
        this.movies = mov;
      });
    }
  }

  showtimeClick(s: ShowtimeModel) {
    this.showtime = s;
    this.ticketService.findbyShow(s.id).subscribe((ticket) => {
      this.ticketShow = ticket;
      this.seatService.findbyRoom(s.roomEntity.id).subscribe((seat) => {
        // console.log(this.ticketShow);
        // console.log(this.seats);
        ticket.forEach((elem1, index) => {elem1;
          seat.forEach((elem2, index) => {elem2;
            if(elem1.idGhe === elem2.id)
            {
              elem2.status = 2;
            }
          });
        });
        this.seats = seat;
      });
    });

    this.seatService.findbyRoom(s.roomEntity.id).subscribe((seat) => {
      this.seats = seat;
    });
  }

  seatSelect(s: SeatModel) {
    this.sSelect = s;
    this.teng = s.tenghe;
    if(s.loaighe == 1) {
      this.giave = 200000;
    }
    else if(s.loaighe == 2) {
      this.giave = 100000;
    }
  }


  clickSelect() {
    this.ticket = {
      giave: this.giave,
      marap: this.ciid,
      idGhe: this.sSelect.id,
      tenphim: this.movies[0].tenphim,
      timeStart: this.showtimes[0].dateStart,
      timeEnd: this.showtimes[0].dateEnd,
      lichchieu: this.showtime.id
    };
  }
}
