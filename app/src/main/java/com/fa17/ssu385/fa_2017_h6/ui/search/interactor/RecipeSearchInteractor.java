package com.fa17.ssu385.fa_2017_h6.ui.search.interactor;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;

public interface RecipeSearchInteractor {

    void getRecipe(String searchParam, OnSearchResponse onSearchResponse);

    public interface OnSearchResponse {
        void callback(Recipe recipe);
    }
}