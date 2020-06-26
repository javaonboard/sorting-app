import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title: string;
  constructor() {
    this.title = 'UTD SE334 - Project01 - Sort Algorithms performance Application';
  }

}
