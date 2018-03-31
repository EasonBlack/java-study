import {Component} from '@angular/core';
import {Http} from '@angular/http';

@Component({
    selector: 'my-app',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.scss']
    
})
export class AppComponent {
    
    constructor(private http: Http){}

    postHandle() {
        this.http.post("http://localhost:9000/demo/test/update", {name: "eason asdf"})
        .subscribe(response => {
            console.log(response);
        });
    }
}

