package com.fa17.ssu385.fa_2017_h6.ui.search.interactor;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;

/**
 * Created by Kurt on 11/9/17.
 */

public interface RecipeSearchInteractor {
    public interface OnSearchResponse{
        void callback(Recipe recipe);
    }
    void getRecipe(String search, OnSearchResponse responseAction);
}
