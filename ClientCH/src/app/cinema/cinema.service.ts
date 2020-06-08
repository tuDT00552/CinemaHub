import { Injectable } from '@angular/core';
import {Cinema, CINEMAS} from './Cinema';
import {Observable, of} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CinemaService {

  getCinemas(): Observable<Cinema[]> {
    return of(CINEMAS);
  }

  constructor() { }
}
