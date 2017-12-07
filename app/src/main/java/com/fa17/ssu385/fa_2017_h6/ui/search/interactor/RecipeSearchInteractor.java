package com.fa17.ssu385.fa_2017_h6.ui.search.interactor;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.model.RecipeList;


public interface RecipeSearchInteractor {
    interface OnSearchResponse{
        void callback(RecipeList recipeList);
    }
    void getRecipe(String s, OnSearchResponse response);
}