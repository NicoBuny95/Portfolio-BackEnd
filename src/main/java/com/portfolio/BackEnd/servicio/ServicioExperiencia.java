
package com.portfolio.BackEnd.servicio;

import com.portfolio.BackEnd.modelo.Experiencia;
import com.portfolio.BackEnd.repositorio.ExperienciaRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ServicioExperiencia implements IExperienciaServicio {
    
    
    @Autowired ExperienciaRepositorio ExpRep;

    @Override
    public List<Experiencia> mostrarExperiencias() {
         return ExpRep.findAll();
    }

    @Override
    public void registrarExperiencia(Experiencia Exp) {
         ExpRep.save(Exp);
    }

    public void borrarExperiencia(int id) {
        ExpRep.deleteById(id);
        
    }

 
    public boolean existsById(int id) {
        return ExpRep.existsById(id);
    }
    
    
    @Override
    public Experiencia edit(Experiencia e) {
        return ExpRep.save(e);
    }
    
    public Optional<Experiencia> mostrarUno(int id){
        return ExpRep.findById(id);
    }
    
}
