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

@Component({
  selector: 'app-movie-list',
  templateUrl: './movie-list.component.html',
  styleUrls: ['./movie-list.component.css']
})
export class MovieListComponent implements OnInit {

  constructor(private cinemaService: CinemaService,
              private showtimeService: ShowtimeService,
              private ticketService: TicketService,
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


  ngOnInit(): void {
      this.seats = [];
  }
  status: boolean = false;
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

  sSelect: SeatModel;
  teng: string;
  giave: number;

  seatSelect(s: SeatModel) {
    this.sSelect = s;
    this.teng = s.tenghe;
    if(s.loaighe == 1) {
      this.giave = 200000;
    }
    else if(s.loaighe == 2) {
      this.giave = 100000;
    }
    else if(s.loaighe == 3) {
      this.giave = 150000;
    }
  }


  clickSelect() {
    this.ticket = {
      giave: this.giave,
      marap: this.ciid,
      idGhe: this.sSelect.id,
      tenphim: this.movies[0].tenphim,
      timeStart: this.showtimes[0].dateStart,
      timeEnd: this.showtimes[0].dateEnd
    };
    this.ticketService.create(this.ticket).subscribe(
      (data) => {
        if (data == null) {
          this.error = "co loi xay ra";
        }
        else {
          this.router.navigateByUrl('/ticket');
        }
      },
      error => console.log(error));
  }
}
