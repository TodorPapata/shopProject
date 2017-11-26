import { CatalogService } from './catalog.service';
import { UploadService } from './upload.service';
import { ListUploadComponent } from './list-upload/list-upload.component';
import { FormUploadComponent } from './form-upload/form-upload.component';
import { ProductDetailsComponent } from './product-details/product-details.component';
import { ProductListComponent } from './product-list/product-list.component';
import { HttpClientModule } from '@angular/common/http';
import { HttpModule } from '@angular/http';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

@NgModule({
  imports: [
    CommonModule,
    HttpModule,
    HttpClientModule
  ],
  declarations: [
    ProductListComponent,
    ProductDetailsComponent,
    FormUploadComponent,
    ListUploadComponent
  ],
  providers: [
    CatalogService,
    UploadService
  ],
  exports: [
    ProductListComponent,
    ProductDetailsComponent,
    FormUploadComponent,
    ListUploadComponent
  ]
})
export class ProductsModule { }
