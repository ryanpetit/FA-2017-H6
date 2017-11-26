package com.fa17.ssu385.fa_2017_h6.ui.search.interactor;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.model.RecipeList;

/**
 * Created by df_sp on 11/25/2017.
 */

public class RecipeSearchInteractorMockImpl implements RecipeSearchInteractor {

    private OnSearchResponse responseListener;

    public void setResponseListener(OnSearchResponse responseListener) {
        this.responseListener = responseListener;
    }

    @Override
    public void getRecipe(String searchResponseString, final OnSearchResponse searchResponse) {

    searchResponse.callback(new Recipe.Builder().recipeId("Test1").name("Test_Recipe").build());

    }
}
