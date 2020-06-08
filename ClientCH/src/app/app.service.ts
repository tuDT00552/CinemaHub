import { Injectable } from '@angular/core';
import {Observable, of} from 'rxjs';
import {Cinema, CINEMAS} from './cinema/Cinema';

@Injectable({
  providedIn: 'root'
})
export class AppService {

  getCinemas(): Observable<Cinema[]> {
    return of(CINEMAS);
  }

  constructor() { }
}
