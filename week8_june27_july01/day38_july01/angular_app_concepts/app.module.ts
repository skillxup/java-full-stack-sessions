// modules
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';

// components
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
import { ReactiveformComponent } from './reactiveform/reactiveform.component';
import { FileuploadComponent } from './fileupload/fileupload.component';
import { CrudoperationsComponent } from './crudoperations/crudoperations.component';
import { RestapiComponent } from './restapi/restapi.component';
import { LazyloadingComponent } from './lazyloading/lazyloading.component';
import { Loadlazy1Component } from './lazyloading/loadlazy1/loadlazy1.component';
import { Loadlazy2Component } from './lazyloading/loadlazy2/loadlazy2.component';
import { ServicedependencyinjectionComponent } from './servicedependencyinjection/servicedependencyinjection.component';
import { AccountComponent } from './servicedependencyinjection/account/account.component';
import { NewaccountComponent } from './servicedependencyinjection/newaccount/newaccount.component';
import { AccountService } from './servicedependencyinjection/account.service';
import { LoggingService } from './servicedependencyinjection/logging.service';

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
    CapitalizePipe, 
    TemplatedrivenComponent, 
    ReactiveformComponent, 
    FileuploadComponent, 
    CrudoperationsComponent, 
    RestapiComponent, 
    LazyloadingComponent, 
    Loadlazy1Component, 
    Loadlazy2Component, 
    ServicedependencyinjectionComponent, 
    AccountComponent, 
    NewaccountComponent
  ],
  entryComponents: [
    Loadlazy1Component, 
    Loadlazy2Component
  ], 
  imports: [
    BrowserModule,
    AppRoutingModule, 
    FormsModule, 
    ReactiveFormsModule, 
    HttpClientModule
  ],
  providers: [
    AccountService, 
    LoggingService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
