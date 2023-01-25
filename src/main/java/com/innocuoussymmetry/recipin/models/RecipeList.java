package com.innocuoussymmetry.recipin.models;

import jakarta.persistence.*;

@Entity
@Table(name="recipelist")
public class RecipeList extends AppList {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="ismainlist")
    private boolean isMainRecipeList;

    public boolean getIsMainRecipeList() {
        return this.isMainRecipeList;
    }

    public void setMainRecipeList(boolean isMainList) {
        this.isMainRecipeList = isMainList;
    }
}