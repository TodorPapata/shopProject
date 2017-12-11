import { PaginationPage } from './../models/Pagination';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import { Http } from '@angular/http';
import { Injectable } from '@angular/core';
import { Product } from '../models/Product';

@Injectable()
export class CatalogService {
  private productsUrl = 'api/products';

  constructor(private http: HttpClient) { }

  getProducts(): Observable<PaginationPage<Product[]>> {
    // let headers = new Headers({ 'Content-Type': 'application/json' });
    // let options = new RequestOptions({ headers: headers });

    return this.http.get<PaginationPage<Product[]>>(this.productsUrl);
  }

}
