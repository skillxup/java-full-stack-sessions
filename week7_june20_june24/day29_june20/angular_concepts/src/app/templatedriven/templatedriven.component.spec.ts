import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TemplatedrivenComponent } from './templatedriven.component';

describe('TemplatedrivenComponent', () => {
  let component: TemplatedrivenComponent;
  let fixture: ComponentFixture<TemplatedrivenComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TemplatedrivenComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TemplatedrivenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
