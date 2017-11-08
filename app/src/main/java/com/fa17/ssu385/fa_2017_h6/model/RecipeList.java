package com.fa17.ssu385.fa_2017_h6.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;


public class RecipeList {
    @SerializedName("matches")
    private ArrayList<Recipe> recipes;

    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }

    public static class Builder {
        private RecipeList recipelist;

        public Builder() {
            recipelist = new RecipeList();
        }

        public Builder recipes(ArrayList<Recipe> recipes) {
            recipelist.recipes = recipes;
            return this;
        }

        public RecipeList build() {
            RecipeList val = this.recipelist;
            recipelist = null;
            return val;
        }
    }

}
