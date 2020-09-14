import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `
    
    <div style="text-align:center" class="content">
      <h1>
        Welcome to {{title}}!
      </h1>
      <h2> Change by Abhinav. </h2>
      <h2>Github Jenkins integration attempt bby Abhinav</h2>
      <h2>attempt by Tushar</h2>
      </div>
    
  `,
  styles: [
    `h1,h2 {
      font-family: verdana,
      color: readonly;
    }`
  ]
})
export class AppComponent {
  title = 'hello-app';
}
