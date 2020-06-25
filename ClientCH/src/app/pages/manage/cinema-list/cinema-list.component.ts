import {Component, Input, OnInit} from '@angular/core';
import {CinemaModel} from '../../../model/cinema.model';
import {CinemaService} from '../../../shared/service/cinema.service';
import {EventManagement} from '../../../shared/service/event.management';
import {NgbModal} from '@ng-bootstrap/ng-bootstrap';
import {RoomModel} from '../../../model/room.model';

@Component({
  selector: 'app-cinema-list',
  templateUrl: './cinema-list.component.html',
  styleUrls: ['./cinema-list.component.css']
})
export class CinemaListComponent implements OnInit {
  @Input() cinemas: CinemaModel[];
  // @Input() rooms: RoomModel[];
  constructor(private cinemaService: CinemaService, private eventManagement: EventManagement,
              public modal: NgbModal) {
  }

  ngOnInit(): void {

  }

  onSelect(cinema: CinemaModel) {
    // this.rooms = cinema.roomEntities;
    console.log(cinema);
  }
}
