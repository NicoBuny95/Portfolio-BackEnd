/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BackEnd.servicio;

import com.portfolio.BackEnd.modelo.Proyecto;
import com.portfolio.BackEnd.repositorio.ProyectoRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nicolas Herrera
 */

@Service
public class ServicioProyecto implements IProyectoServicio{
    
        @Autowired ProyectoRepositorio proyRepo;

    @Override
    public List<Proyecto> mostrarProyectos() {
         return proyRepo.findAll(); 
    }

    @Override
    public void registrarProyecto(Proyecto pro) {
         proyRepo.save(pro);
    }
        
   

    @Override
    public Proyecto edit(Proyecto p) {
       return proyRepo.save(p);
    }
                
    public void borrarProyecto(Long id) {
        proyRepo.deleteById(id);
        
    }

 
    public boolean existsById(Long id) {
        return proyRepo.existsById(id);
    }
    
     public Optional<Proyecto> mostrarUno(Long id){
        return proyRepo.findById(id);
    }
    
}
