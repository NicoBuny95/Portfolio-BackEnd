
package com.portfolio.BackEnd.servicio;

import com.portfolio.BackEnd.modelo.Educacion;
import com.portfolio.BackEnd.repositorio.EducacionRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServicioEducacion implements IEducacion {

    @Autowired EducacionRepositorio EduRep;
    
    
    @Override
    public List<Educacion> mostrarEstudios() {
        return EduRep.findAll();
    }

    @Override
    public void registrarEstudios(Educacion Edu) {
            EduRep.save(Edu);
    }

    
    public void borrarEstudios(int id) {
        EduRep.deleteById(id);
        
    }

 
    public boolean existsById(int id) {
        return EduRep.existsById(id);
    }

    

    @Override
    public Educacion edit(Educacion e) {
         return EduRep.save(e);
    }

   public Optional<Educacion> mostrarUno(int id){
        return EduRep.findById(id);
    }
    

   
}