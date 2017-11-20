package com.fa17.ssu385.fa_2017_h6.ui.search;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;

/**
 * Created by Ashlop on 11/19/17.
 */

public interface RecipeSearchInteractor {
    public interface OnSearchResponse{
        void callback(Recipe result);
    }

    void getRecipe(String search, OnSearchResponse responseListener);

}
