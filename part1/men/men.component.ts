import { Component, OnInit } from '@angular/core';
import { PostService } from '../post.service';
import { Router } from '@angular/router';
import { SharedService } from '../shared.service';

@Component({
  selector: 'app-men',
  templateUrl: './men.component.html',
  styleUrls: ['./men.component.css']
})
export class MenComponent implements OnInit {
  // posts: any[] = [];
  posts: any[] = [];
  cartItems: any[] = []; 
  data: any = {}; // Define an object to hold the form data

  constructor(private postService: PostService,private router:Router,private sharedService: SharedService) {}



  ngOnInit() {
    this.posts = [
      // ...
    ];
    this.postService.getPosts()
      .subscribe((response: any) => {
        this.posts = response;
        console.log(this.posts);
      });
  }
  // addToCart(post: any) {
  //   const menItem = { ...post, category: 'Men' }; // Create a new object with modified category
  //   this.cartItems.push(menItem); // Add selected item to the cart
  //   this.router.navigateByUrl('cart');
  //   console.log(this.cartItems);
  // }
  

   addToCart(post: any) {
    // Pass the selected row data to the shared service
    this.sharedService.addToCart(post);
    this.router.navigateByUrl('cart');
  }



}
