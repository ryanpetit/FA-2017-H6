package com.fa17.ssu385.fa_2017_h6.ui.search.interactor;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.model.RecipeList;

import java.util.ArrayList;
import java.util.Arrays;

public class RecipeSearchInteractorMockImpl implements RecipeSearchInteractor {
    private OnSearchResponse responseListener;

    public void setResponseListener(OnSearchResponse responseListener) {
        responseListener = responseListener;
    }


    @Override
    public void getRecipe(String s, final OnSearchResponse response) {

    }
}
