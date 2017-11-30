package com.fa17.ssu385.fa_2017_h6.ui.search.interactor;

import com.bumptech.glide.Glide;
import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.network.RecipeSearchAsyncTask;
import com.fa17.ssu385.fa_2017_h6.network.RecipeSearchAsyncTask;
import com.fa17.ssu385.fa_2017_h6.ui.search.SearchActivity;
import com.fa17.ssu385.fa_2017_h6.model.RecipeList;


/**
 * Created by student on 11/14/17.
 */

public class RecipeSearchInteractorImpl implements RecipeSearchInteractor {

    private OnSearchResponse responseListener;

    public void setResponseListener(OnSearchResponse responseListener) {
        this.responseListener = responseListener;
    }

    @Override
    public void getRecipeList(String string, OnSearchResponse listener) {
    RecipeSearchAsyncTask task = new RecipeSearchAsyncTask();
    this.setResponseListener(listener);
    task.setCallbackListener(new RecipeSearchAsyncTask.OnRecipeFetchResponse() {
        @Override
        public void onCallback(RecipeList recipeList) {
//            Recipe recipe = recipeList.getRecipes().get(0);
            responseListener.callback(recipeList);
        }
    });

    task.execute(string);
    }
}
