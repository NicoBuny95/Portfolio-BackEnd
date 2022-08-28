
package com.portfolio.BackEnd.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
@Table(name = "educacion")   
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idEdu;

    @Column(name = "Titulo", length = 150)
    private String titulo;

    @Column(name = "Institucion", length = 50)
    private String institucion;

    @Column(name = "Ubicacion", length = 50)
    private String ubicacion;

    @Column(name = "FechaIn", length = 50)
    private String fechaIn;

    @Column(name = "FechaFin", length = 50)
    private String fechaFin;

    @Column(name = "Imagen", length = 200)
    private String img_edu;

    
    public Educacion() {
    }

    public Educacion(int idEdu, String titulo, String institucion, String ubicacion, String fechaIn, String fechaFin,String img_edu) {

      
        this.idEdu = idEdu;
        this.titulo = titulo;
        this.institucion = institucion;
        this.ubicacion = ubicacion;
        this.fechaIn = fechaIn;
        this.fechaFin = fechaFin;
        this.img_edu=img_edu;
    }

}