package com.fa17.ssu385.fa_2017_h6.model;

import android.os.Build;

import com.google.gson.annotations.SerializedName;
import com.squareup.okhttp.HttpUrl;

import java.util.ArrayList;


public class RecipeList {
    @SerializedName("matches")
    private ArrayList<Recipe> recipes;

    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }

    public static class ListBuilder{
        private RecipeList recipeList;

        public ListBuilder() { recipeList = new RecipeList();}

        public ListBuilder recipes(ArrayList<Recipe> recipes){
            recipeList.recipes = recipes;
            return this;
        }

    }

}
