import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {ActivatedRoute, Router} from '@angular/router';
import {SeatService} from '../../../shared/service/seat.service';



@Component({
  selector: 'app-seat-creat',
  templateUrl: './seat-creat.component.html',
  styleUrls: ['./seat-creat.component.css']
})
export class SeatCreatComponent implements OnInit {
  form: FormGroup;
  isUpdate: any = false;

  constructor(private fb: FormBuilder,
              private router: Router,
              private route: ActivatedRoute,
              private seatService: SeatService) { }

  ngOnInit(): void {
    this.form = this.fb.group({
       id: ['', Validators.required],
      createdAt: ['', Validators.required],
      updateAt: ['', Validators.required],
      loaighe: ['', Validators.required],
      maphong: ['', Validators.required],
      trangthai: ['', Validators.required],
    });

    this.route.data.subscribe(({seat}) => {
      this.isUpdate = seat && seat.ID_Seat !== undefined;
      if (this.isUpdate) {
        this.form.patchValue({
          id: seat.ID_Seat,
          createdAt: seat.Created_at,
          updateAt: seat.Update_at,
          loaighe: seat.Loai_Seat,
          maphong: seat.Ma_Phong,
          trangthai: seat.Trang_thai
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
