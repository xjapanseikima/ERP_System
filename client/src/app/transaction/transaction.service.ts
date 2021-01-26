import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import { Transaction } from '../model/transaction';

@Injectable()
export class TransactionService {

  constructor(private http: HttpClient) {
  }
  getAll(): Observable<any> {
    return this.http.get<Transaction[]>('http://localhost:8080/index/getTranscation');
  }
}

