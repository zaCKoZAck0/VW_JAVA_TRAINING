
export class Book {
    id: number;
    name: string;
    author: string;
    url: String;


    constructor(bookid: number, bookname: string, bookauthor: string, url: String) {
        this.id = bookid;
        this.name = bookname;
        this.author = bookauthor;
        this.url = url;

    }

    getBook(): string {
        return 'bookid:' + this.id + ","
            + 'bookname:' + this.name + ","
            + 'bookurl:' + this.url + ","
            + 'bookauthor:' + this.author;
    }
}