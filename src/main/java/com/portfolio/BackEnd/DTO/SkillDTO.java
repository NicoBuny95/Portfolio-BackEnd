/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BackEnd.DTO;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author Nicolas Herrera
 */
public class SkillDTO {
    @NotBlank
    private String skillName;
    @NotBlank
    private String picSkill;
    @NotBlank
    private int percent;

    public SkillDTO() {
    }

    public SkillDTO(String skillName, String picSkill, int percent) {
        this.skillName = skillName;
        this.picSkill = picSkill;
        this.percent = percent;
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

