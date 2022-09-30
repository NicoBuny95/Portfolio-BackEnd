package com.portfolio.BackEnd.servicio;


import com.portfolio.BackEnd.modelo.Skill;
import com.portfolio.BackEnd.repositorio.SkillRepositorio;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

@Service
@Transactional
public class ServicioSkill {

    @Autowired
    SkillRepositorio rhys;
    
    public List<Skill> list(){
        return rhys.findAll();
    }
    
    public Optional<Skill> getOne(Long id){
        return rhys.findById(id);
    }
    
    public Optional<Skill> getByNombre(String nombre){
        return rhys.findBySkillName(nombre);
    }
    
    public void save(Skill skill){
        rhys.save(skill);
    }
    
    public void delete(Long id){
        rhys.deleteById(id);
    }
    
    public boolean existsById(Long id){
        return rhys.existsById(id);
    }
    
    public boolean existsByNombre(String nombre){
        return rhys.existsBySkillName(nombre);
    }

    
}