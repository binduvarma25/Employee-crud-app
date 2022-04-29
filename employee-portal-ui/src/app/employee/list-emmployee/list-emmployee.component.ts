import { Component, OnInit } from '@angular/core';
import { EmployeService } from '../employe.service';

@Component({
  selector: 'app-list-emmployee',
  templateUrl: './list-emmployee.component.html',
  styleUrls: ['./list-emmployee.component.sass']
})
export class ListEmmployeeComponent implements OnInit {

  constructor(private service: EmployeService) { }
  
  ngOnInit(): void {
  }

}
