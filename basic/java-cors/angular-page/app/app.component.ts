import {Component} from '@angular/core';
import {Http,  Headers, RequestOptions} from '@angular/http';

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

    postHandle2() {
        let fd = new FormData();
        fd.append('name', "mason");
        let headers = new Headers({ 'Content-Type': 'multipart/form-data' });
        let options = new RequestOptions({ headers: headers });
        this.http.post("http://localhost:9000/demo/test/update2", fd, options)
        .subscribe(response => {
            console.log(response);
        })
        // .catch(e=>{
        //     console.log(e.message);
        // })
    }
}

