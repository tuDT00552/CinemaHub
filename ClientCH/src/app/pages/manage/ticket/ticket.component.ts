import {Component, Input, OnInit} from '@angular/core';
import {MovieModel} from '../../../model/movie.model';
import {TicketModel} from '../../../model/ticket.model';
import {TicketService} from '../../../shared/service/ticket.service';

@Component({
  selector: 'app-ticket',
  templateUrl: './ticket.component.html',
  styleUrls: ['./ticket.component.css']
})
export class TicketComponent implements OnInit {
  error: string;
  success: string;
  @Input() ticket: TicketModel;
  @Input() ticketsuccess: TicketModel;

  constructor(private ticketService: TicketService) { }

  ngOnInit(): void {
    this.success = null;
    this.ticketsuccess = null;
  }

  compTicket(ticket: TicketModel) {
    this.ticketService.create(this.ticket).subscribe(
      (data) => {
        if (data == null) {
          this.error = "co loi xay ra";
          this.ticketsuccess = null;
        }
        else {
          this.ticketsuccess = data;
          this.success = "Dat ve thanh cong. Id ve la: ";
        }
      },
      error => console.log(error));
  }
}
