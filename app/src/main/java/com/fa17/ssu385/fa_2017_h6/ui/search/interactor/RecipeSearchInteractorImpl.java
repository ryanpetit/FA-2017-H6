package com.fa17.ssu385.fa_2017_h6.ui.search.interactor;

/**
 * Created by chadlewis on 11/4/17.
 */

public class RecipeSearchInteractorImpl implements RecipeSearchInteractor {

    private OnSearchResponse responseListener;

    public void setOnSearchResponseListener(OnSearchResponse listener) {
        responseListener = listener;
    }
    @Override
    public void getRecipe(String searchParam, OnSearchResponse onSearchResponse) {

    }
}
