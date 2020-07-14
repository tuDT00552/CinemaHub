import {TestBed} from '@angular/core/testing';
import {PticketService} from './pticket.service';

describe('PticketService', () => {
  let service: PticketService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PticketService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
