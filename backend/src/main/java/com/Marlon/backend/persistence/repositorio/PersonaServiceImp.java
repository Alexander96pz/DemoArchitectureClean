/*
 * aqui van todos lps metodos de la interfaz persona
 */
package com.Marlon.backend.persistence.repositorio;


import com.Marlon.backend.PersonaService;
import com.Marlon.backend.domain.entities.Persona;
import com.Marlon.backend.persistence.controllers.PersonasdbJpaController;
import com.Marlon.backend.persistence.entities.Personasdb;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Persistence;
import org.springframework.stereotype.Service;

/**
 *
 * @author ALEX
 */
@Service //anotaciones 
public class PersonaServiceImp implements PersonaService{

    @Override
    public List<Persona> listar() {
        PersonasdbJpaController objContUsu= new PersonasdbJpaController(Persistence.createEntityManagerFactory("com.Marlon_backend_jar_0.0.1-SNAPSHOTPU"));
        List<Personasdb> personadb=objContUsu.findPersonasdbEntities();
        List<Persona> ObjListPersona= new ArrayList<Persona>();
        for (Personasdb personasdb : personadb) {
            Persona objPersona= new Persona(personasdb.getId(),personasdb.getName(),personasdb.getApellidos());
            ObjListPersona.add(objPersona);
        }
        
        
        return ObjListPersona; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Persona listar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Persona add(Persona p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Persona edit(Persona p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Persona delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
    
    
}
//@Autowired //anotacion de tipo Repository
//    private PersonaRepositorio repositorio;
//    
//    
//    @Override
//    public List<Personas> listar() {
//        return repositorio.finAll(); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public Persona listar(int id) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public Persona add(Persona p) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public Persona edit(Persona p) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public Persona delete(int id) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    