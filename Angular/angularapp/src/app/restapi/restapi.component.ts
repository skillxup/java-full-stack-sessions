import { Component, OnInit } from '@angular/core';
import { Post } from './post.model';
import { PostService } from './post.service';

@Component({
  selector: 'app-restapi',
  templateUrl: './restapi.component.html',
  styleUrls: ['./restapi.component.css']
})
export class RestapiComponent implements OnInit {
  title: string = 'understanding the rest api with combination of observables and services';

  posts = new Array<Post>();
  constructor(private postService: PostService) { }

  ngOnInit() {
    this.postService.getPosts().subscribe(response => {
      this.posts = response.map(item => {
        return new Post(
          item.id, 
          item.title, 
          item.body
        )
      })
    })
  }

}
