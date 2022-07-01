import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Loadlazy2Component } from './loadlazy2.component';

describe('Loadlazy2Component', () => {
  let component: Loadlazy2Component;
  let fixture: ComponentFixture<Loadlazy2Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Loadlazy2Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Loadlazy2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
