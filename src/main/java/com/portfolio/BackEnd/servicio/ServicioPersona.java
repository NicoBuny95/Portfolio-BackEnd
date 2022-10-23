/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BackEnd.servicio;

import com.portfolio.BackEnd.modelo.Persona;
import com.portfolio.BackEnd.repositorio.PersonaRepositorio;
import java.util.List;
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
public class ServicioPersona {
    
    @Autowired PersonaRepositorio persoRepo;

    public List<Persona> list(){
        return persoRepo.findAll();
    }
    
    public Optional<Persona> getOne(int id){
        return persoRepo.findById(id);
    }
    
    public Optional<Persona> getByNombre(String nombre){
        return persoRepo.findByNombre(nombre);
    }
    
    public void save(Persona persona){
        persoRepo.save(persona);
    }
    
    public void delete(int id){
        persoRepo.deleteById(id);
    }
    
    public boolean existsById(int id){
        return persoRepo.existsById(id);
    }
    
    public boolean existsByNombre(String nombre){
        return persoRepo.existsByNombre(nombre);
    }

  
}

    
    
