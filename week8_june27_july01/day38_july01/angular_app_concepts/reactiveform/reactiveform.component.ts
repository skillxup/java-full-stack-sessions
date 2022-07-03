import { Component, ChangeDetectorRef, ElementRef, ViewChild } from '@angular/core';
import { FormBuilder, FormArray, Validators } from '@angular/forms';
import { ValidatePassword } from './validatepassword';

@Component({
  selector: 'app-reactiveform',
  templateUrl: './reactiveform.component.html',
  styleUrls: ['./reactiveform.component.css']
})
export class ReactiveformComponent {
  submitted = false;
  City: any = [
    'florida', 
    'south dakota', 
    'michigan'
  ]

  constructor(
    public fb: FormBuilder, 
    private cd: ChangeDetectorRef
  ) { }

  // registration form
  registrationForm = this.fb.group({
    
    file: [null], 

    fullName: this.fb.group({
      firstName: ['', [Validators.required, Validators.minLength(4), Validators.pattern('^[a-zA-Z ]+$')]], 

      lastName: ['', [Validators.required]], 
    }), 

    email: ['', [Validators.required, Validators.pattern('^[a-z0-9]+@[a-z]+\.[a-z]{2,3}$')]], 

    // phoneNumber: ['', [Validators.required, Validators.pattern('^\d{10}$')]], 
    phoneNumber: ['', [Validators.required]], 

    address: this.fb.group({
      street: ['', [Validators.required]], 
      // city: ['', [Validators.required]], 
      cityName: ['', [Validators.required]]
    }),

    gender: ['male'], 

    passwordValidation: this.fb.group({
      password: ['', [Validators.required]], 
      confirmPassword: ['', [Validators.required]] 
    }, {
      validator: ValidatePassword.MatchPassword
    }), 

    addDynamicElement: this.fb.array([])
  })

  // file upload
  @ViewChild('fileInput', {static: false}) el: ElementRef;
  imageUrl: any = '/assets/GoldenMedows.jpg';
  editFile: boolean = true;
  removeUpload: boolean = false;

  uploadFile(event) {
    let reader = new FileReader();
    let file = event.target.files[0];
    
    if(event.target.files && event.target.files[0]) {
      reader.readAsDataURL(file);
      reader.onload = () => {
        this.imageUrl = reader.result;
        console.log(this.imageUrl);
        this.registrationForm.patchValue({
          file: reader.result
        });
        this.editFile = false;
        this.removeUpload = true;
      }
      this.cd.markForCheck();
    }
  }

  // remove file upload
  removeUploadedFile() {
    let newFileList = Array.from(this.el.nativeElement.files);
    this.imageUrl = '/assets/GoldenMedows.jpg';
    this.editFile = true;
    this.removeUpload = false;
    this.registrationForm.patchValue({
      file: [null]
    });
  }

  get myForm() {
    return this.registrationForm.controls;
  }

  // choose city
  changeCity(e) {
    this.registrationForm.get('address.cityName').setValue(e.target.value, {
      onlySelf: true
    })
  }

  get addDynamicElement() {
    return this.registrationForm.get('addDynamicElement') as FormArray
  }

  addSuperPowers() {
    this.addDynamicElement.push(this.fb.control(''))
  }

  // submit form
  onSubmit() {
    this.submitted = true;
    if(!this.registrationForm.valid) {
      alert('please fill up the details');
      return false;
    } else {
      console.log(this.registrationForm.value);
    }
  }

}
