import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';
import { ProductsComponent } from './products/products.component';
import { ProductdetailComponent } from './productdetail/productdetail.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';
import { PipesComponent } from './pipes/pipes.component';
import { TemplatedrivenComponent } from './templatedriven/templatedriven.component';

const routes: Routes = [
  { path: '', redirectTo: '/home', pathMatch: 'full' }, 
  { path: 'home', component: HomeComponent }, 
  { path: 'about', component: AboutComponent }, 
  { path: 'contact', component: ContactComponent }, 
  { path: 'products', component: ProductsComponent }, 
  { path: 'product-detail/:name', component: ProductdetailComponent }, 
  { path: 'pipes', component: PipesComponent }, 
  { path: 'templateform', component: TemplatedrivenComponent }, 
  { path: '**', component: PagenotfoundComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
