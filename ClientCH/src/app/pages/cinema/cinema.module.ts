import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {CinemaCreateComponent} from './cinema-create/cinema-create.component';
import {CinemaDeleteComponent} from './cinema-delete/cinema-delete.component';
import {CinemaListComponent} from './cinema-list/cinema-list.component';
import {CinemaRoutingModule} from './cinema-routing.module';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { CinemaListmovieComponent } from './cinema-listmovie/cinema-listmovie.component';
import {IgxDropDownModule, IgxToggleModule} from 'igniteui-angular';
import { CinemamovieDeleteComponent } from './cinemamovie-delete/cinemamovie-delete.component';



@NgModule({
  declarations: [CinemaCreateComponent, CinemaDeleteComponent, CinemaListComponent, CinemaListmovieComponent, CinemamovieDeleteComponent],
  exports: [CinemaCreateComponent],
  imports: [
    CommonModule,
    CinemaRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    IgxToggleModule,
    IgxDropDownModule
  ]
})
export class CinemaModule { }
