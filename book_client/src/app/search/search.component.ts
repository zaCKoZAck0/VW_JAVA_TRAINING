import { ActivatedRoute } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup } from '@angular/forms';
import { BookdaoService } from '../bookdao.service';
import { Router } from '@angular/router';
import { Book } from '../model/Book';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {

  books: Book[] = [];
  booksService: any;
  constructor(private activatedRoute: ActivatedRoute,
    private router: Router,
    public crudService: BookdaoService) { 
    this.activatedRoute.params.subscribe(params => {
      console.log(params['term']);
      this.crudService.getBookByQuery(params['term']).subscribe(res => {
        this.books = res;
      })
    });
  }

  public delete(id: Number): void {
    this.crudService.deleteBook(id).subscribe((response: any) => {
      console.log("Book deleted")
      this.router.navigateByUrl(`/home`)

    });
  }

  ngOnInit(): void {
  }

}
