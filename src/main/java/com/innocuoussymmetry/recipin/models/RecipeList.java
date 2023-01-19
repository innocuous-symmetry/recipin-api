package com.innocuoussymmetry.recipin.models;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name="recipelist")
public class RecipeList extends AppList {
    @Column(name="ismainlist")
    private boolean isMainRecipeList;

    public boolean getIsMainRecipeList() {
        return this.isMainRecipeList;
    }

    public void setMainRecipeList(boolean isMainList) {
        this.isMainRecipeList = isMainList;
    }
}