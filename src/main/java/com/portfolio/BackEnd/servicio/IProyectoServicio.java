/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.BackEnd.servicio;

import com.portfolio.BackEnd.modelo.Proyecto;
import java.util.List;

/**
 *
 * @author Nicolas Herrera
 */
public interface IProyectoServicio {
    public List<Proyecto> mostrarProyectos();
    public void registrarProyecto(Proyecto pro);
    public  Proyecto edit(Proyecto p);
    
    
    
}
