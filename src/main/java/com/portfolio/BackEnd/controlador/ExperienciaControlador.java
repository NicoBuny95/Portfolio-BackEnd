
package com.portfolio.BackEnd.controlador;

import com.portfolio.BackEnd.DTO.ExperienciaDTO;
import com.portfolio.BackEnd.modelo.Experiencia;
import com.portfolio.BackEnd.segurity.DTO.Mensaje;
import com.portfolio.BackEnd.servicio.ServicioExperiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RequestMapping("/experiencias")
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://frontendportfolioproyecto.web.app")
@RestController
public class ExperienciaControlador {
    
    @Autowired ServicioExperiencia ExpServ; 
    
    @GetMapping("/ver")
	public List<Experiencia> listarTodasLasExpe() {
		return ExpServ.mostrarExperiencias();
	}
	

	
        @PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/Registrar")
	public ResponseEntity<?> agregarExperiencia( @RequestBody Experiencia Exp) {   
		 ExpServ.registrarExperiencia(Exp);
                 return new ResponseEntity(new Mensaje("Se agrego con exito"), HttpStatus.OK);
	}
    
        
    @GetMapping(path = {"/mostrar/{id}"})
     public ResponseEntity<Experiencia> getById(@PathVariable("id")int id){
        if(!ExpServ.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.BAD_REQUEST);
        } else {
        }
        
        Experiencia expe = ExpServ.mostrarUno(id).get();
        return new ResponseEntity(expe, HttpStatus.OK);
    
    }
     
     
     @PreAuthorize("hasRole('ADMIN')")  
     @PutMapping(path = {"/editar/{id}"})
      public ResponseEntity<?> modificar(@PathVariable("id") int id, @RequestBody ExperienciaDTO dtoexperiencia){
        if(!ExpServ.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        
        
        Experiencia expe = ExpServ.mostrarUno(id).get();
        
        expe.setCargoOcupado(dtoexperiencia.getCargoOcupado());
        expe.setLugar(dtoexperiencia.getLugar());
        expe.setComienzo(dtoexperiencia.getComienzo());
        expe.setFinalizacion(dtoexperiencia.getFinalizacion());
        expe.setDescripcion(dtoexperiencia.getDescripcion());
        expe.setImg_exp(dtoexperiencia.getImg_exp());
        
        ExpServ.edit(expe);
        
        return new ResponseEntity(new Mensaje("Educacion actualizada"), HttpStatus.OK);
    }


        
    @PreAuthorize("hasRole('ADMIN')") 
    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> eliminarExperiencia(@PathVariable("id") int id){
        if(!ExpServ.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        ExpServ.borrarExperiencia(id);
        return new ResponseEntity(new Mensaje("Educacion eliminada"), HttpStatus.OK);
    }
    }
    

