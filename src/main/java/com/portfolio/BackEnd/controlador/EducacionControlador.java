
package com.portfolio.BackEnd.controlador;

import com.portfolio.BackEnd.DTO.EducacionDTO;
import com.portfolio.BackEnd.modelo.Educacion;
import com.portfolio.BackEnd.segurity.DTO.Mensaje;
import com.portfolio.BackEnd.servicio.ServicioEducacion;
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


@RequestMapping("/educacion")
@CrossOrigin(origins = "https://frontendportfolioproyecto.web.app")
@RestController
public class EducacionControlador {
    
    @Autowired ServicioEducacion EduServ; 


   
	@GetMapping("/ver")
	public List<Educacion> listarTodosLosEstudios() {
		return EduServ.mostrarEstudios();
	}
	

	
        @PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/Registrar")
	public String agregarEstudio( @RequestBody Educacion Edu) {   
		 EduServ.registrarEstudios(Edu);
                 return "Se agrego con exito";
	}
        
    @GetMapping(path = {"/mostrar/{id}"})
     public ResponseEntity<Educacion> getById(@PathVariable("id")int id){
        if(!EduServ.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.BAD_REQUEST);
        } else {
        }
        
        Educacion educacion = EduServ.mostrarUno(id).get();
        return new ResponseEntity(educacion, HttpStatus.OK);
    
    }
     @PreAuthorize("hasRole('ADMIN')")  
     @PutMapping(path = {"/editar/{id}"})
      public ResponseEntity<?> modificar(@PathVariable("id") int id, @RequestBody EducacionDTO dtoeducacion){
        if(!EduServ.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        
        
        Educacion educacion = EduServ.mostrarUno(id).get();
        
        educacion.setTitulo(dtoeducacion.getTitulo());
        educacion.setInstitucion(dtoeducacion.getInstitucion());
        educacion.setUbicacion(dtoeducacion.getUbicacion());
        educacion.setFechaIn(dtoeducacion.getFechaIn());
        educacion.setFechaFin(dtoeducacion.getFechaFin());
        educacion.setImg_edu(dtoeducacion.getImg_edu());
        EduServ.edit(educacion);
        
        return new ResponseEntity(new Mensaje("Educacion actualizada"), HttpStatus.OK);
    }


        
    @PreAuthorize("hasRole('ADMIN')")   
    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> eliminarEstudios(@PathVariable("id") int id){
        if(!EduServ.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        EduServ.borrarEstudios(id);
        return new ResponseEntity(new Mensaje("Educacion eliminada"), HttpStatus.OK);
    }
    }