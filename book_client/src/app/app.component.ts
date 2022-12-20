import { Component, OnInit } from '@angular/core';
import { Book } from './model/Book';
import { BookdaoService } from './bookdao.service';
import { HttpErrorResponse } from '@angular/common/http';
import { Router } from '@angular/router';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'book_client';
  bookForm!: FormGroup;

  
  constructor(private router: Router) { }
  ngOnInit(): void {
    this.bookForm = new FormGroup({
      query: new FormControl(''),
    })
  }

  public search() {
    console.log(this.bookForm.value)
    this.router.navigateByUrl(`/search/${this.bookForm.value?.query}`)
  }


}
