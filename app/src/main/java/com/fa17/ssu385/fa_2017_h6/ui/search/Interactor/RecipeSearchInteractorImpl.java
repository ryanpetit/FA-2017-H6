package com.fa17.ssu385.fa_2017_h6.ui.search.Interactor;

/**
 * Created by blakevollmer on 11/30/17.
 */

public class RecipeSearchInteractorImpl {
    RecipeSearchInteractor recipeSearchInteractor = new RecipeSearchInteractor() {
        @Override
        public void getRecipe(String string, OnSearchResponse response) {

        }
    };

    RecipeSearchInteractor responseListener;
    public void setResponseListener(RecipeSearchInteractor responseListener) {
        this.responseListener = responseListener;
    }


}
