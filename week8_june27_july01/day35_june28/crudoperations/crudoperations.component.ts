import { Component, OnInit } from '@angular/core';
import { User } from './user.model';
import { UserService } from './user.service';

@Component({
  selector: 'app-crudoperations',
  templateUrl: './crudoperations.component.html',
  styleUrls: ['./crudoperations.component.css']
})
export class CrudoperationsComponent implements OnInit {
  users: User[];
  userForm: boolean;
  isNewUser: boolean;
  newUser: any = {};
  editUserForm: boolean;
  editedUser: any = {};

  constructor(private userService: UserService) { }

  ngOnInit() {
    this.users = this.getUsers();
  }

  getUsers(): User[] {
    return this.userService.getUsersFromData();
  }

  showEditUserForm(user: User) {
    if(!user) {
      this.userForm = false;
      return;
    }
    this.editUserForm = true;
    this.editedUser = user;
  }

  showAddUserForm() {
    if(this.users.length) {
      this.newUser = {};
    }
    this.userForm = true;
    this.isNewUser = true;
  }

  saveUser(user: User) {
    if(this.isNewUser) {
      this.userService.addUser(user);
    }
  }

  cancelNewUser() {
    this.newUser = {};
    this.userForm = false;
  }

  updateUser() {
    this.userService.updateUser(this.editedUser);
  }

  removeUser(user: User) {
    this.userService.deleteUser(user);
  }

  cancelEditUser() {
    this.editedUser = {};
    this.editUserForm = false;
  }

}
