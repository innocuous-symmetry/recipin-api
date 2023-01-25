package com.innocuoussymmetry.recipin.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name="recipe")
public class Recipe {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="preptime")
    private String prepTime;

    @Column(name="authoruserid")
    private Integer authorUserId;

    @Column(name="description")
    private String description;

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
}