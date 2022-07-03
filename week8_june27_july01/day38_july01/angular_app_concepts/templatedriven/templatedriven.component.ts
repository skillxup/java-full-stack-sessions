import { Component, OnInit } from '@angular/core';
import { User } from './user.model';

@Component({
  selector: 'app-templatedriven',
  templateUrl: './templatedriven.component.html',
  styleUrls: ['./templatedriven.component.css']
})
export class TemplatedrivenComponent implements OnInit {
  user = new User();
  hobbies: string[] = [
    'skating', 
    'riding', 
    'boxing', 
    'studying', 
    'other'
  ];

  constructor() { }

  ngOnInit() {
  }

  onSubmit(formData) {
    console.log(formData);
  }

}
