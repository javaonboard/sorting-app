import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import { SortResponse } from './sort-response';
import { SystemInfo } from './system-info';

@Injectable()
export class SortServiceService {
  
  private sortUrl: string;
  private sysUrl: string;
  constructor(private http: HttpClient) { 
    this.sortUrl = 'http://localhost:8085/sort'
    this.sysUrl =  'http://localhost:8085/sysinfo'
  }

  public getResult(sortType:string, range: string, orderType: string, duplicate : string, compareAll: string): Observable<SortResponse[]>{
    let params = new HttpParams();
    
    // Begin assigning parameters
    params = params.append('sortType', sortType);
    params = params.append('range', range);
    params = params.append('orderType', orderType);
    params = params.append('duplicate', duplicate);
    params = params.append('compareAll', compareAll);

   /* const httpOptions = {
      header: {'Content-Type' : 'application/json' },
      parameters: {...params}
    };*/
    return this.http.get<SortResponse[]>(this.sortUrl,{params});
  }

  public getSysInfo():Observable<any>{
   return this.http.get<any>(this.sysUrl);
  }



}
