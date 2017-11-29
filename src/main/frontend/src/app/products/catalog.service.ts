import { Observable } from 'rxjs/Rx';
import { Http } from '@angular/http';
import { Injectable } from '@angular/core';
import { Product } from '../models/Product';

@Injectable()
export class CatalogService {
  private productsUrl = 'api/products';

  constructor(private http: Http) { }

  getProducts(): Observable<Product[]> {
    // let headers = new Headers({ 'Content-Type': 'application/json' });
    // let options = new RequestOptions({ headers: headers });

    return this.http.get(this.productsUrl)
      .map((res) => res.json() as Product[]);
  }

}
