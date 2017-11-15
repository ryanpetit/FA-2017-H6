package com.fa17.ssu385.fa_2017_h6.ui.search.interactor;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;

/**
 * Created by ssubrandon on 11/14/17.
 */

public class RecipeSearchInteractorImpl implements RecipeSearchInteractor {
    public void getRecipe(String s, OnSearchResponse on){
        //leave empty
    }
    private OnSearchResponse responseListener;

    public void setResponseListener(OnSearchResponse response){
        this.responseListener = response;
    }

}
