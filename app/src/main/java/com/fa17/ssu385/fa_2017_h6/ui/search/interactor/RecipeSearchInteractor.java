package com.fa17.ssu385.fa_2017_h6.ui.search.interactor;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;

/**
 * Created by student on 11/14/17.
 */

public interface RecipeSearchInteractor {
    void getRecipe(String s, OnSearchResponse on);

    interface OnSearchResponse{
        void callback(Recipe rec);
    }

}
