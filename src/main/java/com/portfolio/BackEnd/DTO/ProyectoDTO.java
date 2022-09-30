/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BackEnd.DTO;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author Nicolas Herrera
 */
public class ProyectoDTO {

    private int id;

    @NotBlank
    private String nombre;
    @NotBlank
    private String descripcion;
    
    private String img_proy;  

    public ProyectoDTO() {
    }

    public ProyectoDTO(int id, String nombre, String descripcion,String img_proy) {

        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.img_proy=img_proy;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImg_proy() {
        return img_proy;
    }

    public void setImg_proy(String img_proy) {
        this.img_proy = img_proy;
    }

}
