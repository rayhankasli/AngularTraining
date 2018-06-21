import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { RegistrationService } from '../registration.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  users: User[]; 

  constructor(private registrationService: RegistrationService ) { }

  ngOnInit() {
    this.getUsers();
  }

  getUsers(): void {
    
    console.log("get user");
    this.registrationService.getUsers()
    .subscribe(users => this.users = users);
    console.log("Finish");
  }


}
