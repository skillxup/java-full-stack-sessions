import { Injectable } from "@angular/core";
import { User } from "./user.model";

@Injectable({
    providedIn: 'root'
})

export class UserService {
    private upersons: User[] = [
        { id: 1, fullname: 'adam', emailaddress: 'adam@gmail.com' }, 
        { id: 2, fullname: 'peter', emailaddress: 'peter@gmail.com' }, 
        { id: 3, fullname: 'david', emailaddress: 'david@gmail.com' }
    ];

    constructor() {}

    
}