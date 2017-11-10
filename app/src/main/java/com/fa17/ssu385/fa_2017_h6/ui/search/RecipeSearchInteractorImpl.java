package com.fa17.ssu385.fa_2017_h6.ui.search;

/**
 * Created by hayleygerard on 11/9/17.
 */

public class RecipeSearchInteractorImpl implements RecipeSearchInteractor {
    private OnSearchResponse responseListener;

    public void setResponseListener(OnSearchResponse responseListener){
        this.responseListener =responseListener;
    }

    @Override
    public void getRecipe(String title, OnSearchResponse response) {

    }
}
