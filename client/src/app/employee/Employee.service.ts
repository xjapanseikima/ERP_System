import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import { Employee } from '../model/Employee';

@Injectable()
export class EmployeeService {

  constructor(private http: HttpClient) {
  }
  getAll(): Observable<any> {
    return this.http.get<Employee[]>('http://localhost:8080/index/getAllEmployee');
  }
}

