package com.fa17.ssu385.fa_2017_h6.ui.search.interactor;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.model.RecipeList;

/**
 * Created by student on 11/14/17.
 */

public interface RecipeSearchInteractor {
    interface OnSearchResponse{
        void callback(RecipeList recipeList);
    }
    void getRecipe(String s, OnSearchResponse response);
}
