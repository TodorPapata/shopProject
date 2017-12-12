import { PaginationPage } from './../models/Pagination';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import { Http, RequestOptions } from '@angular/http';
import { Injectable } from '@angular/core';
import { Product } from '../models/Product';
import { ProductTemplate } from '../models/ProductTemplate';

@Injectable()
export class CatalogService {
  private productsUrl = 'api/products';

  constructor(private http: HttpClient) { }

  getProducts(page: number, pageSize: number): Observable<PaginationPage<ProductTemplate>> {
    // let headers = new Headers({ 'Content-Type': 'application/json' });
    // let options = new RequestOptions({ headers: headers });
    let params = new HttpParams();
    params.set('size', `${pageSize}`);
    params.set('page', `${page}`);

    return this.http.get<PaginationPage<ProductTemplate>>(this.productsUrl, {params: params});
  }

}
