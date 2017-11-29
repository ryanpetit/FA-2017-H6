package com.fa17.ssu385.fa_2017_h6.ui.search.Interactor;

import com.bumptech.glide.Glide;
import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.model.RecipeList;
import com.fa17.ssu385.fa_2017_h6.network.RecipeSearchAsyncTask;
import com.fa17.ssu385.fa_2017_h6.ui.search.Interactor.RecipeSearchInteractor;

/**
 * Created by student on 11/7/17.
 */

public class RecipeSearchInteractorImpl implements RecipeSearchInteractor {
    private OnSearchResponse responseListener;

    public void setResponseListener(OnSearchResponse responseListener) {
        this.responseListener = responseListener;
    }

    @Override
    public void getRecipeList(String title, final OnSearchResponse response) {
        RecipeSearchAsyncTask task = new RecipeSearchAsyncTask();
        task.setCallbackListener(new RecipeSearchAsyncTask.OnRecipeFetchResponse() {
            @Override
            public void onCallback(RecipeList recipeList) {
                response.callback(recipeList);
            }
        });
        task.execute(title);
    }
}
