import { Component, OnInit } from '@angular/core';
import { User } from './user.model';
import { UserService } from './user.service';

@Component({
  selector: 'app-crudoperations',
  templateUrl: './crudoperations.component.html',
  styleUrls: ['./crudoperations.component.css']
})
export class CrudoperationsComponent implements OnInit {
  user: User[];
  userForm: boolean;
  isNewUser: boolean;
  newUser: any = {};
  editUserForm: boolean;
  editedUser: any = {};

  constructor() { }

  ngOnInit() {
  }

}
