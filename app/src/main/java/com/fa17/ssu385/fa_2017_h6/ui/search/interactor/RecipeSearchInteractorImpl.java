package com.fa17.ssu385.fa_2017_h6.ui.search.interactor;

/**
 * Created by student on 11/7/17.
 */

public class RecipeSearchInteractorImpl implements RecipeSearchInteractor{
    public void setResponseListener(OnSearchResponse responseListener) {
        this.responseListener = responseListener;
    }

    private OnSearchResponse responseListener;

    @Override
    public void getRecipe(String name, OnSearchResponse response) {

    }
}
