import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {ENDPOINT_URL} from '../constants/app.constains';
import {PticketModel} from '../../model/pticket.model';

@Injectable({
  providedIn: 'root'
})
export class PticketService {

  constructor(private http: HttpClient) { }
  fetch(): Observable<PticketModel[]> {
    return this.http.get<PticketModel[]>(`${ENDPOINT_URL}/refundTicket`);
  }

  findOne(id: any): Observable<PticketModel> {
    return this.http.get<PticketModel>(`${ENDPOINT_URL}/refundTicket/${id}`);
  }

  create(pticket: PticketModel): Observable<PticketModel> {
    return this.http.post<PticketModel>(`${ENDPOINT_URL}/refundTicket`, pticket);
  }

  update(pticket: PticketModel) {
    return this.http.put(`${ENDPOINT_URL}/refundTicket`, pticket);
  }

  delete(id: number) {
    return this.http.delete(`${ENDPOINT_URL}/refundTicket/${id}`);
  }
}
