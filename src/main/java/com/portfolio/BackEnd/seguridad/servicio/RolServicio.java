/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BackEnd.seguridad.servicio;

import com.portfolio.BackEnd.seguridad.Entity.Rol;
import com.portfolio.BackEnd.seguridad.Enums.RolNombre;
import com.portfolio.BackEnd.seguridad.repositorio.IRolRepositorio;
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
public class RolServicio {
    
    @Autowired
    IRolRepositorio rolRepo;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepo.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        rolRepo.save(rol);
    }
}
    

