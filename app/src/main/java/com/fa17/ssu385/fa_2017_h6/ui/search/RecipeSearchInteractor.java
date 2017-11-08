package com.fa17.ssu385.fa_2017_h6.ui.search;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;

public interface RecipeSearchInteractor {
    interface OnSearchResponse {
        void callback(Recipe recipe);
    }
    void getRecipe(String title, OnSearchResponse searchResponse);
}
