package com.fa17.ssu385.fa_2017_h6.ui.search.Interactor;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;

/**
 * Created by blakevollmer on 11/30/17.
 */

public class RecipeSearchInteractorImpl implements RecipeSearchInteractor {
    @Override
    public void getRecipe(String string, OnSearchResponse response) {
        response.callback(new Recipe());
    }
}
