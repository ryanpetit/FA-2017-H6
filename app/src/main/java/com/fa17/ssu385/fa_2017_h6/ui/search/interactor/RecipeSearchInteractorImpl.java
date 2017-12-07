package com.fa17.ssu385.fa_2017_h6.ui.search.interactor;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.model.RecipeList;
import com.fa17.ssu385.fa_2017_h6.network.RecipeSearchAsyncTask;

public class RecipeSearchInteractorImpl implements RecipeSearchInteractor {

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
