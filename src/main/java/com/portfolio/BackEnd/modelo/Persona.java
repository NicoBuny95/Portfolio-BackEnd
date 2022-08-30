/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BackEnd.modelo;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Nicolas Herrera
 */
@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String apellido;
    
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String img;
    
     @Size(min = 1, max = 500, message = "no cumple con la longitud")
    private String descripcion;  
     
     
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
    private List<Educacion> educationList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
    private List<Experiencia> experienceListList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
    private List<Proyecto> projectList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idSkill")
    private List<Skill> skillsListList;

    public Persona() {
    }

    
    
    public Persona(String nombre, String apellido, String img, String descripcion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.img = img;
        this.descripcion = descripcion;
    }

     
    
    
    
}
