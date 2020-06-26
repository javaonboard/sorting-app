import { Injectable } from '@angular/core';
import { SortRequest } from './sort-request';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import { SortResponse } from './sort-response';

@Injectable()
export class SortServiceService {
  
  private sortUrl: string;
  constructor(private http: HttpClient) { 
    this.sortUrl = 'http://localhost:8085/sort'
  }

  public getResult(sq: SortRequest): Observable<SortResponse[]>{
    return this.http.get<SortResponse[]>(this.sortUrl);
  }

}
