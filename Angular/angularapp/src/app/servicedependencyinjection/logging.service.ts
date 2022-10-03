import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoggingService {

  constructor() { }

  logStatusChange(status: string) {
    console.log(`the status of an account is either added newly or updated to the new status: ${status}`);
  }
}
