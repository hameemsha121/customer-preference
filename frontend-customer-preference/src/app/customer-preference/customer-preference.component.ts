import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Customer } from '../model/customer-preference';
import { CustomerPreferenceService } from '../service/customer-preference.service';

@Component({
  selector: 'app-customer-preference',
  templateUrl: './customer-preference.component.html',
  styleUrls: ['./customer-preference.component.css']
})
export class CustomerPreferenceComponent implements OnInit {

  updateForm: FormGroup;
  customer: Customer = {} as Customer;

  constructor(private formBuilder: FormBuilder, private router: Router, private customerService: CustomerPreferenceService) { }

  ngOnInit() {
    this.updateForm = this.formBuilder.group({
      id: [''],
      name: ['', Validators.required],
      phone: ['', Validators.required],
      email: ['', Validators.required],
      homeAddress: ['', Validators.required],
      workAddress: ['', Validators.required],
      preferedContact: ['preferedContactHome', Validators.required],
      preferedAddress: ['preferedAddressPhone', Validators.required],
      preferedTime: ['preferedTimeMorning', Validators.required],
      deliverOnSunday: [''],
      offerUpdate: [''],
    });

    const id = localStorage.getItem('cusId');
    if (+id > 0) {
      this.customerService.getCustomerPrefernceById(+id).subscribe(customer => {
        this.updateForm.patchValue(customer);
      });
    }

  }

  updatePreference() {
    console.log(this.updateForm.value);
    // this.customer.createdBy=this.updateForm.get('name').value;
    // let date = new Date();
    // let dd=date.getDay();
    // let mm=date.getMonth();
    // {
    //   dd = '0' + dd;
    // }

    // if (mm < 10) {
    //   mm = '0' + mm;
    // }
    // let yyyy=date.getFullYear();
    // let today = yyyy+'-'+mm+'-'+dd;
    // this.customer.updated=today;
    // console.log(this.customer.updated);
    this.customerService.updateCustomerPreference(this.updateForm.value).subscribe(customer => {
      alert("Your preferences has been updated. Thank you!");
      localStorage.removeItem('cusId');
      this.router.navigate(['home']);
    });
  }

}
