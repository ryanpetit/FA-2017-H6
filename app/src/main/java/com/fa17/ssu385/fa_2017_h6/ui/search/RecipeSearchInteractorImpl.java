package com.fa17.ssu385.fa_2017_h6.ui.search;

/**
 * Created by Brooke on 11/2/2017.
 */

public class RecipeSearchInteractorImpl implements RecipeSearchInteractor {
    private OnSearchResponse responseListener;

    @Override
    public void getRecipe(String search, OnSearchResponse responseListener) {

    }

    public void setResponseListener(OnSearchResponse responseListener) {
        this.responseListener = responseListener;
    }
}
