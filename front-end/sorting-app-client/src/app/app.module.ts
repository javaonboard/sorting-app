import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { NgSelectModule } from '@ng-select/ng-select';


import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { SortingComponent } from './sorting/sorting.component';
import { HomeComponent } from './home/home.component';
import { AppRoutingModule } from './/app-routing.module';
import { SortServiceService } from './sort-service.service';


@NgModule({
  declarations: [
    AppComponent,
    SortingComponent,
    HomeComponent
    
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    NgSelectModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [SortServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
