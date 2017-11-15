package com.fa17.ssu385.fa_2017_h6.ui.search.interactor;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;

/**
 * Created by student on 11/14/17.
 */

public interface RecipeSearchInteractor {

    public void getRecipe(String string, OnSearchResponse listener);

    public interface OnSearchResponse {
        public void callback(Recipe recipe);
    }
}
