import { Component, OnInit } from '@angular/core';
import {SeatModel} from '../../../model/seat.model';
import {SeatService} from '../../../shared/service/seat.service';
import {EventManagement} from '../../../shared/service/event.management';
import {NgbModal} from '@ng-bootstrap/ng-bootstrap';
import {SeatDeleteComponent} from '../seat-delete/seat-delete.component';

@Component({
  selector: 'app-seat-list',
  templateUrl: './seat-list.component.html',
  styleUrls: ['./seat-list.component.css']
})
export class SeatListComponent implements OnInit {

  seats: SeatModel[] = [];
  searchText;
  constructor(private seatService: SeatService,
              private eventManagement: EventManagement,
              public modal: NgbModal) { }

  ngOnInit(): void {
    this.loadSeats();
    this.eventManagement.subscribe('UPDATE_SEAT', () => this.loadSeats());
  }
  loadSeats() {
    this.seatService.fetch().subscribe(seat => {
      this.seats = seat;
    }, error => console.log(error));
  }

  goToDelete(seat: SeatModel) {
    const modalRef = this.modal.open(SeatDeleteComponent);
    modalRef.componentInstance.seat = seat;
  }
}
