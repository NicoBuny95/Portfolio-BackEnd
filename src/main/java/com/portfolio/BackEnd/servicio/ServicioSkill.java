package com.portfolio.BackEnd.servicio;


import com.portfolio.BackEnd.modelo.Skill;
import com.portfolio.BackEnd.repositorio.SkillRepositorio;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ServicioSkill {

    private final SkillRepositorio skillRepository;

    public ServicioSkill(SkillRepositorio skillRepository) {
        this.skillRepository = skillRepository;
    }

    public Skill addSkill(Skill skill){
        return skillRepository.save(skill);
    }
    public Skill updateSkill(Skill skill){
        return skillRepository.save(skill);
    }
    public List<Skill> findAllSkills(){
        return skillRepository.findAll();
    }
    public void deleteSkill(Long id){
        skillRepository.deleteById(id);
    }

}