package com.fa17.ssu385.fa_2017_h6.ui.search.search.interactor;

import com.fa17.ssu385.fa_2017_h6.model.RecipeList;

public interface RecipeSearchInteractor {
    interface OnSearchResponse {
        void callback(RecipeList recipeList);
    }

    void getRecipeList(String search, OnSearchResponse response);
}
