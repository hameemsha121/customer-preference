import { Injectable } from '@angular/core';
import { Customer } from '../model/customer-preference';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CustomerPreferenceService {

  httpUrl = "http://localhost:8765/";

  constructor(private httpClient: HttpClient) { }

  getCustomerPrefernceById(id: number): Observable<Customer> {
    return this.httpClient.get<Customer>(this.httpUrl + "get-customer-id-service/customer/" + id);
  }

  updateCustomerPreference(customer: Customer): Observable<Customer> {
    return this.httpClient.put<Customer>(this.httpUrl + "customer-preference-service/customer/", customer);
  }

  generateReport(date: Date): Observable<Customer[]> {
    return this.httpClient.get<Customer[]>(this.httpUrl);
  }

}
