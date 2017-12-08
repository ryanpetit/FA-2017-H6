package com.fa17.ssu385.fa_2017_h6.ui.search.search.interactor;


import com.fa17.ssu385.fa_2017_h6.model.RecipeList;
import com.fa17.ssu385.fa_2017_h6.network.RecipeSearchAsyncTask;
import com.fa17.ssu385.fa_2017_h6.ui.search.search.adapter.RecipeSearchAdapter;

public class RecipeSearchInteractorImpl implements RecipeSearchInteractor {
    private RecipeSearchAdapter adapter;

    @Override
    public void getRecipeList(String search, final OnSearchResponse response) {
        RecipeSearchAsyncTask task = new RecipeSearchAsyncTask();

        task.setCallbackListener(new RecipeSearchAsyncTask.OnRecipeFetchResponse() {
            @Override
            public void onCallback(RecipeList recipeList) {
                response.callback(recipeList);
            }
        });

        task.execute(search);
    }
}
