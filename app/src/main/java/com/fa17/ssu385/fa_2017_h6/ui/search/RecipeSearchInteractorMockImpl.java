package com.fa17.ssu385.fa_2017_h6.ui.search;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;

/**
 * Created by Ashlop on 11/28/17.
 */

public class RecipeSearchInteractorMockImpl extends RecipeSearchInteractor {
    private OnSearchResponse responseListener;

    @Override
    public void getRecipe(String search, final OnSearchResponse response){
        response.callback(new Recipe.Builder()
        .recipeId("This is my ID")
        .name("This is my name")
        .build());
    }
    public void setResponseListener(OnSearchResponse ResponseListener){
        this.responseListener = responseListener;
    }
}
