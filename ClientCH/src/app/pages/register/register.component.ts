import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent implements OnInit {
  select: number;
  constructor() { }

  ngOnInit() {
    this.select = 1;
  }

  onSelect(number) {
    this.select = number;
  }
}
