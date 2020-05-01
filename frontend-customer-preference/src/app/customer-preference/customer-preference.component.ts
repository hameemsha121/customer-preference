import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-customer-preference',
  templateUrl: './customer-preference.component.html',
  styleUrls: ['./customer-preference.component.css']
})
export class CustomerPreferenceComponent implements OnInit {

  updateForm: FormGroup;
  id: String;

  constructor(private formBuilder: FormBuilder, private router: Router) { }

  ngOnInit() {
    this.updateForm = this.formBuilder.group({
      id: [''],
      name: ['',Validators.required],
      phone: ['',Validators.required],
      email: ['',Validators.required],
      homeAddress: ['',Validators.required],
      workAddress: ['',Validators.required],
      preferedContact: ['preferedContactHome',Validators.required],
      preferedAddress: ['preferedAddressPhone',Validators.required],
      preferedTime: ['preferedTimeMorning',Validators.required],
      deliverOnSunday: [''],
      offerUpdate: ['']
    });

    const id = localStorage.getItem('cusId');
    this.id = id.toString();

  }

  savePreference() {
    console.log(this.updateForm.value);
    alert("Your preferences has been updated. Thank you!")
    this.router.navigate(['home']);
    localStorage.removeItem('cusId');
  }

}
