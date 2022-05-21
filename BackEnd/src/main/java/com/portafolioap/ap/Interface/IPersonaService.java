
package com.portafolioap.ap.Interface;

import com.portafolioap.ap.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //Traer List Persona
    public List<Persona> getPersona();
    
    //Guardar obj tipo persona
    
    public void savePersona(Persona persona);
    
    //Eliminar objt x id
    
    public void deletePersona(Long id);
    
    //Buscar persona x id
    
    public Persona findPersona(Long id);
}
