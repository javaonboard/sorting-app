import { Component, OnInit } from '@angular/core';
import { SystemInfo } from '../system-info'
import { SortServiceService } from '../sort-service.service'

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private sortService: SortServiceService) { }
  sysinfo: any;
  ngOnInit() {
    this.sortService.getSysInfo().subscribe(data => {
       
     this.sysinfo = data;
     console.log(this.sysinfo);
    
  
  })
  }

}
