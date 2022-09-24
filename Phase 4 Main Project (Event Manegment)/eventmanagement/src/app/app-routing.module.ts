import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { SigninComponent } from './homepage/signin/signin.component';
import { SignupComponent } from './homepage/signup/signup.component';
import { AboutUsComponent } from './homepage/aboutus/aboutus.component';
import { HomepageComponent } from './homepage/homepage.component';
import { ContactusComponent } from './homepage/contactus/contactus/contactus.component';
import { AccountsComponent } from './homepage/accounts/accounts.component';
import { AdminComponent } from './homepage/admin/admin.component';
import { PostsComponent } from './homepage/posts/posts.component';


const routes: Routes = [
{path:'',component:HomepageComponent},
{path:'homepage',component:HomepageComponent},
  {path:'signin',component:SigninComponent},
{path:'signup',component:SignupComponent},
{path:'aboutus', component:AboutUsComponent},
{ path:'contactus',component:ContactusComponent},
{ path:'accounts',component:AccountsComponent},
{ path:'admin',component:AdminComponent},
{ path:'posts',component:PostsComponent}
];




@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
