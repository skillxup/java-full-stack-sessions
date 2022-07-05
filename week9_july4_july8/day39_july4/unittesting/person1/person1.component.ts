import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-person1',
  templateUrl: './person1.component.html',
  styleUrls: ['./person1.component.css']
})
export class Person1Component implements OnInit {
  personName: string = "amish";
  personAge: string = "23";

  constructor() { }

  ngOnInit() {
  }

}
