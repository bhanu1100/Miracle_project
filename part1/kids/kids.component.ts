import { Component, OnInit } from '@angular/core';
import { PostService } from '../post.service';
import { SharedService } from '../shared.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-kids',
  templateUrl: './kids.component.html',
  styleUrls: ['./kids.component.css']
})
export class KidsComponent implements OnInit{
  posts:any[]=[];
  title: any;

  constructor(private service:PostService,private router:Router,private sharedService: SharedService) {}

  

  ngOnInit() {

      this.service.getpost2()

        .subscribe((response: any) => {

          this.posts = response;
          console.log(this.posts)

        });

    }

    addToCart(post: any) {
      // Pass the selected row data to the shared service
      this.sharedService.addToCart(post);
      this.router.navigateByUrl('cart');
    }

}
