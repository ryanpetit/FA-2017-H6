package com.fa17.ssu385.fa_2017_h6.ui.search.interactor;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.network.RecipeSearchAsyncTask;
import com.fa17.ssu385.fa_2017_h6.model.RecipeList;




/**
 * Created by ssubrandon on 11/14/17.
 */

public class RecipeSearchInteractorImpl implements RecipeSearchInteractor {
    private OnSearchResponse responseListener;

    public void setResponseListener(OnSearchResponse response){
        this.responseListener = response;
    }

    @Override
    public void getRecipe(String recipeInput, final OnSearchResponse on){

        RecipeSearchAsyncTask task = new RecipeSearchAsyncTask();

        task.setCallbackListener(new RecipeSearchAsyncTask.OnRecipeFetchResponse() {
                    @Override
                    public void onCallback(RecipeList recipeList) {
                        Recipe recipeObject = recipeList.getRecipes().get(0);
                        on.callback(recipeObject);
                    }
        });

                task.execute(recipeInput);
    }


}
