package com.fa17.ssu385.fa_2017_h6.ui.search;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.model.Recipe.Builder;
import com.fa17.ssu385.fa_2017_h6.model.RecipeList;
import com.fa17.ssu385.fa_2017_h6.ui.search.RecipeSearchInteractor;

import java.util.ArrayList;
import java.util.Collection;

public class RecipeSearchInteractorMockImpl implements RecipeSearchInteractor {
    private OnSearchResponse responseListener;

    private Recipe mockRecipe = new Recipe.Builder()
                                            .recipeId("mock id")
                                            .name("mock name")
                                            .build();
    private ArrayList<Recipe> mockRecipes = new ArrayList<Recipe>((Collection<? extends Recipe>) mockRecipe);
    @Override
    public void getRecipe(String search, final OnSearchResponse response) {
        response.callback(new RecipeList.Builder()
            .recipes(mockRecipes)
            .build());
    }

    public void setResponseListener(OnSearchResponse responseListener) {
        this.responseListener = responseListener;
    }
}