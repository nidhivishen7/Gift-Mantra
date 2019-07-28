 
import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
import { Registration } from '../registration';
import { AuthServiceService } from '../authservice.service';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
// export class LoginComponent implements OnInit {
  

//   constructor(private router:Router) { 
    
//   }

//   ngOnInit() {
    
//   }
//   public home(){
//     this.router.navigate(['/home']);

// }
// public register(){
//   this.router.navigate(['/register']);
// }
// }


// import { Component, OnInit } from '@angular/core';
// import{Registration} from '../registration';

// import { AuthServiceService } from '../authservice.service';
// import { Router } from '@angular/router';


// @Component({
//   selector: 'app-login',
//   templateUrl: './login.component.html',
//   styleUrls: ['./login.component.css']
// })
export class LoginComponent implements OnInit {
  fpComment:string;
  fpMail:String;
  mail:String;
  pass:String;
  x:Registration;
  token:string;

  constructor(private router:Router, private authService:AuthServiceService) {

    this.x=new Registration();
    this.x.userID=0;
    this.x.userFirstName="";
    this.x.userLastName="";
    this.x.emailId="";
    this.x.gender="";
    this.x.contact="";
    this.x.city="";
    this.x.state="";
    this.x.password="";
    this.x.zip="";
    this.x.country="";
    this.x.address1="";
    this.x.address2="";
    this.mail="";
    this.pass="";
   }
  
  ngOnInit() {
    this.fpComment=null;
  }

  public login(){
    this.fpComment=null;
    console.log(this.mail+""+this.pass);
     this.authService.loginCall(this.mail,this.pass).subscribe( (data )=> {
      console.log(data) ; 
      this.x=data;
      this.authService.usr=data;
     
      if(this.x.userID!=0){
        
        this.token="user-"+this.x.userID;
        sessionStorage.setItem("token" , this.token);
        sessionStorage.setItem("user" , this.x.emailId);
        sessionStorage.setItem('userid',this.x.userID+'');
        
        console.log(sessionStorage.getItem("token")) ; 
        this.router.navigate(['/home']);
      }
      else{
        this.mail = null;
        this.pass = null;
        this.fpComment="Please enter valid details ";
      }
     
    });

     
  }

  public getPassword(){
    
    this.authService.getPassword(this.fpMail).subscribe( (data :any)=> {
     console.log(data);
      this.fpComment=data.fpresult;
      console.log(this.fpComment);
    })
}

}


