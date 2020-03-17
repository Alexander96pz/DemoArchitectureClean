/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Marlon.backend;

import com.Marlon.backend.Interfaces.PersonaService;
import com.Marlon.backend.domain.entities.Persona;
import com.Marlon.backend.domain.usecase.CrearPersona;
import com.Marlon.backend.persistence.repositorio.PersonaRepositorio;
import com.fasterxml.jackson.core.JsonParser;
import java.util.List;
import static org.eclipse.persistence.expressions.ExpressionOperator.Log;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.json.JSONObject;
/**
 *
 * @author ALEX
 */
//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
//@RequestMapping({"/personas"})
@Controller
public class Controlador {
    @Autowired
    
   // @GetMapping//(method=RequestMethod.GET)
    @RequestMapping(value="/personas",method = RequestMethod.GET)
    public List<Persona>listar(){
        PersonaService objPersonaService = new CrearPersona();
        PersonaRepositorio objPersonaRepositorio=new PersonaRepositorio(objPersonaService);
        return objPersonaRepositorio.listar();
    }
   // @PostMapping
    //@RequestBody Persona p   @ModelAttribute("Persona")Persona p
    @RequestMapping(value="/upersonas",method=RequestMethod.POST)
    public boolean agregar(@RequestBody String p){
        boolean g=false;
        try {
            JSONObject jsonObject = new JSONObject(p);
            PersonaService objPersonaService = new CrearPersona();
            objPersonaService.add(jsonObject);
            PersonaRepositorio objPersonaRepositorio=new PersonaRepositorio(objPersonaService);
            g=objPersonaRepositorio.addRepositorio();
        }catch (JSONException err){
            System.out.println("error transformacion");
        }
        return g;//service.add(p);
    }

     
    
    
    
    
    
}
