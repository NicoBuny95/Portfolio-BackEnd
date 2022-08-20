
package com.portfolio.BackEnd.repositorio;

import com.portfolio.BackEnd.modelo.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepositorio extends JpaRepository<Experiencia,Integer> {
    
}
