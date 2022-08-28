
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
@Table(name = "Experiencias")
public class Experiencia {
    
 @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idExp;

    @Column(name = "Cargo", length = 200,nullable = false)
    private String cargoOcupado;

    @Column(name = "Lugar", length = 100,nullable = false)
    private String lugar;

    @Column(name = "Fecha_Comienzo", length = 50,nullable = false)
    private String comienzo;

    @Column(name = "Fecha_finalizacion", length = 50,nullable = false)
    private String finalizacion;

    @Column(name = "Descripcion", length = 550,nullable = false)
    private String descripcion;
    
    @Column(name = "Imagen", length = 250,nullable = false)
    private String img_exp;

    public Experiencia() {
    }

    public Experiencia(int idExp, String cargoOcupado, String lugar, String comienzo, String finalizacion
            , String descripcion,String img_exp) {

      
        this.idExp = idExp;
        this.cargoOcupado = cargoOcupado;
        this.lugar = lugar;
        this.comienzo = comienzo;
        this.finalizacion = finalizacion;
        this.descripcion = descripcion;
        this.img_exp=img_exp;
    }   
    
    
    
}
