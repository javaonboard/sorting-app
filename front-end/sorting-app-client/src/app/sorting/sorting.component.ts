import { Component, OnInit } from '@angular/core';
import { SortResponse } from '../sort-response'
import { SortServiceService } from '../sort-service.service'

@Component({
  selector: 'app-sorting',
  templateUrl: './sorting.component.html',
  styleUrls: ['./sorting.component.css']
})
export class SortingComponent implements OnInit {

  sortResponse: SortResponse[];

  constructor(private sortService: SortServiceService) { }

  ngOnInit() {
    this.sortService.getResult().subscribe(data => {
      this.sortResponse = data;
    })
  }

}
