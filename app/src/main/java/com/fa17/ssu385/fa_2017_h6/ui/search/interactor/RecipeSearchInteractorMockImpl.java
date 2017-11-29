package com.fa17.ssu385.fa_2017_h6.ui.search.interactor;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.model.RecipeList;
import com.fa17.ssu385.fa_2017_h6.network.RecipeSearchAsyncTask;

import java.util.ArrayList;

/**
 * Created by student on 11/28/17.
 */

public class RecipeSearchInteractorMockImpl implements RecipeSearchInteractor {

    private OnSearchResponse responseListener;

    public void setResponseListener(OnSearchResponse responseListener) {
        this.responseListener = responseListener;
    }

    @Override
    public void getRecipe(String string, OnSearchResponse onSearchResponse) {
        //RecipeSearchAsyncTask task = new RecipeSearchAsyncTask();
        this.setResponseListener(onSearchResponse);
        //task.setCallbackListener(new RecipeSearchAsyncTask.OnRecipeFetchResponse() {
            //@Override
            //public void onCallback(RecipeList recipeList) {
                responseListener.callback(new Recipe.Builder().name("testname").build());
            //}
        //});

        //task.execute(string);
    }
}
