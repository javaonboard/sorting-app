import { Component, OnInit } from '@angular/core';
import { SortResponse } from '../sort-response'
import { SortServiceService } from '../sort-service.service'
import {BrowserModule} from '@angular/platform-browser';
import {FormControl, FormGroup, ReactiveFormsModule, FormsModule} from '@angular/forms';
import {NgSelectModule, NgOption} from '@ng-select/ng-select';

@Component({
  selector: 'app-sorting',
  templateUrl: './sorting.component.html',
  styleUrls: ['./sorting.component.css']
})
export class SortingComponent implements OnInit {


  constructor(private sortService: SortServiceService) { 
    
  }

  responses: SortResponse[];
  error = '';
  sortType = null;
  range= null;
  orderType= null;
  duplicate = 'false';
  compareAll = 'false';
  loading = false;

  click(){
    this.ngOnInit();
    }

    onDuplicate(){
      if(this.duplicate=='false')this.duplicate = 'true';
      else this.duplicate = 'false';

    }

    onCompare(){
      if(this.compareAll=='false')this.compareAll = 'true';
      else this.compareAll = 'false';

    }


  ngOnInit() {
    this.loading = true;
    if(this.sortType==null || this.orderType==null||this.range==null){
      this.error = 'please select the all required options.';
      this.loading = false;
      
    }else{
    this.sortService.getResult(this.sortType, this.range, this.orderType, this.duplicate , this.compareAll).subscribe(data => {
      this.responses = data;
      this.responses.sort((a,b)=>a.winner.localeCompare(b.winner));
      this.loading = false;
    })
  }
    //console.log(this.sortType + " " + this.range + " " + this.orderType + " " + this.duplicate  + " " + this.compareAll);

  }

  sortTypes = [
    {value: 'SELECTION_SORT', name: 'SELECTION'},
    {value: 'INSERTION_SORT', name: 'INSERTION'},
    {value: 'QUICK_SORT', name: 'QUICK'},
    {value: 'MERGE_SORT', name: 'MERGE'},
    {value: 'RADIX_SORT', name: 'RADIX'},
    {value: 'HEAP', name: 'HEAP'}
  ];

  orderTypes = [
    {value: 'SELECTION_SORT', name: 'IN_ORDER'},
    {value: 'INSERTION_SORT', name: 'REVERSE_ORDER'},
    {value: 'QUICK_SORT', name: 'ALMOST_ORDER'},
    {value: 'QUICK_SORT', name: 'RANDOM'}
  ];

}

