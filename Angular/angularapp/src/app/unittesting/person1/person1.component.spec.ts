import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Person1Component } from './person1.component';

describe('Person1Component', () => {
  let component: Person1Component;
  let fixture: ComponentFixture<Person1Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Person1Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Person1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should bind input text value to component property', () => {
    const hostElement = fixture.nativeElement;
    
    const nameInput: HTMLInputElement = hostElement.querySelector('#nameId');
    const ageInput: HTMLInputElement = hostElement.querySelector('#ageId');

    fixture.detectChanges();

    nameInput.value = '';
    ageInput.value = '';

    nameInput.dispatchEvent(new Event('input'));
    ageInput.dispatchEvent(new Event('input'));

    expect(component.personName).toBe("amish");
    expect(component.personAge).toBe("23");
  });

  it('should perform display binding in HTML template', () => {
    const hostElement = fixture.nativeElement;
    
    const nameInput: HTMLInputElement = hostElement.querySelector("#nameId");
    const ageInput: HTMLInputElement = hostElement.querySelector("#ageId");
    
    const displayName: HTMLInputElement = hostElement.querySelector("#disName");
    const displayAge: HTMLInputElement = hostElement.querySelector("#disAge");

    fixture.detectChanges();

    fixture.whenStable().then(val => {
      nameInput.value = "amish";
      ageInput.value = "23";

      nameInput.dispatchEvent(new Event("input"));
      ageInput.dispatchEvent(new Event("input"));

      fixture.detectChanges();

      expect(displayName.textContent).toBe("amish");
      expect(displayAge.textContent).toBe("23");

    });
  });


});
