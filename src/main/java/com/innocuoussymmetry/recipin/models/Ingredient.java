package com.innocuoussymmetry.recipin.models;

public class Ingredient extends DBEntity {
    private String name;
    private String description;
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