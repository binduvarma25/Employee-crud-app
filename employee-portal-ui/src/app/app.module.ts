import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddEmployeeComponent } from './employee/add-employee/add-employee.component';
import { ListEmmployeeComponent } from './employee/list-emmployee/list-emmployee.component';

@NgModule({
  declarations: [
    AppComponent,
    AddEmployeeComponent,
    ListEmmployeeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
