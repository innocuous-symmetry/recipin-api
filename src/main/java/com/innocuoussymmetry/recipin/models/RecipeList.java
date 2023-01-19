package com.innocuoussymmetry.recipin.models;

public class RecipeList extends AppList {
    private boolean isMainRecipeList;

    public boolean getIsMainRecipeList() {
        return this.isMainRecipeList;
    }

    public void setMainRecipeList(boolean isMainList) {
        this.isMainRecipeList = isMainList;
    }
}