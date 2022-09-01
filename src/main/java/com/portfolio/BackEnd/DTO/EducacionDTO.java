
package com.portfolio.BackEnd.DTO;

import javax.validation.constraints.NotBlank;


public class EducacionDTO {
  
 
    private int id;

   @NotBlank
    private String titulo;
    @NotBlank
    private String institucion;

    @NotBlank
    private String ubicacion;
    @NotBlank
    private String fechaIn;

    @NotBlank
    private String fechaFin;
    
    @NotBlank
    private String img_edu;
    
    
    public EducacionDTO() {
    }

    public EducacionDTO(int id, String titulo, String institucion, String ubicacion, String fechaIn, String fechaFin,String img_edu) {

      
        this.id = id;
        this.titulo = titulo;
        this.institucion = institucion;
        this.ubicacion = ubicacion;
        this.fechaIn = fechaIn;
        this.fechaFin = fechaFin;
        this.img_edu=img_edu;
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
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the institucion
     */
    public String getInstitucion() {
        return institucion;
    }

    /**
     * @param institucion the institucion to set
     */
    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    /**
     * @return the ubicacion
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * @param ubicacion the ubicacion to set
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * @return the fechaIn
     */
    public String getFechaIn() {
        return fechaIn;
    }

    /**
     * @param fechaIn the fechaIn to set
     */
    public void setFechaIn(String fechaIn) {
        this.fechaIn = fechaIn;
    }

    /**
     * @return the fechaFin
     */
    public String getFechaFin() {
        return fechaFin;
    }

    /**
     * @param fechaFin the fechaFin to set
     */
    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getImg_edu() {
        return img_edu;
    }

    public void setImg_edu(String img_edu) {
        this.img_edu = img_edu;
    }

    
    
    
}

