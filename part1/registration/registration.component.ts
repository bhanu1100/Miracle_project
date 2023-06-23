import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';
import { LoginserviceService } from '../loginservice.service';
interface City {
  name: string;
  code: string;
}

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {
  public postJsonvalue:any;

  // constructor(private http:HttpClient, private route:Router, public b:LoginserviceService){
    
  // }
  disabled:boolean=true
  ingredient!: string;
  cities: City[] | any

  selectedCity: City | undefined;
  myForm!: FormGroup;
  
  ngOnInit() {
    // this.postMethod();
    this.cities = [
      { name: 'Prakasam ', code: 'PKM' },
      { name: 'Chittoor', code: 'CTR' },
      { name: ' East Godavari ', code: 'EG' },
      { name: 'Guntur', code: 'GTR' },
      { name: 'Anantapur', code: 'ATP' },
      { name: 'Nellore', code: 'NLR' },
      { name: 'Krishna', code: 'KRS' },
      { name: 'Kurnool', code: 'KRL' },
      { name: ' YSR District ', code: 'KDP' },
      { name: 'Srikakulam', code: 'SKL' },
      { name: 'Visakhapatnam', code: 'VSKP' },
      { name: 'Vizianagaram', code: 'VZM' },
      { name: ' West Godavari ', code: 'WG' }

  ];
    
    // Initialize the form controls and validators
  //   this.myForm = new FormGroup({
  //     FirstName: new FormControl('', Validators.required),
  //     LastName: new FormControl('', Validators.required),
  //     email: new FormControl('', [Validators.required, Validators.email]),
  //     phoneNo:new FormControl( ['', [Validators.required, Validators.pattern(/^\d{10}$/)]]),
  //     city:new FormControl(['', Validators.required]),
  //     password:new FormControl (['', [Validators.required ,Validators.minLength(6),Validators.pattern(/^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]+$/)
  //     ]]),
  //   });
  // }

  
  // onSubmit() {
  //   if (this.myForm.valid) {
  //     console.log(this.myForm.value);
  //     // this.myForm.reset();
  //   }
   
  // }
//   categories: any[] = [
//     { name: 'Male', key: 'A' },
//     { name: 'Female', key: 'M' }
// ];
 
// get firstname()
//   {
//   return this.myForm.get('firstname');
//   }
//   get lastname()
//   {
//   return this.myForm.get('lastname');
//   }
//   get email()
//   {
//   return this.myForm.get('email');
//   }
//   get phno()
//   {
//   return this.myForm.get('phno');
//   }
//   get password()
//   {
//   return this.myForm.get('password');
//   }
//   get city()
//   {
//   return this.myForm.get('city');
//   }

// submit(){
//   console.log(this.myForm.value);
//   let newdata1={
//     "firstname":this.myForm.controls['firstname'].value,
//     "lastname":this.myForm.controls['lastname'].value,
//     "phno":this.myForm.controls['phno'].value,
//     "email":this.myForm.controls['email'].value,
//     "password":this.myForm.controls['password'].value,
//     "city":this.myForm.controls['city'].value
//     }
//   console.log(newdata1)
//   alert("Successfully Registered");
  
//   this.b.PostData(newdata1).subscribe((res: any)=>
//   {
//     console.log(res);
 
//   })
//   this.route.navigate(['login'])
// }

}
// myForm!: FormGroup;

constructor(public router:Router,public b :LoginserviceService,public fb: FormBuilder){
  this.myForm = this.fb.group({
      firstname:new FormControl('',[Validators.required,Validators.minLength(5),Validators.maxLength(12)]),
  lastname:new FormControl('',[Validators.required,Validators.minLength(5),Validators.maxLength(12)]),
  phno:new FormControl('',[Validators.required,Validators.minLength(10),Validators.maxLength(12),Validators.required, Validators.pattern("^((\\+91-?)|0)?[0-9]{10}$")]),

  email:new FormControl('',[Validators.required,Validators.minLength(5),Validators.maxLength(22),Validators.email]),
password:new FormControl('',[Validators.required,Validators.minLength(4),Validators.maxLength(12)]),
city:new FormControl('',[Validators.required,Validators.minLength(3),Validators.maxLength(22)]),


});
}
get firstname()
{
return this.myForm.get('firstname');
}
get lastname()
{
return this.myForm.get('lastname');
}
get email()
{
return this.myForm.get('email');
}
get phno()
{
return this.myForm.get('phno');
}
get password()
{
return this.myForm.get('password');
}
get city()
{
return this.myForm.get('city');
}


submit(){
console.log(this.myForm.value);
let newdata1={
  "firstname":this.myForm.controls['firstname'].value,
  "lastname":this.myForm.controls['lastname'].value,
  "phno":this.myForm.controls['phno'].value,
  "email":this.myForm.controls['email'].value,
  "password":this.myForm.controls['password'].value,
  "city":this.myForm.controls['city'].value
  }
console.log(newdata1)
alert("Successfully Registred");

this.b.PostData(newdata1).subscribe((res: any)=>
{
  console.log(res);

})
this.router.navigate(['login'])
}
}
