import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {SeatListComponent} from "./seat-list/seat-list.component";
import {SeatDeleteComponent} from "./seat-delete/seat-delete.component";
import {SeatCreatComponent} from "./seat-creat/seat-creat.component";
import {SeatRoutingModule} from "./seat-routing.module";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";



@NgModule({
  declarations: [SeatCreatComponent, SeatListComponent, SeatDeleteComponent],
  exports: [SeatCreatComponent],
  imports: [
    CommonModule,
    SeatRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ]
})
export class SeatModule { }
