package com.portfolio.BackEnd.modelo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "skill")
public class Skill implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_skill",nullable = false)
    private Long idSkill;
    @Column(name = "Nombreskill",nullable = false)
    private String skillName;
    @Column(name = "img_skill")
    private String picSkill;
    @Column(name = "Porcentaje",nullable = false)
    private int percent;

    public Skill() {
    }

    public Skill( String skillName, String picSkill, int percent) {
        
        this.skillName = skillName;
        this.picSkill = picSkill;
        this.percent = percent;
    }

    public Long getIdSkill() {
        return idSkill;
    }

    public void setIdSkill(Long idSkill) {
        this.idSkill = idSkill;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getPicSkill() {
        return picSkill;
    }

    public void setPicSkill(String picSkill) {
        this.picSkill = picSkill;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }
}

