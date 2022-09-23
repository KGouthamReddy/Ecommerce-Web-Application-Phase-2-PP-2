import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-contactus',
  templateUrl: './contactus.component.html',
  styleUrls: ['./contactus.component.css']
})
export class ContactusComponent implements OnInit {
  genders = ['male', 'female'];
  defaultQuestion = 'pet';
  submitted = false;
  user = {
    username: '',
    email: '',
    secret: '',
    gender: '',
  };

  constructor() { }

  ngOnInit() {
  }

}
