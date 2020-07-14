import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {ActivatedRoute, Router} from '@angular/router';
import {PticketService} from '../../../shared/service/pticket.service';

@Component({
  selector: 'app-pticket-create',
  templateUrl: './pticket-create.component.html',
  styleUrls: ['./pticket-create.component.css']
})
export class PticketCreateComponent implements OnInit {
  form: FormGroup;
  isUpdate: any = false;
  error: string;
  constructor(private fb: FormBuilder,
              private router: Router,
              private route: ActivatedRoute,
              private pticketService: PticketService) { }

  ngOnInit(): void {
    this.form = this.fb.group({
      id: ['', Validators.required],
      createdAt: ['', Validators.required],
      updateAt: ['', Validators.required],
      tenphim: ['', Validators.required],
      loaighe: ['', Validators.required],
      maphong: ['', Validators.required],
      giave: ['', Validators.required],
      ngaychieu: ['', Validators.required],
      khunggio: ['', Validators.required],
    });
  this.route.data.subscribe(({pticket}) => {
  this.isUpdate = pticket && pticket.id !== undefined;
  if (this.isUpdate) {
    this.form.patchValue({
      id: pticket.id,
      createdAt: pticket.createdAt,
      updateAt: pticket.updateAt,
      tenphim: pticket.tenphim,
      loaighe: pticket.loaighe,
      maphong: pticket.maphong,
      giave: pticket.giave,
      ngaychieu: pticket.ngaychieu,
      khunggio: pticket.khunggio,
    });
  }
});
}

  doSubmit() {
  const pticket = this.form.value;
  if (this.isUpdate) {
    this.pticketService.update(pticket).subscribe(
      () => this.router.navigateByUrl('/pticket'),
      error => console.log(error));
  } else {
    this.pticketService.create(pticket).subscribe(
      () => this.router.navigateByUrl('/pticket'),
      error => console.log(error));
  }
}
}
