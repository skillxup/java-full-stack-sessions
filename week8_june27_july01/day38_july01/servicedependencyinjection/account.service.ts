import { Injectable, EventEmitter } from '@angular/core';
import { LoggingService } from './logging.service';

@Injectable({
  providedIn: 'root'
})
export class AccountService {
  accounts = [
    { name: 'master account', status: 'active' }, 
    { name: 'test account', status: 'inactive' }, 
    { name: 'hidden account', status: 'unknown' } 
  ];

  statusUpdated = new EventEmitter<string>();
  constructor(
    private __loggingService: LoggingService
  ) { }

  addAccount(name: string, status: string) {
    this.accounts.push({name: name, status: status});
    this.__loggingService.logStatusChange(status);
  }

  updateStatus(id: number, status: string) {
    this.accounts[id].status = status;
    this.__loggingService.logStatusChange(status);
  }

}
