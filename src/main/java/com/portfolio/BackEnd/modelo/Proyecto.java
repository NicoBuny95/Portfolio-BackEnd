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
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50,message = "no cumple con la longitud")
    private String nombre;
    

    @Size(min = 1, max = 100, message = "no cumple con la longitud")
    private String descripcion;  
    
    
    private String img_proy;  
    
    public Proyecto() {
    }

    public Proyecto( String nombre, String descripcion, String img_proy) {



        this.nombre = nombre;
        this.descripcion = descripcion;
        this.img_proy=img_proy;
      
    }
}
