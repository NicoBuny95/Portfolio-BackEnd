
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
    private int id;

    @Column(name = "Titulo", length = 50)
    private String titulo;

    @Column(name = "Institucion", length = 50)
    private String institucion;

    @Column(name = "Ubicacion", length = 50)
    private String ubicacion;

    @Column(name = "FechaIn", length = 50)
    private String fechaIn;

    @Column(name = "FechaFin", length = 50)
    private String fechaFin;

    public Educacion() {
    }

    public Educacion(int id, String titulo, String institucion, String ubicacion, String fechaIn, String fechaFin) {

      
        this.id = id;
        this.titulo = titulo;
        this.institucion = institucion;
        this.ubicacion = ubicacion;
        this.fechaIn = fechaIn;
        this.fechaFin = fechaFin;
    }

}