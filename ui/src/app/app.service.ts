import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class AppService {

  constructor(private http: HttpClient) { }

  getMessage() : Observable<string> {
    return this.http.get('http://localhost:8080/test', { responseType: 'text' });
  }
}