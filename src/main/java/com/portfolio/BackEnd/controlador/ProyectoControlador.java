/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BackEnd.controlador;


import com.portfolio.BackEnd.DTO.ProyectoDTO;
import com.portfolio.BackEnd.modelo.Proyecto;
import com.portfolio.BackEnd.segurity.DTO.Mensaje;
import com.portfolio.BackEnd.servicio.ServicioProyecto;
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

/**
 *
 * @author Nicolas Herrera
 */

@RequestMapping("/Proyectos")
@CrossOrigin(origins = "https://frontendportfolioproyecto.web.app")
@RestController
public class ProyectoControlador {
    
    @Autowired ServicioProyecto ProyServ;
    
    
    @GetMapping("/ver")
	public List<Proyecto> listarTodosLosProyectos() {
		return ProyServ.mostrarProyectos();
	}
	

	
        @PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/Registrar")
	public String agregarProyecto( @RequestBody Proyecto proy) {   
		 ProyServ.registrarProyecto(proy);
                 return "Se agrego con exito";
	}
    
        
    @GetMapping(path = {"/mostrar/{id}"})
     public ResponseEntity<Proyecto> getById(@PathVariable("id")Long id){
        if(!ProyServ.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.BAD_REQUEST);
        } else {
        }
        
        Proyecto proy = ProyServ.mostrarUno(id).get();
        return new ResponseEntity(proy, HttpStatus.OK);
    
    }
     
     
     @PreAuthorize("hasRole('ADMIN')")  
     @PutMapping(path = {"/editar/{id}"})
      public ResponseEntity<?> modificar(@PathVariable("id") Long id, @RequestBody ProyectoDTO dtoProyecto){
        if(!ProyServ.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        
        
        Proyecto proy = ProyServ.mostrarUno(id).get();
        
        proy.setNombre(dtoProyecto.getNombre());
        proy.setDescripcion(dtoProyecto.getDescripcion());
        
        ProyServ.edit(proy);
        
        return new ResponseEntity(new Mensaje("Proyecto actualizado"), HttpStatus.OK);
    }


        
    @PreAuthorize("hasRole('ADMIN')") 
    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> eliminarEstudios(@PathVariable("id") Long id){
        if(!ProyServ.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        ProyServ.borrarProyecto(id);
        return new ResponseEntity(new Mensaje("Proyecto eliminado"), HttpStatus.OK);
    }
    
}
