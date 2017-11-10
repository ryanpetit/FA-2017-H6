package com.fa17.ssu385.fa_2017_h6.ui.search;

public class RecipeSearchInteractorlmpl implements RecipeSearchInteractor {

    private OnSearchResponse responseListener;

    public void setResponseListener(OnSearchResponse response) {
        this.responseListener = response;
    }

    @Override
    public void getRecipe(String title, OnSearchResponse response) {
    }
}

