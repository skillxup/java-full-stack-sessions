import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';
import { ProductsComponent } from './products/products.component';
import { ProductdetailComponent } from './productdetail/productdetail.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';
import { PipesComponent } from './pipes/pipes.component';
import { CapitalizePipe } from './pipes/capitalize.pipe';
import { TemplatedrivenComponent } from './templatedriven/templatedriven.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AboutComponent,
    ContactComponent,
    ProductsComponent,
    ProductdetailComponent,
    PagenotfoundComponent,
    PipesComponent, 
    CapitalizePipe, TemplatedrivenComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
