package com.fa17.ssu385.fa_2017_h6.ui.search.interactor;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.model.RecipeList;
import com.fa17.ssu385.fa_2017_h6.network.RecipeSearchAsyncTask;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RecipeSearchInteractorMockImpl implements RecipeSearchInteractor {

    private OnSearchResponse responseListener;

    public void setResponseListener(OnSearchResponse responseListener) {
        this.responseListener = responseListener;
    }

    @Override
    public void getRecipe(String search, final OnSearchResponse searchResponse) {
        searchResponse.callback(new Recipe.Builder()
                                    .recipeId("id")
                                    .name("Motha Fuggin Meatballs and Pasta")
                                    .build());
    }
}

