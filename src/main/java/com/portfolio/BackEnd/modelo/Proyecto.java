/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BackEnd.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Nicolas Herrera
 */
@Setter @Getter
@Entity
@Table(name = "Proyectos")  
public class Proyecto {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProy;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String nombre;
    

    @Size(min = 1, max = 100, message = "no cumple con la longitud")
    private String descripcion;  
    
    
    
    
    public Proyecto() {
    }

    public Proyecto( String nombre, String descripcion) {



        this.nombre = nombre;
        this.descripcion = descripcion;
      
    }
}
