import { Component, OnInit } from '@angular/core';
import {CinemaModel} from '../../../model/cinema.model';
import {CinemaService} from '../../../shared/service/cinema.service';
import {EventManagement} from '../../../shared/service/event.management';
import {NgbModal} from '@ng-bootstrap/ng-bootstrap';
import {CinemaDeleteComponent} from '../cinema-delete/cinema-delete.component';


@Component({
  selector: 'app-cinema-list',
  templateUrl: './cinema-list.component.html',
  styleUrls: ['./cinema-list.component.css']
})
export class CinemaListComponent implements OnInit {

  cinemas: CinemaModel[] = [];

  constructor(private cinemaService: CinemaService, private eventManagement: EventManagement,
              public modal: NgbModal) { }

  ngOnInit(): void {
    this.loadCinemas();
    this.eventManagement.subscribe('UPDATE_CINEMA', () => this.loadCinemas());
  }

  loadCinemas() {
    this.cinemaService.fetch().subscribe(cinemas => {
      this.cinemas = cinemas;
    }, error => console.log(error));
  }
  goToDelete(cinema: CinemaModel) {
    const modalRef = this.modal.open(CinemaDeleteComponent);
    modalRef.componentInstance.cinema = cinema;
  }

}
