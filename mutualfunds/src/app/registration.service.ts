import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable} from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';
import { User } from'./user';
import { MessageService } from './message.service';
import { of } from 'rxjs/observable/of';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class RegistrationService {

  
  private usersUrl = 'api/users';

  constructor(private http: HttpClient, private messageService: MessageService) { }


  getUsers (): Observable<User[]> {
   
    console.log("Registration Service")
    return this.http.get<User[]>(this.usersUrl)
      .pipe(
        tap(users => this.log(`fetched users`)),
        catchError(this.handleError('getUsers', []))
      );
  }


  addUser (user: User): Observable<User> {
    console.log("AddUser From Service"+user.email);
    return this.http.post<User>(this.usersUrl, user,  httpOptions).pipe(
      tap((user: User) => this.log(`added user w/ email=${user.email}`)),
      catchError(this.handleError<User>('addUser'))
    );
  }


  private handleError<T> (operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {
 
    
      console.error(error); 
 
    
      this.log(`${operation} failed: ${error.message}`);
 
      
      return of(result as T);
    };
  }

  private log(message: string) {
    this.messageService.add('UserService: ' + message);
  }

}
