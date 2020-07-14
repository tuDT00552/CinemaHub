import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
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
import { BoardAdminComponent } from './pages/board-admin/board-admin.component';
import { BoardUserComponent } from './pages/board-user/board-user.component';
import { BoardModeratorComponent } from './pages/board-moderator/board-moderator.component';
import { ProfileComponent } from './pages/profile/profile.component';

import {authInterceptorProviders} from './shared/helpers/auth.interceptor';
import {LoginComponent} from './pages/login/login.component';
import {RegisterComponent} from './pages/register/register.component';
import {LocalStorageService} from './shared/service/local-storage.service';
import { RoomDeleteComponent } from './pages/room/room-delete/room-delete.component';
import { PticketCreateComponent } from './pages/pticket/pticket-create/pticket-create.component';
import { PticketDeleteComponent } from './pages/pticket/pticket-delete/pticket-delete.component';
import { PticketListComponent } from './pages/pticket/pticket-list/pticket-list.component';
import {Ng2SearchPipeModule} from 'ng2-search-filter';


@NgModule({
  imports: [
    BrowserAnimationsModule,
    FormsModule,
    HttpClientModule,
    ComponentsModule,
    NgbModule,
    RouterModule,
    AppRoutingModule,
    ReactiveFormsModule,
    CinemaModule,
    ManageRoutingModule,
    ManageModule,
    ReactiveFormsModule,
    Ng2SearchPipeModule,
  ],
  declarations: [
    AppComponent,
    AdminLayoutComponent,
    AuthLayoutComponent,
    BoardAdminComponent,
    BoardUserComponent,
    BoardModeratorComponent,
    ProfileComponent,
    LoginComponent,
    RegisterComponent,
    RoomDeleteComponent,
    // PticketCreateComponent,
    // PticketDeleteComponent,
    // PticketListComponent
  ],
  providers: [authInterceptorProviders, LocalStorageService],

  bootstrap: [AppComponent]
})
export class AppModule {
}
