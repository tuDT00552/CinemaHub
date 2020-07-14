import {Component, OnInit} from '@angular/core';
import {CinemaService} from '../../../shared/service/cinema.service';
import {EventManagement} from '../../../shared/service/event.management';
import {NgbModal} from '@ng-bootstrap/ng-bootstrap';
import {CinemaModel} from '../../../model/cinema.model';
import {CinemaDeleteComponent} from '../../cinema/cinema-delete/cinema-delete.component';
import {RoomModel} from '../../../model/room.model';
import {MovieModel} from '../../../model/movie.model';
import {SeatModel} from '../../../model/seat.model';
import {MovieService} from '../../../shared/service/movie.service';

@Component({
  selector: 'app-manage',
  templateUrl: './manage.component.html',
  styleUrls: ['./manage.component.css']
})
export class ManageComponent implements OnInit {
  cinemas: CinemaModel[] = [];
  rooms: RoomModel[];
  movies: MovieModel[];
  seats: SeatModel[];
  options: string;
  ciid: number;

  constructor(private cinemaService: CinemaService,
              private movieService: MovieService,
              private eventManagement: EventManagement,
              public modal: NgbModal) {
  }

  ngOnInit(): void {
    this.loadCinemas();
  }

  loadCinemas() {
    this.cinemaService.fetch().subscribe(cinemas => {
      this.cinemas = cinemas;
      // this.rooms = cinemas[0].roomEntities;
      this.options = cinemas[0].tenrap;
      this.ciid = cinemas[0].id;
      this.movieService.findbyRap(cinemas[0].id).subscribe((movie) => {
        this.movies = movie;
      });
    }, error => console.log(error));
  }

  onSelect(cinema: any) {
    this.options = cinema.tenrap;
    this.ciid = cinema.id;
    this.movieService.findbyRap(cinema.id).subscribe((movie) => {
      this.movies = movie;
    });
  }
}
