package com.fa17.ssu385.fa_2017_h6.ui.search;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.model.RecipeList;
import com.fa17.ssu385.fa_2017_h6.network.RecipeSearchAsyncTask;

/**
 * Created by Ashlop on 11/28/17.
 */

class RecipeSearchInteractorImpl extends RecipeSearchInteractor {
    private OnSearchResponse responseListener;

    @Override
    public void getRecipe(String search, final OnSearchResponse response) {
        RecipeSearchAsyncTask task = new RecipeSearchAsyncTask();

            task.setCallbackListener(new RecipeSearchAsyncTask.OnRecipeFetchResponse(){
                @Override
                public void onCallback(RecipeList recipeList){
                    Recipe recipe = recipeList.getRecipes().get(0);
                    response.callback(recipe);
                }
            });
    }
}
