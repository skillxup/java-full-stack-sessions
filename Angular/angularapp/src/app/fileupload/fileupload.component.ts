import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-fileupload',
  templateUrl: './fileupload.component.html',
  styleUrls: ['./fileupload.component.css']
})
export class FileuploadComponent implements OnInit {
  imageUrl: string;
  uploadForm: FormGroup;

  constructor(
    private fb: FormBuilder
  ) { 
    this.uploadForm = this.fb.group({
      avatar: [null], 
      name: ['']
    })
  }

  ngOnInit() {
  }

  showPreview(event) {
    const file = (event.target as HTMLInputElement).files[0];
    this.uploadForm.patchValue({
      avatar: file
    });
    this.uploadForm.get('avatar').updateValueAndValidity();

    // file preview
    const reader = new FileReader();
    reader.onload = () => {
      this.imageUrl = reader.result as string;
    }
    reader.readAsDataURL(file);
  }

  onSubmit() {
    console.log(this.uploadForm.value);
  }

}
