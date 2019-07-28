import { Injectable } from '@angular/core';
import {Registration} from './registration';
import { Observable,BehaviorSubject} from 'rxjs';
import { HttpClient,HttpParams } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class AuthServiceService {
 /*...................result properties....................*/

  usr:Registration;

  user = new BehaviorSubject('');
  logoutcheck = new BehaviorSubject('');




  uri = 'http://localhost:8099';
  constructor(private mac :HttpClient) { }

  loginCall(x :String,y:String) :Observable<Registration>{
    console.log(x+""+y);
    let urilink="/log?x="+x+"&y="+y; 
    
    return this.mac.get<Registration>(this.uri+urilink);

}


/** getResult(x:String):Observable<Result>{

  let urilink="/result?n="+x;
  return this.mac.get<Result>(this.uri+urilink);
}

getAllSubjects(x:String):Observable<Subject>{

  let urilink="/SubMs?n="+x;
  return this.mac.get<Subject>(this.uri+urilink);
}


getAllQuestions(x:String,y:String):Observable<Question>{

  let urilink="/getquestion?u="+x+"&s="+y;
  return this.mac.get<Question>(this.uri+urilink);
}
*/
  setHeaderContent(user:string){
    this.user.next(user);
    
  }
  setHeaderLogout(logout:string){
    this.logoutcheck.next(logout);
    
  }

  getPassword(x :String) {
    
    let urilink="/getPassword?x="+x; 
    
    return this.mac.get(this.uri+urilink);

}

getProfile(x :String) :Observable<Registration>{
    
  let urilink="/getProfile?x="+x; 
  
  return this.mac.get<Registration>(this.uri+urilink);

}

UpdateProfile(x:Registration) :Observable<Registration>{
    
  let urilink="/updProfile"; 
 
  return this.mac.post<Registration>(this.uri+urilink,x);

}
storeResult(cor :String,per:Number,res:String,uid:Number,wans:Number,date:String) {
    
  let urilink="/storeResult?cor="+cor+"&per="+per+"&res="+res+"&uid="+uid+"&wans="+wans+"&date="+date; 
  
  return this.mac.get(this.uri+urilink);

}
}
