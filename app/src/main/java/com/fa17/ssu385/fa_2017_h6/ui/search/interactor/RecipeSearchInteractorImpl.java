package com.fa17.ssu385.fa_2017_h6.ui.search.interactor;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.model.RecipeList;
import com.fa17.ssu385.fa_2017_h6.network.RecipeSearchAsyncTask;

/**
 * Created by Kurt on 11/9/17.
 */

public class RecipeSearchInteractorImpl implements RecipeSearchInteractor {

    @Override
    public void getRecipe(String search, final OnSearchResponse responseAction) {
        RecipeSearchAsyncTask task = new RecipeSearchAsyncTask();

        task.setCallbackListener(new RecipeSearchAsyncTask.OnRecipeFetchResponse() {
            @Override
            public void onCallback(RecipeList recipeList) {
                Recipe result = recipeList.getRecipes().get(0);
                responseAction.callback(result);
            }
        });

        task.execute(search);
    }
}
