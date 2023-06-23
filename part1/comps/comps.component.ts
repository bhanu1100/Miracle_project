import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
// interface City {
//   name: string,
//   code: string
// }
@Component({
  selector: 'app-comps',
  templateUrl: './comps.component.html',
  styleUrls: ['./comps.component.css'],
  
})
export class CompsComponent {
  products: any[] = [];

  constructor(private http: HttpClient) { }

  retrieveDataByCategory() {
    const category = 'men';
    const url = `http://172.17.15.207:9999/productfilter?category=men&`;

    this.http.get<any[]>(url).subscribe(
      (response: any[]) => {
        this.products = response;
      },
      (error: any) => {
        console.error(error);
      }
    );
  }
  
  
  
   

}
