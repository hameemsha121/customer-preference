import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  idForm: FormGroup;

  constructor(private router: Router, private formBuilder: FormBuilder) { }

  ngOnInit() {
    this.idForm = this.formBuilder.group({
      id: ['', Validators.required]
    })
  }

  login() {
    console.log(this.idForm.value);
    localStorage.removeItem('cusId');
    localStorage.setItem('cusId',this.idForm.controls.id.value);
    this.router.navigate(["customer-preference"]);
  }

}
