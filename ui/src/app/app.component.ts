import { Component } from '@angular/core';
import { AppService } from './app.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'ui';

  constructor(private appService: AppService) {}

  call() {
    this.appService.getMessage().subscribe(msg => {
      console.log(msg);
    });
  }
  
}
