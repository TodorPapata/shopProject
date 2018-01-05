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
  products: PaginationPage<ProductTemplate> = { number: 1, size: 0, content: [{ id: 1, name: 'test' }] };
  numberOfPages: Number;
  currentPage: number;

  constructor(private catalogService: CatalogService) { }

  ngOnInit() {
    this.goToPage(1);
  }

  goToPage(pageNumber: number) {
    this.currentPage = pageNumber;
    this.catalogService.getProducts(this.currentPage - 1, 8)
      .subscribe(products => {
         this.products = products;
         this.numberOfPages = this.products.totalPages;
      },
      err => this.products = { number: 1, size: 0, content: [{ id: 1, name: 'test' }] });
  }

  getPages(): number[] {
    let result: number[] = [];
    for (let i = 0; i < this.numberOfPages; i++) {
      result.push(i + 1);
    }
    console.log(this.products.content[0].imageURL);
    return result;
  }

}
