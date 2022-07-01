import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LazyloadingComponent } from './lazyloading.component';

describe('LazyloadingComponent', () => {
  let component: LazyloadingComponent;
  let fixture: ComponentFixture<LazyloadingComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LazyloadingComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LazyloadingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
