/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BackEnd.controlador;

import com.portfolio.BackEnd.DTO.PersonaDTO;
import com.portfolio.BackEnd.modelo.Persona;
import com.portfolio.BackEnd.segurity.DTO.Mensaje;
import com.portfolio.BackEnd.servicio.ServicioPersona;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nicolas Herrera
 */


@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = {"https://frontendportfolioproyecto.web.app","http://localhost:4200"})
@RequestMapping("/personas")
public class PersonaControlador {
    
     @Autowired
    ServicioPersona servPer;

    @GetMapping("/lista")
    public ResponseEntity<List<Persona>> list() {
        List<Persona> list = servPer.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Persona> getById(@PathVariable("id") int id) {
        if (!servPer.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.BAD_REQUEST);
        }
        Persona persona = servPer.getOne(id).get();
        return new ResponseEntity(persona, HttpStatus.OK);
    }

    /*@DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!servPer.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        servPer.delete(id);
        return new ResponseEntity(new Mensaje(" eliminado"), HttpStatus.OK);
    }*/

    /*@PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody SkillDTO dtohys) {
        if (StringUtils.isBlank(dtohys.getSkillName())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (servPer.existsByNombre(dtohys.getSkillName())) {
            return new ResponseEntity(new Mensaje("Esa skill ya existe"), HttpStatus.BAD_REQUEST);
        }

        Skill hYs = new Skill(dtohys.getSkillName(), dtohys.getPicSkill(), dtohys.getPercent());
        servPer.save(hYs);

        return new ResponseEntity(new Mensaje("Skill agregada"), HttpStatus.OK);
    }*/

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody PersonaDTO dtopersona) {
        //Validamos si existe el ID
        if (!servPer.existsById(id)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        }
        //Compara nombre
        if (servPer.existsByNombre(dtopersona.getNombre()) && servPer.getByNombre(dtopersona.getNombre()).get()
                .getId() != id) {
            return new ResponseEntity(new Mensaje("Esta Persona ya existe"), HttpStatus.BAD_REQUEST);
        }
        //No puede estar vacio
        if (StringUtils.isBlank(dtopersona.getNombre())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        
        Persona persona = servPer.getOne(id).get();
        persona.setNombre(dtopersona.getNombre());
        persona.setApellido(dtopersona.getApellido());
        persona.setDescripcion(dtopersona.getDescripcion());
        persona.setImg(dtopersona.getImg());

        servPer.save(persona);
        return new ResponseEntity(new Mensaje("Persona actualizada"), HttpStatus.OK);

    }
}
