package com.innocuoussymmetry.recipin.models;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name="ingredient")
public class Ingredient extends DBEntity {
    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;
    @Column(name="createdbyid")
    private Integer createdById;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        // maybe don't allow this to be called?
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCreatedById() {
        return this.createdById;
    }

    public void setCreatedById() { /* this one definitely shouldn't do anything */ }
}