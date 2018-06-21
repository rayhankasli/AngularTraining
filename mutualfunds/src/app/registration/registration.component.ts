import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FormGroup , FormControl ,Validators, NgForm} from '@angular/forms';
import { User } from '../user';
import { RegistrationService } from '../registration.service';


@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  users: User[]=new Array;

  constructor(private route : Router,private registrationService: RegistrationService) { }

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


  register(users: User): void{

  
    console.log("Email"+users);

    this.registrationService.addUser(users)
    .subscribe(user => 
      {this.users.push(user);
      console.log("Users Details "+user);
    });
      this.route.navigate(['/home']);
  }

}
