import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes  } from '@angular/router';
import { FormsModule,ReactiveFormsModule  } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { HttpClientModule } from '@angular/common/http';
import { HttpClientInMemoryWebApiModule } from 'angular-in-memory-web-api';
import { InMemoryDataService } from './in-memory-data.service';


import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { RegistrationComponent } from './registration/registration.component';
import { HomeComponent } from './home/home.component';
import { RegistrationService } from './registration.service';
import { MessageService } from './message.service';

const AppRoutes: Routes=[
  {path:'' , component:LoginComponent },
  {path:'login' , component:LoginComponent },
  {path:'registration' , component:RegistrationComponent},
  {path:'home' , component:HomeComponent }
];


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegistrationComponent,
    HomeComponent,
   
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    ReactiveFormsModule ,
    RouterModule.forRoot(AppRoutes),
    HttpClientModule,
    HttpClientInMemoryWebApiModule.forRoot(
      InMemoryDataService, { dataEncapsulation: false }
    )
  ],
  providers: [RegistrationService,MessageService],
  bootstrap: [AppComponent]
})
export class AppModule { }
