import { ActivatedRoute } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { BookdaoService } from '../bookdao.service';
import { Router } from '@angular/router';
import { Book } from '../model/Book';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})

export class UpdateComponent implements OnInit {
  bookForm!: FormGroup;
  book: Book | undefined;

  ngOnInit() {
    this.bookForm = new FormGroup({
      name: new FormControl('', [
        Validators.required,
        Validators.minLength(4)
      ]),
      author: new FormControl('', [
        Validators.required,
        Validators.minLength(4)
      ]),
      url: new FormControl('')
    })
  }

  id: string | null | undefined;

  constructor(
    public fb: FormBuilder,
    private activatedRoute: ActivatedRoute,
    private router: Router,
    public crudService: BookdaoService
    ) {
    this.activatedRoute.params.subscribe(params => {
      console.log(params['id'])
      this.crudService.getBookById(params['id']).subscribe(res => {
        this.book = res;
        this.bookForm = new FormGroup({
          name: new FormControl(this.book?.name, [
            Validators.required,
            Validators.minLength(4)
          ]),
          author: new FormControl(this.book?.author, [
            Validators.required,
            Validators.minLength(4)
          ]),
          url: new FormControl(this.book.url)
        })
      })
    });
  
  }

  clear() {
    this.bookForm = new FormGroup({
      name: new FormControl(''),
      author: new FormControl(''),
      url: new FormControl('')
    })
  }

  submitForm() {
    console.log('submit form called' + this.bookForm.value);
    this.crudService.updateBook(this.book?.id as Number,this.bookForm.value).subscribe(res => {
      console.log('Book Updated!')
      this.router.navigateByUrl('/home')
    });

  }
}