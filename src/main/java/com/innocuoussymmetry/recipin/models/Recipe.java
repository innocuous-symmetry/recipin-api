package com.innocuoussymmetry.recipin.models;

import java.util.List;

public class Recipe extends DBEntity {
    private String name;
    private String prepTime;
    private Integer authorUserId;
    private String description;
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