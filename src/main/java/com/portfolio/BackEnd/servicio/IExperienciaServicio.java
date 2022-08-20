
package com.portfolio.BackEnd.servicio;


import com.portfolio.BackEnd.modelo.Experiencia;
import java.util.List;

/**
 *
 * @author Nicolas Herrera
 */
public interface IExperienciaServicio {
    
    
    public List<Experiencia> mostrarExperiencias();
    public void registrarExperiencia(Experiencia Edu);
    public  Experiencia edit(Experiencia e);
    
    
    
    
    
}


