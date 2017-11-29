package com.fa17.ssu385.fa_2017_h6.ui.search.interactor;

import com.fa17.ssu385.fa_2017_h6.model.RecipeList;

public interface RecipeSearchInteractor {

    public interface OnSearchResponse {
        void callback(RecipeList recipelist);
    }

    void getRecipe(String search, OnSearchResponse searchResponse);

}

