package com.fa17.ssu385.fa_2017_h6.ui.search.interactor;

import com.bumptech.glide.Glide;
import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.model.RecipeList;
import com.fa17.ssu385.fa_2017_h6.network.RecipeSearchAsyncTask;
import com.fa17.ssu385.fa_2017_h6.ui.search.SearchActivity;

/**
 * Created by chadlewis on 11/4/17.
 */

public class RecipeSearchInteractorImpl implements RecipeSearchInteractor {

    private OnSearchResponse responseListener;

    public void setOnSearchResponseListener(OnSearchResponse listener) {
        responseListener = listener;
    }
    @Override
    public void getRecipe(String searchParam, final OnSearchResponse onSearchResponse) {
        RecipeSearchAsyncTask task = new RecipeSearchAsyncTask();

        task.setCallbackListener(new RecipeSearchAsyncTask.OnRecipeFetchResponse() {
            @Override
            public void onCallback(RecipeList recipeList) {
                onSearchResponse.callback(recipeList);
            }
        });

        task.execute(searchParam);
    }
}
