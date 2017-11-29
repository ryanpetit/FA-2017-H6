package com.fa17.ssu385.fa_2017_h6.ui.search.interactor;

/**
 * Created by student on 11/28/17.
 */

public class RecipeSearchInteractorImpl implements RecipeSearchInteractor {



    private OnSearchResponse responseListener;

    public void setResponseListener(OnSearchResponse responseListener) {
        this.responseListener = responseListener;
    }


    @Override
    public void getRecipe(String string, OnSearchResponse listener) {
        // Leave empty
    }

}
