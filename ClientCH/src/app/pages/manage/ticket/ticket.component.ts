import {Component, Input, OnInit} from '@angular/core';
import {MovieModel} from '../../../model/movie.model';
import {TicketModel} from '../../../model/ticket.model';
import {TicketService} from '../../../shared/service/ticket.service';
import {OrderService} from '../../../shared/service/order.service';
import {OrderModel} from '../../../model/order.model';

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
  @Input() order: OrderModel;

  constructor(private ticketService: TicketService,
              private orderService: OrderService) { }

  ngOnInit(): void {
    this.success = null;
    this.ticketsuccess = null;
  }

  compTicket(ticket: TicketModel) {
    this.order.orderid = ticket.lichchieu + ticket.idGhe;
    this.orderService.create(this.order).subscribe(
      (data) => {
        if (data == null) {
          this.error = 'co loi xay ra';
          this.ticketsuccess = null;
        } else {
          this.ticket.order = {orderid: data.orderid};
          this.ticketService.create(this.ticket).subscribe(
            (data1) => {
              if (data1 == null) {
                this.error = 'co loi xay ra';
              } else {
                this.success = 'Dat ve thanh cong. Id ve la: ';
              }
            },
            error => console.log(error));
          this.ticketsuccess = data;
          console.log(data);
          this.success = 'Dat ve thanh cong. Id don hang la: ';
        }
      },
      error => console.log(error));
  }
}
