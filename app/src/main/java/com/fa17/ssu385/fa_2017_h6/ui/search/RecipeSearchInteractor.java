package com.fa17.ssu385.fa_2017_h6.ui.search;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.model.RecipeList;

/**
 * Created by Brooke on 11/2/2017.
 */

public interface RecipeSearchInteractor {
    interface OnSearchResponse{
        void callback(RecipeList result);
    }

    void getRecipe(String search, OnSearchResponse responseListener);
}
