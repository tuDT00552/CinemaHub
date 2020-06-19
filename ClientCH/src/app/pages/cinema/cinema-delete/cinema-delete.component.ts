import { Component, OnInit } from '@angular/core';
import {CinemaModel} from '../../../model/cinema.model';
import {NgbActiveModal} from '@ng-bootstrap/ng-bootstrap';
import {EventManagement} from '../../../shared/service/event.management';
import {CinemaService} from '../../../shared/service/cinema.service';

@Component({
  selector: 'app-cinema-delete',
  templateUrl: './cinema-delete.component.html',
  styleUrls: ['./cinema-delete.component.css']
})
export class CinemaDeleteComponent implements OnInit {

  cinema: CinemaModel;
  constructor(public modal: NgbActiveModal,
              private cinemaService: CinemaService,
              private eventManagement: EventManagement) { }

  ngOnInit(): void {
  }

  delete() {
    this.cinemaService.delete(this.cinema.id).subscribe(
      () => {
        this.eventManagement.broadcast('UPDATE_CINEMA');
        this.modal.close();
      }, error => console.log(error)
    );
  }
}
