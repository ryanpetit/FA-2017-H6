package com.fa17.ssu385.fa_2017_h6.ui.search.Interactor;

import com.fa17.ssu385.fa_2017_h6.model.RecipeList;

/**
 * Created by ctwatson on 11/14/17.
 */

public interface RecipeSearchInteractor {
    interface OnSearchResponse {
        void callback (RecipeList recipelist);
    }

    void getRecipe (String string, OnSearchResponse onSearchResponse);
}
