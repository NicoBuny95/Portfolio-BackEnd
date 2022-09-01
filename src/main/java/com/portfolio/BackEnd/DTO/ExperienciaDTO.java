
package com.portfolio.BackEnd.DTO;

import javax.validation.constraints.NotBlank;



public class ExperienciaDTO {
     private int id;

   @NotBlank
    private String cargoOcupado;
    @NotBlank
    private String lugar;

    @NotBlank
    private String comienzo;
    @NotBlank
    private String finalizacion;

    @NotBlank
    private String descripcion;
    
    @NotBlank
    private String img_exp;

    public ExperienciaDTO() {
    }

    public ExperienciaDTO(int id, String cargoOcupado, String lugar, String comienzo, String finalizacion, String descripcion,String img_exp) {

      
        this.id = id;
        this.cargoOcupado = cargoOcupado;
        this.lugar = lugar;
        this.comienzo = comienzo;
        this.finalizacion = finalizacion;
        this.descripcion = descripcion;
        this.img_exp=img_exp;
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
     * @return the cargoOcupado
     */
    public String getCargoOcupado() {
        return cargoOcupado;
    }

    /**
     * @param cargoOcupado the cargoOcupado to set
     */
    public void setCargoOcupado(String cargoOcupado) {
        this.cargoOcupado = cargoOcupado;
    }

    /**
     * @return the lugar
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * @param lugar the lugar to set
     */
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    /**
     * @return the comienzo
     */
    public String getComienzo() {
        return comienzo;
    }

    /**
     * @param comienzo the comienzo to set
     */
    public void setComienzo(String comienzo) {
        this.comienzo = comienzo;
    }

    /**
     * @return the finalizacion
     */
    public String getFinalizacion() {
        return finalizacion;
    }

    /**
     * @param finalizacion the finalizacion to set
     */
    public void setFinalizacion(String finalizacion) {
        this.finalizacion = finalizacion;
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

    public String getImg_exp() {
        return img_exp;
    }

    public void setImg_exp(String img_exp) {
        this.img_exp = img_exp;
    }
    
    
    
    
}
