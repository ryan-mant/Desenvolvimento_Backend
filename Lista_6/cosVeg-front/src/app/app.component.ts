import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Cosmetico } from './models/Cosmetico';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'cosVeg-front';

  cosmeticos!: Cosmetico [];

  constructor(private http: HttpClient){

  }
  ngOnInit(): void {
    this.getCosmeticos();
  }
  getCosmeticos(){
    this.http.get<Cosmetico[]>('http://localhost:8080/cosmeticos').subscribe((response) =>{
      this.cosmeticos = response;
    })
  }
}
