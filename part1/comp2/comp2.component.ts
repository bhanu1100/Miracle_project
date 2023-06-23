import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
// import { ProductService } from '../../service/productservice';
@Component({
  selector: 'app-comp2',
  templateUrl: './comp2.component.html',
  styleUrls: ['./comp2.component.css']
})
export class Comp2Component {
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
