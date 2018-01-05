import { CatalogService } from './../catalog.service';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators, FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-upload-product',
  templateUrl: './upload-product.component.html',
  styleUrls: ['./upload-product.component.css']
})
export class UploadProductComponent implements OnInit {
  addProductForm: FormGroup;
  constructor(private fb: FormBuilder, private catalogService: CatalogService) {
    this.addProductForm = this.fb.group({
      'name': [null, Validators.required],
      'price': [null, Validators.required],
      'description': [null],
      'code': [null, Validators.required]
    });
  }

  ngOnInit() {
  }

  addProduct(product) {
    this.catalogService.createProduct(product);
  }

}
