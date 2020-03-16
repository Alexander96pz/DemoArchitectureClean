/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Marlon.backend;

import com.Marlon.backend.domain.entities.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ALEX
 */
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/personas"})
public class Controlador {
    @Autowired
    PersonaService service;
    
    @GetMapping//(method=RequestMethod.GET)
    public List<Persona>listar(){
        System.out.println("aqui");
        return service.listar();
    }
     
}
