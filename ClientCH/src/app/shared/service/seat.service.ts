import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {ENDPOINT_URL} from '../constants/app.constains';
import {Observable} from 'rxjs';
import {SeatModel} from '../../model/seat.model';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http: HttpClient) { }
  fetch(): Observable<SeatModel[]> {
    return this.http.get<SeatModel[]>(`${ENDPOINT_URL}/seat`);
  }

  findOne(id: any): Observable<SeatModel> {
    return this.http.get<SeatModel>(`${ENDPOINT_URL}/seat/${id}`);
  }

  create(product: SeatModel): Observable<SeatModel> {
    return this.http.post<SeatModel>(`${ENDPOINT_URL}/seat`, product);
  }

  update(product: SeatModel) {
    return this.http.put(`${ENDPOINT_URL}/seat`, product);
  }

  delete(id: number) {
    return this.http.delete(`${ENDPOINT_URL}/seat/${id}`);
  }
}

