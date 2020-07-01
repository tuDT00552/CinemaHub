import { Component, OnInit } from '@angular/core';
import {SeatModel} from "../../../model/seat.model";
import {SeatService} from "../../../shared/service/seat.service";
import {EventManagement} from "../../../shared/service/event.management";
import {NgbModal} from "@ng-bootstrap/ng-bootstrap";
import {SeatDeleteComponent} from "../../seat/seat-delete/seat-delete.component";
import {RefundticketService} from "../../../shared/service/refundticket.service";
import {RefundTicketModule} from "../../../model/refundticket";
import {RefundticketDeleteComponent} from "../refundticket-delete/refundticket-delete.component";

@Component({
  selector: 'app-refund-ticket-list',
  templateUrl: './refund-ticket-list.component.html',
  styleUrls: ['./refund-ticket-list.component.css']
})
export class RefundTicketListComponent implements OnInit {

  refundTickets: RefundTicketModule[] = [];
  searchText;
  constructor(private refundTicketService: RefundticketService,
              private eventManagement: EventManagement,
              public modal: NgbModal) { }

  ngOnInit(): void {
    // this.loadSeats();
    // this.eventManagement.subscribe('UPDATE_REFUNDTICKET', () => this.loadSeats());
  }
  // loadSeats() {
  //   this.refundTicketService.fetch().subscribe(refundTicket => {
  //     this.refundTickets = refundTicket;
  //   }, error => console.log(error));
  // }
  //
  // goToDelete(refundTicket: RefundTicketModule) {
  //   const modalRef = this.modal.open(RefundticketDeleteComponent);
  //   modalRef.componentInstance.refundTicket = refundTicket;
  // }

}
