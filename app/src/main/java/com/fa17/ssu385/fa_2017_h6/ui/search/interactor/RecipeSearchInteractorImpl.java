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

                adapter = new RecipeSearchAdapter(recipeList.getRecipes());
                adapter.setRecipeItemClickListener(new RecipeSearchAdapter.RecipeItemClickListener() {
                    @Override
                    public void onRecipeItemClicked(Recipe selectedItem) {
                        Intent navIntent = new Intent(SearchActivity.class, RecipeDetailActivity.class);
                        navIntent.putExtra(RecipeDetailActivity.RECIPE_EXTRA_KEY, Parcels.wrap(selectedItem));
                        startActivity(navIntent);
                    }
                });
                //Recipe recipe = recipeList.getRecipes().get(0);
                searchResponse.callback(recipeList);
            }
        });

        task.execute(search);
    }
}

