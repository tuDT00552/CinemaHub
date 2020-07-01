import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {TicketCreateComponent} from './ticket-create/ticket-create.component';
import {TicketDeleteComponent} from './ticket-delete/ticket-delete.component';
import {TicketListComponent} from './ticket-list/ticket-list.component';
import {TicketRoutingModule} from './ticket-routing.module';
import {Ng2SearchPipeModule} from "ng2-search-filter";



@NgModule({
  declarations: [TicketCreateComponent, TicketDeleteComponent, TicketListComponent],
  exports: [TicketCreateComponent, TicketListComponent],
  imports: [
    CommonModule,
    TicketRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    Ng2SearchPipeModule
  ]
})
export class TicketModule { }
