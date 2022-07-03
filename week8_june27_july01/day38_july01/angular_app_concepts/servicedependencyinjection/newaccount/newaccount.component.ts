import { Component, OnInit, EventEmitter, Output } from '@angular/core';
import { LoggingService } from '../logging.service';
import { AccountService } from '../account.service';

@Component({
  selector: 'app-newaccount',
  templateUrl: './newaccount.component.html',
  styleUrls: ['./newaccount.component.css']
})
export class NewaccountComponent implements OnInit {
  @Output() accountAdded = new EventEmitter<{name: string, status: string}>();

  constructor(
    private __loggingService: LoggingService, 
    private __accountService: AccountService
  ) {
    this.__accountService.statusUpdated.subscribe((status: string) => {
      alert(status);
    })
   }

   onCreateAccount(accountName: string, accountStatus: string) {
    this.__accountService.addAccount(accountName, accountStatus);
   }

  ngOnInit() {
  }

}
