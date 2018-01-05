import { ProductTemplate } from './../../models/ProductTemplate';
import {Component, OnInit, Input} from '@angular/core';

@Component({
  selector: 'details-upload',
  templateUrl: './details-upload.component.html',
  styleUrls: ['./details-upload.component.scss']
})
export class DetailsUploadComponent implements OnInit {

  @Input() productTemplate: ProductTemplate;

  constructor() {}

  ngOnInit() {
    if (!this.productTemplate.imageURL) {
      this.productTemplate.imageURL = 'http://placehold.it/700x400';
    }
  }
}
