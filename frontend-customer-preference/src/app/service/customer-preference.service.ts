import { Injectable } from '@angular/core';
import { Customer } from '../model/customer-preference';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CustomerPreferenceService {

  httpUrl = "http://localhost:8500/customer/";

  constructor(private httpClient: HttpClient) { }

  saveCustomerPreference(customer: Customer): Observable<Customer> {
    return this.httpClient.post<Customer>(this.httpUrl, customer)
  }

  getAllCustomerPreference(): Observable<Customer[]> {
    return this.httpClient.get<Customer[]>(this.httpUrl);
  }

  getCustomerPrefernceById(id: number): Observable<Customer> {
    return this.httpClient.get<Customer>(this.httpUrl + id);
  }

  updateCustomerPreference(customer: Customer): Observable<Customer> {
    return this.httpClient.put<Customer>(this.httpUrl, customer);
  }

  generateReport(customer: Customer): Observable<Customer> {
    return this.httpClient.get<Customer>(this.httpUrl);
  }

}
