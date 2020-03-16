import { Component, OnInit } from '@angular/core';
import { Persona } from 'src/app/Modelo/Persona';
import { Router } from '@angular/router';
import { ServiceService } from 'src/app/Service/service.service';


@Component({
  selector: 'app-listar',
  templateUrl: './listar.component.html',
  styleUrls: ['./listar.component.css']
})
export class ListarComponent implements OnInit {
  personas: Persona[];
  constructor(private http: ServiceService, private router: Router) { }

  ngOnInit() {
    this.http.getPersonas().subscribe(data => {
      this.personas = data;
      console.log(data);
    });
  }

}
