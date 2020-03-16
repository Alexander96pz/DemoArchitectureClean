/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Marlon.backend;

import com.Marlon.backend.domain.entities.Persona;
import java.util.List;

public interface PersonaService {
    List<Persona>listar();
    Persona listar(int id);
    Persona add(Persona p);
    Persona edit(Persona p);
    Persona delete(int id);
    
}
