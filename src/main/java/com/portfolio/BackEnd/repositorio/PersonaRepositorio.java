/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.BackEnd.repositorio;

import com.portfolio.BackEnd.modelo.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nicolas Herrera
 */
@Repository
public interface PersonaRepositorio extends JpaRepository<Persona,Integer> {
         Optional<Persona> findByNombre(String nombre);
     public boolean existsByNombre(String nombre);
}
