package com.portafolioap.ap.Security.Service;

import com.portafolioap.ap.Security.Entity.Usuario;
import com.portafolioap.ap.Security.Repository.iUsuarioRepository;
import java.util.Optional;
import javax.persistence.Entity;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    iUsuarioRepository iusuarioRepository;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.existsByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByEmail(String email){
        return iusuarioRepository.existsByEmail(email);
    }
    
public void save(Usuario usuario) {
  try {        
    iusuarioRepository.save(usuario);
  } catch(Exception err) {
    err.printStackTrace();
  }
}
}

