import { Injectable } from '@angular/core';
import { InMemoryDbService } from 'angular-in-memory-web-api';

@Injectable()
export class InMemoryDataService implements InMemoryDbService {

  createDb() {
    const users = [
  { email:'rayhan@gmail.com', password:'Rayhan@123', pancardno:'RAYHA1313N'},
  { email:'naim@gmail.com', password:'Naim@123', pancardno:'NAIMA5195S'},
  { email:'shahu@gmail.com', password:'Shahu@123', pancardno:'SHAHU1234S'}
     ];
    return {users};
  }
  constructor() { }

}
