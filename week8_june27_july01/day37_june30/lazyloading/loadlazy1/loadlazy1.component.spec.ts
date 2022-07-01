import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Loadlazy1Component } from './loadlazy1.component';

describe('Loadlazy1Component', () => {
  let component: Loadlazy1Component;
  let fixture: ComponentFixture<Loadlazy1Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Loadlazy1Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Loadlazy1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
