import {Injectable, NgModule} from '@angular/core';
import {ActivatedRouteSnapshot, Resolve, RouterModule, RouterStateSnapshot, Routes} from '@angular/router';
import {Observable} from 'rxjs';
import {PticketModel} from '../../model/pticket.model';
import {PticketListComponent} from './pticket-list/pticket-list.component';
import {PticketService} from '../../shared/service/pticket.service';
import {PticketCreateComponent} from './pticket-create/pticket-create.component';

@Injectable({providedIn: 'root'})
export class PticketResolver implements Resolve<PticketModel> {
  constructor(private pticketService: PticketService) {
  }
  resolve(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): Observable<PticketModel>
    | Promise<PticketModel> | PticketModel {
    const id = route.params.id ? route.params.id : null;
    return this.pticketService.findOne(id);
  }
}

const routes: Routes = [
  {
    path: '',
    component: PticketListComponent,
    pathMatch: 'full'
  },
  {
    path: 'create',
    component: PticketCreateComponent
  },
  {
    path: 'update/:id',
    component: PticketCreateComponent,
    resolve: {
      pticket: PticketResolver
    }
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class PticketRoutingModule { }
