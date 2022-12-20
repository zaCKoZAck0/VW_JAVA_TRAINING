import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Observable } from 'rxjs';
import { Book } from './model/Book';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class BookdaoService {

  private apiServerUrl = environment.apiBaseUrl;
  constructor(private http: HttpClient) { }

  public getBooks(): Observable<Book[]>{
      return this.http.get<Book[]>(`${this.apiServerUrl}/books/all`)
  }

  public addBook(book: Book): Observable<Book> {
    return this.http.post<Book>(`${this.apiServerUrl}/books/add`, book)
  }

  public updateBook(id:Number, book: Book): Observable<Book> {
    return this.http.put<Book>(`${this.apiServerUrl}/books/${id}`, book)
  }

  public deleteBook(id: Number): Observable<Book> {
    return this.http.delete<Book>(`${this.apiServerUrl}/books/${id}`)
  }

  public getBookById(id: Number): Observable<Book> {
    return this.http.get<Book>(`${this.apiServerUrl}/books/${id}`)
  }

  public getBookByQuery(query: String): Observable<Book[]> {
    return this.http.get<Book[]>(`${this.apiServerUrl}/books/search/${query}`)
  }

}

