package com.fa17.ssu385.fa_2017_h6.ui.search.interactor;

import android.content.Intent;
import android.os.Parcel;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.model.RecipeList;
import com.fa17.ssu385.fa_2017_h6.network.RecipeSearchAsyncTask;
import com.fa17.ssu385.fa_2017_h6.ui.detail.RecipeDetailActivity;
import com.fa17.ssu385.fa_2017_h6.ui.search.SearchActivity;
import com.fa17.ssu385.fa_2017_h6.ui.search.adapter.RecipeSearchAdapter;

import org.parceler.Parcels;

/**
 * Created by Kurt on 11/9/17.
 */

public class RecipeSearchInteractorImpl implements RecipeSearchInteractor {
    private RecipeSearchAdapter adapter;

    @Override
    public void getRecipeList(String search, final OnSearchResponse responseAction) {
        RecipeSearchAsyncTask task = new RecipeSearchAsyncTask();

        task.setCallbackListener(new RecipeSearchAsyncTask.OnRecipeFetchResponse() {
            @Override
            public void onCallback(RecipeList recipeList) {
                responseAction.callback(recipeList);
            }
        });
        task.execute(search);
    }
}
