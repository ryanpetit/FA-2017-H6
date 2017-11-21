package com.fa17.ssu385.fa_2017_h6.ui.search;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.model.RecipeList;
import com.fa17.ssu385.fa_2017_h6.ui.search.RecipeSearchInteractor;

public class RecipeSearchInteractorMockImpl implements RecipeSearchInteractor {
    private OnSearchResponse responseListener;

    @Override
    public void getRecipe(String search, final OnSearchResponse response) {
        response.callback(new Recipe.Builder()
            .recipeId("dis my id")
            .name("dis my name")
            .build());
    }

    public void setResponseListener(OnSearchResponse responseListener) {
        this.responseListener = responseListener;
    }
}