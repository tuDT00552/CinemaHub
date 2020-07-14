import { Component, OnInit } from '@angular/core';
import {PticketModel} from '../../../model/pticket.model';
import {EventManagement} from '../../../shared/service/event.management';
import {NgbModal} from '@ng-bootstrap/ng-bootstrap';
import {PticketService} from '../../../shared/service/pticket.service';
import {PticketDeleteComponent} from '../pticket-delete/pticket-delete.component';

@Component({
  selector: 'app-pticket-list',
  templateUrl: './pticket-list.component.html',
  styleUrls: ['./pticket-list.component.css']
})
export class PticketListComponent implements OnInit {

  ptickets: PticketModel[] = [];
  searchText;

  constructor(private pticketService: PticketService,
              private eventManagement: EventManagement,
              public modal: NgbModal) { }

  ngOnInit(): void {
    this.loadPtickets();
    this.eventManagement.subscribe('UPDATE_PTICKET', () => this.loadPtickets());
  }
  loadPtickets() {
    this.pticketService.fetch().subscribe(pticket => {
      this.ptickets = pticket;
    }, error => console.log(error));
  }
  goToDelete(pticket: PticketModel) {
    const modalRef = this.modal.open(PticketDeleteComponent);
    modalRef.componentInstance.pticket = pticket;
  }
}
