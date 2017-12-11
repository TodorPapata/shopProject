import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-pager',
  templateUrl: './pager.component.html',
  styleUrls: ['./pager.component.css']
})
export class PagerComponent implements OnInit {
  @Input() numberOfPages: Number;
  currentPage: number;

  constructor() { }

  ngOnInit() {
    this.currentPage = 1;
  }

  getPages(): number[] {
    let result: number[] = [];
    for (let i = 0; i < this.numberOfPages; i++) {
      result.push(i + 1);
    }
    return result;
  }

}
