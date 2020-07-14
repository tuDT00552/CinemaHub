import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {Ng2SearchPipeModule} from 'ng2-search-filter';
import {PticketListComponent} from './pticket-list/pticket-list.component';
import {PticketDeleteComponent} from './pticket-delete/pticket-delete.component';
import {PticketRoutingModule} from './pticket-routing.module';
import {PticketCreateComponent} from './pticket-create/pticket-create.component';

@NgModule({
  declarations: [PticketCreateComponent, PticketDeleteComponent, PticketListComponent],
  exports: [PticketCreateComponent, PticketListComponent],
  imports: [
    CommonModule,
    PticketRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    Ng2SearchPipeModule
  ]
})
export class PticketModule { }
