package com.fa17.ssu385.fa_2017_h6.ui.search.interactor;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.model.RecipeList;
import com.fa17.ssu385.fa_2017_h6.network.RecipeSearchAsyncTask;

public class RecipeSearchInteractorMockImpl implements RecipeSearchInteractor {
    private OnSearchResponse responseListener;

    public void setResponseListener(OnSearchResponse responseListener){
        this.responseListener = responseListener;
    }

    @Override
    public void getRecipe(String name, OnSearchResponse response) {
        response.callback(new Recipe.Builder()
                .recipeId("id")
                .name("Imma Pass Out Turkey Dinner")
                .build());
    }
}