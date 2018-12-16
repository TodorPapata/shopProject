import { BrowserModule } from '@angular/platform-browser';
import { Routes, RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { ProductsModule } from './products/products.module';
import { NgModule } from '@angular/core';
import { PagerComponent } from './pager/pager.component';
import { ProductListComponent } from './products/product-list/product-list.component';
import { UploadProductComponent } from './products/upload-product/upload-product.component';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';

const appRoutes: Routes = [
  {
    path: 'heroes',
    component: ProductListComponent,
    data: { title: 'Heroes List' }
  },
  {
    path: '',
    redirectTo: '/heroes',
    pathMatch: 'full'
  },
  { path: 'add', component: UploadProductComponent},
  { path: '**', component: ProductListComponent }
];

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent
  ],
  imports: [
    NgbModule,
    BrowserModule,
    ProductsModule,
     RouterModule.forRoot(
      appRoutes,
      { enableTracing: true } // <-- debugging purposes only
    )
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {

}
