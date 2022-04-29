import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class EmployeService {

  private url = "http://localhost:8080/employee-portal/employee";

  constructor(private http: HttpClient) { }
}
