import { Component, OnInit } from '@angular/core';
import {TicketModel} from '../../../model/ticket.model';
import {EventManagement} from '../../../shared/service/event.management';
import {NgbModal} from '@ng-bootstrap/ng-bootstrap';
import {TicketService} from '../../../shared/service/ticket.service';
import {TicketDeleteComponent} from '../ticket-delete/ticket-delete.component';

@Component({
  selector: 'app-ticket-list',
  templateUrl: './ticket-list.component.html',
  styleUrls: ['./ticket-list.component.css']
})
export class TicketListComponent implements OnInit {
  tickets: TicketModel[] = [];
  searchText;
  constructor(private ticketService: TicketService,
              private eventManagement: EventManagement,
              public modal: NgbModal) { }

  ngOnInit(): void {
    this.loadTickets();
    this.eventManagement.subscribe('UPDATE_TICKET', () => this.loadTickets());
  }
  loadTickets() {
    this.ticketService.fetch().subscribe(ticket => {
      this.tickets = ticket;
    }, error => console.log(error));
  }

  goToDelete(ticket: TicketModel) {
    const modalRef = this.modal.open(TicketDeleteComponent);
    modalRef.componentInstance.ticket = ticket;
  }

}
