import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-unittesting',
  template: `
    <div class='row'>
      <div class='col-sm-6'>
        <app-person1></app-person1>
      </div>
      <div class='col-sm-6'>
        <app-person2></app-person2>
      </div>
    </div>
  `,
  styleUrls: ['./unittesting.component.css']
})
export class UnittestingComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
