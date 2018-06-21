import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FormGroup , FormControl ,Validators, NgForm} from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {


  constructor(private route : Router) {
    
  }

  ngOnInit() {
  }

	// Set Validation for login page
	form = new FormGroup({
	
	// Email field validation set a required and typed as email 
    email: new FormControl('', Validators.compose([
      Validators.required,
      Validators.email
    ])),
	
	// Password field validation set a required 
    password: new FormControl('', Validators.required)
	
  });


  // login function which is active when user click on login button of login.html page 
  login()
  {
    let email =  this.form.value.email;
    let password =  this.form.value.password;

    if(email=="rayhan@gmail.com" && password=="123456")
    {
          this.route.navigate(['/home']);
    }
    else
    {
      console.log("Authentication fail");
    }
    
  }

}
