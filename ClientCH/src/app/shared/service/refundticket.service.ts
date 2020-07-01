import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {SeatModel} from "../../model/seat.model";
import {ENDPOINT_URL} from "../constants/app.constains";
import {RefundTicketModule} from "../../model/refundticket";

@Injectable({
  providedIn: 'root'
})
export class RefundticketService {
  constructor(private http: HttpClient) { }
  fetch(): Observable<RefundTicketModule[]> {
    return this.http.get<RefundTicketModule[]>(`${ENDPOINT_URL}/refundticket`);
  }

  findOne(id: any): Observable<RefundTicketModule> {
    return this.http.get<RefundTicketModule>(`${ENDPOINT_URL}/refundticket/${id}`);
  }

  create(refundticket: RefundTicketModule): Observable<RefundTicketModule> {
    return this.http.post<RefundTicketModule>(`${ENDPOINT_URL}/refundticket`, refundticket);
  }

  update(refundticket: RefundTicketModule) {
    return this.http.put(`${ENDPOINT_URL}/refundticket`, refundticket);
  }

  delete(id: number) {
    return this.http.delete(`${ENDPOINT_URL}/refundticket/${id}`);
  }
}
