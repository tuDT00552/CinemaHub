import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgModule } from '@angular/core';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { AdminLayoutComponent } from './layouts/admin-layout/admin-layout.component';
import { AuthLayoutComponent } from './layouts/auth-layout/auth-layout.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { AppRoutingModule } from './app.routing';
import { ComponentsModule } from './components/components.module';
import { CinemaModule } from './pages/cinema/cinema.module';
import { ManageRoutingModule } from './pages/manage/manage-routing.module';
import { ManageModule } from './pages/manage/manage.module';
import { RefundTicketListComponent } from './pages/RefundTicket/refund-ticket-list/refund-ticket-list.component';
import { RefundTicketCreateComponent } from './pages/RefundTicket/refund-ticket-create/refund-ticket-create.component';
import { RefundticketDeleteComponent } from './pages/RefundTicket/refundticket-delete/refundticket-delete.component';
import {BrowserModule} from "@angular/platform-browser";
import {Ng2SearchPipeModule} from "ng2-search-filter";
import { BoardAdminComponent } from './pages/board-admin/board-admin.component';
import { BoardUserComponent } from './pages/board-user/board-user.component';
import { BoardModeratorComponent } from './pages/board-moderator/board-moderator.component';
import { ProfileComponent } from './pages/profile/profile.component';
import { HomeComponent } from './pages/home/home.component';

import {authInterceptorProviders} from "./shared/helpers/auth.interceptor";
import {LoginComponent} from "./pages/login/login.component";
import {RegisterComponent} from "./pages/register/register.component";


@NgModule({
  imports: [
    BrowserAnimationsModule,
    FormsModule,
    HttpClientModule,
    ComponentsModule,
    NgbModule,
    RouterModule,
    AppRoutingModule,
    // CinemaModule,
    // ManageRoutingModule,
    // ManageModule,
    // ReactiveFormsModule,
    // BrowserModule,
    // Ng2SearchPipeModule,

  ],
  declarations: [
    AppComponent,
    AdminLayoutComponent,
    AuthLayoutComponent,
    RefundTicketListComponent,
    RefundTicketCreateComponent,
    RefundticketDeleteComponent,
    BoardAdminComponent,
    BoardUserComponent,
    BoardModeratorComponent,
    ProfileComponent,
    LoginComponent,
    RegisterComponent

  ],
  providers: [authInterceptorProviders],
  bootstrap: [AppComponent]
})
export class AppModule { }
