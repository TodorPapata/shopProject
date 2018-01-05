import { PagerComponent } from './../pager/pager.component';
import { HttpClientModule } from '@angular/common/http';
import { UploadFileService } from './upload.service';
import { CatalogService } from './catalog.service';
import { HttpModule } from '@angular/http';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ProductListComponent } from './product-list/product-list.component';
import { DetailsUploadComponent } from './details-upload/details-upload.component';
import { FormUploadComponent } from './upload-form/form-upload.component';
import { ListUploadComponent } from './uploads-list/list-upload.component';
import { UploadProductComponent } from './upload-product/upload-product.component';
import { ReactiveFormsModule } from '@angular/forms';
@NgModule({
  imports: [
    CommonModule,
    HttpModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  declarations: [
    ProductListComponent,
    DetailsUploadComponent,
    FormUploadComponent,
    ListUploadComponent,
    PagerComponent,
    UploadProductComponent
  ],
  providers: [
    CatalogService,
    UploadFileService
  ],
  exports: [
    ProductListComponent,
    DetailsUploadComponent,
    FormUploadComponent,
    ListUploadComponent,
    PagerComponent
  ]
})
export class ProductsModule { }
