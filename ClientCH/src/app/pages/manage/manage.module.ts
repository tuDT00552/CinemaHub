import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {ManageComponent} from './manage/manage.component';
import {ManageRoutingModule} from './manage-routing.module';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { CinemaListComponent } from './cinema-list/cinema-list.component';
import { MovieListComponent } from './movie-list/movie-list.component';
import { RoomListComponent } from './room-list/room-list.component';
import { SeatListComponent } from './seat-list/seat-list.component';



@NgModule({
  declarations: [ManageComponent, CinemaListComponent, MovieListComponent, RoomListComponent, SeatListComponent],
  imports: [
    CommonModule,
    ManageRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ]
})
export class ManageModule { }
