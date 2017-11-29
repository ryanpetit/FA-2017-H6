package com.fa17.ssu385.fa_2017_h6.ui.search.interactor;

import android.content.Intent;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.model.RecipeList;
import com.fa17.ssu385.fa_2017_h6.network.RecipeSearchAsyncTask;
import com.fa17.ssu385.fa_2017_h6.ui.search.SearchActivity;

import org.parceler.Parcels;


public class RecipeSearchInteractorImpl implements RecipeSearchInteractor {

    private OnSearchResponse responseListener;
    private RecipeSearchAdapter adapter;


    public void setResponseListener(OnSearchResponse responseListener) {
        this.responseListener = responseListener;
    }

    @Override
    public void getRecipe(String search, final OnSearchResponse searchResponse) {
        RecipeSearchAsyncTask task = new RecipeSearchAsyncTask();

        task.setCallbackListener(new RecipeSearchAsyncTask.OnRecipeFetchResponse() {
            @Override
            public void onCallback(RecipeList recipeList) {

                //Recipe recipe = recipeList.getRecipes().get(0);
                searchResponse.callback(recipeList);
            }
        });

        task.execute(search);
    }
}

