package com.fa17.ssu385.fa_2017_h6.ui.search;

import com.fa17.ssu385.fa_2017_h6.model.RecipeList;
import com.fa17.ssu385.fa_2017_h6.network.RecipeSearchAsyncTask;

public class RecipeSearchInteractorImpl implements RecipeSearchInteractor {
    private OnSearchResponse responseListener;

    public void setResponseListener(OnSearchResponse responseListener) {
        this.responseListener = responseListener;
    }

    @Override
    public void getRecipe(String title, final OnSearchResponse searchResponse) {
        RecipeSearchAsyncTask task = new RecipeSearchAsyncTask();

        task.setCallbackListener(new RecipeSearchAsyncTask.OnRecipeFetchResponse() {
            @Override
            public void onCallback(RecipeList recipeList) {
                if(!recipeList.getRecipes().isEmpty())
                    searchResponse.callback(recipeList.getRecipes().get(0));
            }
        });

        task.execute(title);
    }
}
