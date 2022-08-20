
package com.portfolio.BackEnd.seguridad.servicio;

import com.portfolio.BackEnd.seguridad.Entity.Usuario;
import com.portfolio.BackEnd.seguridad.repositorio.IUsuarioRepositorio;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nicolas Herrera
 */

@Service
@Transactional
public class UsuarioServicio {
    
@Autowired
    IUsuarioRepositorio usuarioRepo;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return usuarioRepo.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario){
        return usuarioRepo.existsByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByEmail(String email){
        return usuarioRepo.existsByEmail(email);
    }
    
    public void save(Usuario usuario){
        usuarioRepo.save(usuario);
    }
}
