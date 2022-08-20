
package com.portfolio.BackEnd.servicio;

import com.portfolio.BackEnd.modelo.Educacion;
import java.util.List;

public interface IEducacion {
    public List<Educacion> mostrarEstudios();
    public void registrarEstudios(Educacion Edu);
    public  Educacion edit(Educacion e);
    
    
    
    
    
}
