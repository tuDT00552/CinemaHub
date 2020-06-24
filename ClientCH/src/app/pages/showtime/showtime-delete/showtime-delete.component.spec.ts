import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowtimeDeleteComponent } from './showtime-delete.component';

describe('ShowtimeDeleteComponent', () => {
  let component: ShowtimeDeleteComponent;
  let fixture: ComponentFixture<ShowtimeDeleteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ShowtimeDeleteComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ShowtimeDeleteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
