import {Component, OnInit} from '@angular/core';
import {CinemaService} from '../../../shared/service/cinema.service';
import {EventManagement} from '../../../shared/service/event.management';
import {NgbModal} from '@ng-bootstrap/ng-bootstrap';
import {CinemaModel} from '../../../model/cinema.model';
import {CinemaDeleteComponent} from '../../cinema/cinema-delete/cinema-delete.component';
import {RoomModel} from '../../../model/room.model';

@Component({
  selector: 'app-manage',
  templateUrl: './manage.component.html',
  styleUrls: ['./manage.component.css']
})
export class ManageComponent implements OnInit {
  cinemas: CinemaModel[] = [];
  rooms: RoomModel[];


  constructor(private cinemaService: CinemaService, private eventManagement: EventManagement,
              public modal: NgbModal) {
  }

  ngOnInit(): void {
    this.loadCinemas();
    // this.rooms = this.cinemas[0].roomEntities;
  }

  loadCinemas() {
    this.cinemaService.fetch().subscribe(cinemas => {
      this.cinemas = cinemas;
      this.rooms = cinemas[0].roomEntities;
    }, error => console.log(error));
  }
}
