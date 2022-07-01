import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NewaccountComponent } from './newaccount.component';

describe('NewaccountComponent', () => {
  let component: NewaccountComponent;
  let fixture: ComponentFixture<NewaccountComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NewaccountComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NewaccountComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
