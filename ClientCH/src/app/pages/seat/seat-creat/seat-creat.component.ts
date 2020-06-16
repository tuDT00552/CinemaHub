import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {ActivatedRoute, Router} from '@angular/router';

import {SeatService} from '../../../shared/service/seat.service';


@Component({
  selector: 'app-seat-create',
  templateUrl: './seat-create.component.html',
  styleUrls: ['./seat-create.component.css']
})
export class SeatCreateComponent implements OnInit {
  form: FormGroup;
  isUpdate: any = false;

  constructor(private fb: FormBuilder,
              private router: Router,
              private route: ActivatedRoute,
              private seatService: SeatService) { }

  ngOnInit(): void {
    this.form = this.fb.group({
      id: [''],
      code: ['', Validators.required],
      name: ['', Validators.required],
      price: ['', Validators.required],
      desc: [''],
    });

    this.route.data.subscribe(({seat}) => {
      this.isUpdate = seat && seat.id !== undefined;
      if (this.isUpdate) {
        this.form.patchValue({
          id: seat.ID_Seat,
          created_at: seat.Created_at,
          update_at: seat.Update_at,
          loai_seat: seat.Loai_Seat,
          ma_phong: seat.Ma_Phong,
          trang_thai: seat.Trang_thai
        });
      }
    });
  }

  doSubmit() {
    const seat = this.form.value;
    if (this.isUpdate) {
      this.seatService.update(seat).subscribe(
        () => this.router.navigateByUrl('/seat'),
        error => console.log(error));
    } else {
      this.seatService.create(seat).subscribe(
        () => this.router.navigateByUrl('/seat'),
        error => console.log(error));
    }
  }
}
