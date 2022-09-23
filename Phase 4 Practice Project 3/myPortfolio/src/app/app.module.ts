import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SigninComponent } from './homepage/signin/signin.component';
import { SignupComponent } from './homepage/signup/signup.component';
import { AboutUsComponent } from './homepage/aboutus/aboutus.component';
import { HomepageComponent } from './homepage/homepage.component';
import { ContactusComponent } from './homepage/contactus/contactus/contactus.component';
import { Routes } from '@angular/router';


@NgModule({
  declarations: [
    AppComponent,
    SigninComponent,
    SignupComponent,
    AboutUsComponent,
    HomepageComponent,
    ContactusComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
