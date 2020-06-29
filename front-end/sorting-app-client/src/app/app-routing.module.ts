import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { SortingComponent } from './sorting/sorting.component';
import { HomeComponent } from './home/home.component';
 
const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'sorting', component: SortingComponent }
];
 
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
