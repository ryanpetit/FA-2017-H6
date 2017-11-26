package com.fa17.ssu385.fa_2017_h6.ui.search.interactor;

/**
 * Created by Hydrilusx on 11/8/2017.
 */

import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.model.RecipeList;
import com.fa17.ssu385.fa_2017_h6.network.RecipeSearchAsyncTask;

public class RecipeSearchInteractorImpl implements RecipeSearchInteractor {

    private OnSearchResponse responseListener;

    public void setResponseListener(OnSearchResponse responseListener) {
        this.responseListener = responseListener;
    }

    @Override
    public void getRecipe(String searchResponseString, final OnSearchResponse searchResponse) {


                RecipeSearchAsyncTask task = new RecipeSearchAsyncTask();

                task.setCallbackListener(new RecipeSearchAsyncTask.OnRecipeFetchResponse() {
                    @Override
                    public void onCallback(RecipeList recipeList) {
                        Recipe recipe = recipeList.getRecipes().get(0);
                        searchResponse.callback(recipe);
                    }
                });

                task.execute(searchResponseString);


    }
}
