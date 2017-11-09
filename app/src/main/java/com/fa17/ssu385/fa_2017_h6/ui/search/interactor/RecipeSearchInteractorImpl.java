package com.fa17.ssu385.fa_2017_h6.ui.search.interactor;

/**
 * Created by Hydrilusx on 11/8/2017.
 */

public class RecipeSearchInteractorImpl implements RecipeSearchInteractor {

    private OnSearchResponse responseListener;

    public void setResponseListener(OnSearchResponse responseListener) {
        this.responseListener = responseListener;
    }

    @Override
    public void getRecipe(String onSearchResponseString, OnSearchResponse onSearchResponse) {

    }
}
