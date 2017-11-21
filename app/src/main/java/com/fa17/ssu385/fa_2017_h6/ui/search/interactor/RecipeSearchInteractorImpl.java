package com.fa17.ssu385.fa_2017_h6.ui.search.interactor;



public class RecipeSearchInteractorImpl implements RecipeSearchInteractor {

    private OnSearchResponse responseListener;

    public void setResponseListener(OnSearchResponse responseListener) {
        this.responseListener = responseListener;
    }


    @Override
    public void getRecipe(String searchString, OnSearchResponse onResponse) {

    }
}
