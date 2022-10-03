import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html',
  styleUrls: ['./pipes.component.css']
})
export class PipesComponent implements OnInit {
  fullName: string = "jOhn Paul";
  emailAddress: string = "kIrE@GmAiL.Com";

  arr1 = [7, 3, 9, 2, 9];
  Pi = Math.PI;

  person = {
    firstName: "john", 
    lastName: "paul"
  };

  salary: number = 565.6783;
  getDate = new Date();

  custName: string = "leO SmIth";
  constructor() { }

  ngOnInit() {
  }

}
