package com.fa17.ssu385.fa_2017_h6.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;


public class Recipe {
    @SerializedName("recipeName")
    private String name;

    @SerializedName("sourceDisplayName")
    private String source;

    @SerializedName("id")
    private String recipeId;

    @SerializedName("ingredients")
    private ArrayList<String> ingredients;

    @SerializedName("smallImageUrls")
    private ArrayList<String> thumbnailSources;

    @SerializedName("totalTimeInSeconds")
    private String totalTime;

    public String getName() {
        return name;
    }

    public String getSource() {
        return source;
    }

    public String getRecipeId() {
        return recipeId;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public ArrayList<String> getThumbnailSources() {
        return thumbnailSources;
    }

    public String getTotalTime() { return totalTime; }

    public static class Builder {
        private Recipe recipe;

        public Builder() {
            recipe = new Recipe();
        }

        public Builder name(String name) {
            recipe.name = name;
            return this;
        }

        public Builder source(String source) {
            recipe.source = source;
            return this;
        }

        public Builder recipeId(String id) {
            recipe.recipeId = id;
            return this;
        }

        public Builder ingredients(ArrayList<String> ingredients) {
            recipe.ingredients = ingredients;
            return this;
        }

        public Builder thumbnailSources(ArrayList<String> thumbnailSources) {
            recipe.thumbnailSources = thumbnailSources;
            return this;
        }

        public Builder totalTime(String totalTime) {
            recipe.totalTime = totalTime;
            return this;
        }

        public Recipe build() {
            Recipe val = this.recipe;
            recipe = null;
            return val;
        }
    }

}
