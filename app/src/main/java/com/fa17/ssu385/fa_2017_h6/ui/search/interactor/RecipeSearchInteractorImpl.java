package com.fa17.ssu385.fa_2017_h6.ui.search.interactor;

import com.fa17.ssu385.fa_2017_h6.model.RecipeList;
import com.fa17.ssu385.fa_2017_h6.network.RecipeSearchAsyncTask;

/**
 * Created by student on 11/14/17.
 */

public class RecipeSearchInteractorImpl implements RecipeSearchInteractor {

    private OnSearchResponse responseListener;

    public void setResponseListener(OnSearchResponse responseListener) {
        responseListener = responseListener;
    }

    @Override
    public void getRecipe(String s, final OnSearchResponse response) {
        RecipeSearchAsyncTask task = new RecipeSearchAsyncTask();

                task.setCallbackListener(new RecipeSearchAsyncTask.OnRecipeFetchResponse() {
                    @Override
                    public void onCallback(RecipeList recipeList) {
                        response.callback(recipeList);
                    }
                });

                task.execute(s);
            }
    }

