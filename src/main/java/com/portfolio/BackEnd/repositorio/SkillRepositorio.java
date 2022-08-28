package com.portfolio.BackEnd.repositorio;


import com.portfolio.BackEnd.modelo.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepositorio extends JpaRepository<Skill,Long> {
}
