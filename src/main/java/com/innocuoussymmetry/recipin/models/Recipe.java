package com.innocuoussymmetry.recipin.models;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.List;
@Table(name="recipe")
public class Recipe extends DBEntity {
    @Column(name="name")
    private String name;
    @Column(name="preptime")
    private String prepTime;
    @Column(name="authoruserid")
    private Integer authorUserId;
    @Column(name="description")
    private String description;
    @Column(name="ingredientnames")
    private List<String> ingredientNames;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrepTime() {
        return this.prepTime;
    }

    public void setPrepTime(String prepTime) {
        this.prepTime = prepTime;
    }

    public Integer getAuthorUserId() {
        return this.authorUserId;
    }

    public void setAuthorUserId(Integer authorUserId) {
        this.authorUserId = authorUserId;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getIngredientNames() {
        return this.ingredientNames;
    }

    public void setIngredientNames(List<String> ingredientNames) {
        this.ingredientNames = ingredientNames;
    }
}