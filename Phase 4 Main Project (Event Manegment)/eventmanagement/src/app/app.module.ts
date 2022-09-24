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
import { AccountsComponent } from './homepage/accounts/accounts.component';
import { AccountComponent } from './homepage/accounts/account/account.component';
import { NewaccountComponent } from './homepage/accounts/newaccount/newaccount.component';
import { AdminComponent } from './homepage/admin/admin.component';
import { PostsComponent } from './homepage/posts/posts.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';


@NgModule({
  declarations: [
    AppComponent,
    SigninComponent,
    SignupComponent,
    AboutUsComponent,
    HomepageComponent,
    ContactusComponent,
    AccountsComponent,
    AccountComponent,
    NewaccountComponent,
    AdminComponent,
    PostsComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
