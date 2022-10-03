import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
  // declared the property and set some records in json format
  products = [
    { id: 1, name: 'html', description: 'html is a hyper text markup language' }, 
    { id: 2, name: 'css', description: 'css is used to apply the styles to html pages' }, 
    { id: 3, name: 'bootstrap', description: 'bootstrap is a css framework which is used to create the responsive websites' }
  ];

  constructor() { }

  ngOnInit() {
  }

}
