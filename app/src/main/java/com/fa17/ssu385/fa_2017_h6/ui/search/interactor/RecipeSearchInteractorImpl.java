package com.fa17.ssu385.fa_2017_h6.ui.search.interactor;

/**
 * Created by roberthubbell on 11/7/17.
 */

public class RecipeSearchInteractorImpl implements RecipeSearchInteractor {


    private OnSearchResponse responseListenter;

    public void setResponseListenter(OnSearchResponse responseListenter) {
        this.responseListenter = responseListenter;
    }

    @Override
    public void getRecipe(String string, OnSearchResponse onSearchResponse) {

    }
}
