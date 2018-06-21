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

  // Set Validation for registration page
  registerform = new FormGroup({
  
  // Email field validation set a required and typed as email 
    email: new FormControl('', Validators.compose([
        Validators.required,
        Validators.email
        
    ])),
	
	// Password field validation set a required and set pattern which is accept password only 6 to 12 charecter with contain atleast one Upper case,lower case,number and special charecter
    password: new FormControl('', Validators.compose([
      Validators.required,
      Validators.pattern('(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[$@$!%*?&])[A-Za-z\d$@$!%*?&].{6,12}')
    ])),
	
	// Pancard field validation set as first five letter is text next four letter digit and last letter is text  
    pancardno: new FormControl('',Validators.compose([
      Validators.required,
      Validators.pattern('[A-Z]{5}[0-9]{4}[A-Z]{1}')
    ]))
  });


  // register function call when user click on register button
  register(){
		
	  // navigate to home page		
      this.route.navigate(['/home']);
  }

}
