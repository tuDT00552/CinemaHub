import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {ActivatedRoute, Router} from '@angular/router';
import {TicketService} from '../../../shared/service/ticket.service';
import {ShowtimeService} from '../../../shared/service/showtime.service';

@Component({
  selector: 'app-showtime-create',
  templateUrl: './showtime-create.component.html',
  styleUrls: ['./showtime-create.component.css']
})
export class ShowtimeCreateComponent implements OnInit {
  form: FormGroup;
  isUpdate: any = false;
  error: string;

  constructor(private fb: FormBuilder,
              private router: Router,
              private route: ActivatedRoute,
              private showtimeService: ShowtimeService) { }

  ngOnInit(): void {
    this.form = this.fb.group({
      id: ['', Validators.required],
      createdAt: ['', Validators.required],
      updateAt: ['', Validators.required],
      ngaychieu: ['', Validators.required],
      maphim: ['', Validators.required],
      maphong: ['', Validators.required],
      marap: ['', Validators.required],
      timeStart: ['', Validators.required],
      timeEnd: ['', Validators.required],
    });

    this.route.data.subscribe(({showtime}) => {
      this.isUpdate = showtime && showtime.id !== undefined;
      if (this.isUpdate) {
        this.form.patchValue({
          id: showtime.id,
          createdAt: showtime.createdAt,
          updateAt: showtime.updateAt,
          ngaychieu: showtime.ngaychieu,
          maphim: showtime.maphim,
          maphong: showtime.maphong,
          marap: showtime.marap,
          timeStart: showtime.timeStart,
          timeEnd: showtime.timeEnd
        });
      }
    });
  }

  doSubmit() {
    const showtime = this.form.value;
    if (this.isUpdate) {
      this.showtimeService.update(showtime).subscribe(
        () => this.router.navigateByUrl('/showtime'),
        error => console.log(error));
    } else {
      this.showtimeService.create(showtime).subscribe(
        () => this.router.navigateByUrl('/showtime'),
        error => console.log(error));
    }
  }

}
