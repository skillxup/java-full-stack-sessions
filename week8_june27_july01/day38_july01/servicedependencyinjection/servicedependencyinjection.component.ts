import { Component, OnInit } from '@angular/core';
import { AccountService } from './account.service';
import { LoggingService } from './logging.service';

@Component({
  selector: 'app-servicedependencyinjection',
  templateUrl: './servicedependencyinjection.component.html',
  styleUrls: ['./servicedependencyinjection.component.css'], 
  providers: [LoggingService]
})
export class ServicedependencyinjectionComponent implements OnInit {
  accounts: {
    name: string, 
    status: string
  }[] = [];

  constructor(
    private __loggingService: LoggingService, 
    private __accountService: AccountService
  ) { }

  ngOnInit() {
    this.accounts = this.__accountService.accounts;
  }

}
