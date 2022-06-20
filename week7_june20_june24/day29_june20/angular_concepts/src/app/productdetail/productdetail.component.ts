import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-productdetail',
  templateUrl: './productdetail.component.html',
  styleUrls: ['./productdetail.component.css']
})
export class ProductdetailComponent implements OnInit {
  product_id: string;
  product_name: string;
  constructor(
    private actRoute: ActivatedRoute
  ) { 
    this.product_name = this.actRoute.snapshot.params.name;
  }

  ngOnInit() {
  }

}
