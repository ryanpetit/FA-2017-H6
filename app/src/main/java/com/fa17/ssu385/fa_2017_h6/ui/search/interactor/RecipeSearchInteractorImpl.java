package com.fa17.ssu385.fa_2017_h6.ui.search.interactor;


import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.model.RecipeList;
import com.fa17.ssu385.fa_2017_h6.network.RecipeSearchAsyncTask;

public class RecipeSearchInteractorImpl implements SearchInteractor.RecipeSearchInteractor {
//    private OnSearchResponse responseListener;

//    public void setResponseListener(OnSearchResponse responseListener) {
//        this.responseListener = responseListener;
//    }

    @Override
    public void getRecipe(String search, final OnSearchResponse onSearchResponse) {
        RecipeSearchAsyncTask task = new RecipeSearchAsyncTask();

        task.setCallbackListener(new RecipeSearchAsyncTask.OnRecipeFetchResponse() {
            @Override
            public void onCallback(RecipeList recipeList) {
                Recipe recipe = recipeList.getRecipes().get(0);
                onSearchResponse.callback(recipe);
            }
        });

        task.execute(search);
    }
}
