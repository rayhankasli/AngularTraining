import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FormGroup , FormControl ,Validators, NgForm} from '@angular/forms';


@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  constructor(private route : Router) { }

  ngOnInit() {
  }

  registerform = new FormGroup({
    email: new FormControl('', Validators.compose([
        Validators.required,
        Validators.email
        
    ])),
    password: new FormControl('', Validators.compose([
      Validators.required,
      Validators.pattern('(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[$@$!%*?&])[A-Za-z\d$@$!%*?&].{6,12}')
    ])),
    pancardno: new FormControl('',Validators.compose([
      Validators.required,
      Validators.pattern('[A-Z]{5}[0-9]{4}[A-Z]{1}')
    ]))
  });


  register(){
      this.route.navigate(['/home']);
  }

}
