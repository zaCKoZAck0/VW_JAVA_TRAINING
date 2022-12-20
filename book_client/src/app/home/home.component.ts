import { Component, OnInit } from '@angular/core';
import { Book } from '../model/Book';
import { BookdaoService } from '../bookdao.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  title = 'book_client';
  public books: Book[] = [];

  constructor(private router: Router, private booksService: BookdaoService) { }
  ngOnInit(): void {
    this.getBooks();
  }

  public delete(id: Number): void {
    this.booksService.deleteBook(id).subscribe((response: any) => {
      this.getBooks()
    });
  }

  public getBooks(): void {
    this.booksService.getBooks().subscribe(
      (response: Book[]) => {
        this.books = response;
      }
    );
  }

}
