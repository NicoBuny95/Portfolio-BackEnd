/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BackEnd.servicio;

import com.portfolio.BackEnd.modelo.Persona;
import com.portfolio.BackEnd.repositorio.PersonaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nicolas Herrera
 */
@Service
public class ServicioPersona implements IPersonaServicio{
    
    @Autowired PersonaRepositorio persoRepo;

    @Override
    public List<Persona> getPersona() {
      List<Persona> persona = persoRepo.findAll();
        return persona;  
    }

    @Override
    public void savePersona(Persona persona) {
        persoRepo.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = persoRepo.findById(id).orElse(null);
        return persona;
    }

    

}

    
    
