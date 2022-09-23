import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { SigninComponent } from './homepage/signin/signin.component';
import { SignupComponent } from './homepage/signup/signup.component';
import { AboutUsComponent } from './homepage/aboutus/aboutus.component';
import { HomepageComponent } from './homepage/homepage.component';
import { ContactusComponent } from './homepage/contactus/contactus/contactus.component';


const routes: Routes = [
{path:'',
component:HomepageComponent},
{path:'homepage',
component:HomepageComponent},
  {path:'signin',
component:SigninComponent},
{path:'signup',
component:SignupComponent},
{
  path:'aboutus',
  component:AboutUsComponent
},{

  path:'contactus',
  component:ContactusComponent

}];




@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
