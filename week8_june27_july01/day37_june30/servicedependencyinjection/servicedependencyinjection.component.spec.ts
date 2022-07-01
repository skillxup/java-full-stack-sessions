import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ServicedependencyinjectionComponent } from './servicedependencyinjection.component';

describe('ServicedependencyinjectionComponent', () => {
  let component: ServicedependencyinjectionComponent;
  let fixture: ComponentFixture<ServicedependencyinjectionComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ServicedependencyinjectionComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ServicedependencyinjectionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
