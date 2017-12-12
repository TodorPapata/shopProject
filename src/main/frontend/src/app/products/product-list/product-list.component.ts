import { PaginationPage } from './../../models/Pagination';
import { CatalogService } from './../catalog.service';
import { Component, OnInit } from '@angular/core';
import { ProductTemplate } from '../../models/ProductTemplate';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  products: PaginationPage<ProductTemplate>;
  numberOfPages: Number;
  currentPage: number;

  constructor(private catalogService: CatalogService) { }

  ngOnInit() {
    this.goToPage(1);
    this.numberOfPages = 5;
    // this.numberOfPages = this.products.totalPages;
  }

  goToPage(pageNumber: number) {
    this.currentPage = pageNumber;
    this.catalogService.getProducts(this.currentPage - 1, 9)
      .subscribe(products => this.products = products,
      err => this.products = { number: 1, size: 0, content: [{id : 1, name : 'test'}] });
  }

  getPages(): number[] {
    let result: number[] = [];
    for (let i = 0; i < this.numberOfPages; i++) {
      result.push(i + 1);
    }
    return result;
  }

}
