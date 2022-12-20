import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateComponent } from '../create/create.component';
import { AppComponent } from '../app.component';
import { UpdateComponent } from '../update/update.component';
import { HomeComponent } from '../home/home.component';
import { SearchComponent } from '../search/search.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  {path:'search/:term', component: SearchComponent},
  { path: 'create', component: CreateComponent },
  { path: 'update/:id', component: UpdateComponent },
  { path: 'home', redirectTo: '', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class CrudRoutingModule { }
