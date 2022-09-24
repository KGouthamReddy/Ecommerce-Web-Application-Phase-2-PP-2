import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { map } from 'rxjs/operators';
import { UserData } from './userdata.model';

@Component({
  selector: 'app-signuo',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css'],
})
export class SignupComponent implements OnInit {
  fetchedPosts: UserData[] = [];
  backendurl = 'http://localhost:3000/users';
  constructor(private http: HttpClient) {}

  ngOnInit(): void {
  
  }

  onCreateUser(postData: { email: string;name: string;passward: string;}, form: NgForm) {
    this.http.post(this.backendurl, postData).subscribe((response) => {
      form.reset();
      this.register()
    });
  }
  register(){
     alert("REGESTRATION SUCESSFULL")
  }  }
