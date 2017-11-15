package com.fa17.ssu385.fa_2017_h6.ui.search.Interactor;

/**
 * Created by ctwatson on 11/14/17.
 */

public class RecipeSearchInteractorImpl implements RecipeSearchInteractor {
    private OnSearchResponse responseListener;

    @Override
    public void getRecipe (String search, OnSearchResponse response) {

    }

    public void setResponseListener (OnSearchResponse responseListener) {
        this.responseListener = responseListener;
    }
}
