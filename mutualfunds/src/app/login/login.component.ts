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

  form = new FormGroup({
    email: new FormControl('', Validators.compose([
      Validators.required,
      Validators.email
    ])),
    password: new FormControl('', Validators.required)
  });
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
