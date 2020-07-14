import { Component, OnInit } from '@angular/core';
import {SeatModel} from '../../../model/seat.model';
import {PticketModel} from '../../../model/pticket.model';
import {NgbActiveModal} from '@ng-bootstrap/ng-bootstrap';
import {SeatService} from '../../../shared/service/seat.service';
import {EventManagement} from '../../../shared/service/event.management';
import {PticketService} from '../../../shared/service/pticket.service';

@Component({
  selector: 'app-pticket-delete',
  templateUrl: './pticket-delete.component.html',
  styleUrls: ['./pticket-delete.component.css']
})
export class PticketDeleteComponent implements OnInit {
  pticket: PticketModel;
  constructor(public modal: NgbActiveModal,
              private pticketService: PticketService,
              private eventManagement: EventManagement) { }

  ngOnInit(): void {
  }

  delete() {
    this.pticketService.delete(this.pticket.id).subscribe(
      () => {
        this.eventManagement.broadcast('UPDATE_PTICKET');
        this.modal.close();
      }, error => console.log(error)
    );
  }
}
