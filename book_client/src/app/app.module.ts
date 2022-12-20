import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { ReactiveFormsModule } from '@angular/forms';
import { BookdaoService } from './bookdao.service';
import { CreateComponent } from './create/create.component';
import { UpdateComponent } from './update/update.component';
import { CrudRoutingModule } from './crud/crud.module';
import { HomeComponent } from './home/home.component';
import { SearchComponent } from './search/search.component';

@NgModule({
  declarations: [
    AppComponent,
    CreateComponent,
    UpdateComponent,
    HomeComponent,
    SearchComponent  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    CrudRoutingModule,
    ReactiveFormsModule,
    RouterModule
  ],
  providers: [
    BookdaoService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
