package com.portfolio.BackEnd.repositorio;


import com.portfolio.BackEnd.modelo.Skill;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepositorio extends JpaRepository<Skill,Long> {
     Optional<Skill> findBySkillName(String nombre);
     public boolean existsBySkillName(String nombre);
}
