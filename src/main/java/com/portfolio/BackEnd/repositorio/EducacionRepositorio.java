
package com.portfolio.BackEnd.repositorio;

import com.portfolio.BackEnd.modelo.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepositorio extends JpaRepository<Educacion,Integer> {

 
}