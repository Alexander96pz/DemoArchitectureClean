import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Persona } from '../Modelo/Persona';

@Injectable({
  providedIn: 'root'
})

export class ServiceService {
  
  constructor(private http: HttpClient) {  }

  Url = 'http://localhost:8080/personas';

  getPersonas(){
    const path = `${this.Url}/`;
    return this.http.get<Persona[]>(path);
  }
  createPersona(persona: Persona){
    console.log(persona.id);
    console.log(persona.name);
    console.log(persona.apellidos);
    const path = `${this.Url}/`;
    return this.http.post<Persona>(this.Url, persona);
  }
}
