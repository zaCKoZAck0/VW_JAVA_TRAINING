import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { BookdaoService } from '../bookdao.service';
import { Router } from '@angular/router';
import { Book } from '../model/Book';

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent implements OnInit {
  bookForm!: FormGroup;

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

    console.log(this.bookForm.value.name);

  }

  constructor(
    public fb: FormBuilder,
    private router: Router,
    public crudService: BookdaoService
  ) { }
  submitForm() {
    console.log('submit form called' + this.bookForm.value);
    this.crudService.addBook(this.bookForm.value).subscribe(res => {
      console.log('Book created!')
      this.router.navigateByUrl('/home')
    });

  }
}