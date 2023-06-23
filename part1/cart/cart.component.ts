import { Component } from '@angular/core';
import { PostService } from '../post.service';
import { SharedService } from '../shared.service';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent {


  // posts:any[]=[];
  // title: any;

  

  // constructor(private service:PostService) {}

  

  // ngOnInit() {

  //     this.service.getpost3()

  //       .subscribe((response: any) => {

  //         this.posts = response;
  //         console.log(this.posts)

  //       });

  //   }


  // cartItems: any[] = []; // Declare the cartItems property

  // constructor(private service: PostService) {}

  // ngOnInit() {
  //   this.service.getPosts().subscribe((response: any) => {
  //     this.cartItems = response;
  //     console.log(this.cartItems);
  //   });
  // }
 
  cartItems: any[] = [];

  constructor(private sharedService: SharedService) {}

  ngOnInit() {
    this.cartItems = this.sharedService.getCartItems();
    console.log(this.cartItems);
  }

  

}
