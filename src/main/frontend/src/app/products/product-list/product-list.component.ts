import { Component, OnInit } from '@angular/core';
import { ProductTemplate } from '../../models/ProductTemplate';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  products: ProductTemplate[];

  constructor() { }

  ngOnInit() {
  }

}
