import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {ManageComponent} from './manage/manage.component';
import {ManageRoutingModule} from './manage-routing.module';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';



@NgModule({
  declarations: [ManageComponent],
  imports: [
    CommonModule,
    ManageRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ]
})
export class ManageModule { }
