package com.fa17.ssu385.fa_2017_h6.ui.search.Interactor;

import com.fa17.ssu385.fa_2017_h6.network.RecipeSearchAsyncTask;
import com.fa17.ssu385.fa_2017_h6.model.RecipeList;

public class RecipeSearchInteractorlmpl implements RecipeSearchInteractor {

        private OnSearchResponse responseListener;

        public void setResponseListener(OnSearchResponse responseListener) {
            this.responseListener = responseListener;
        }

        @Override
        public void getRecipe(String title, final OnSearchResponse response) {

            RecipeSearchAsyncTask task = new RecipeSearchAsyncTask();

            task.setCallbackListener(new RecipeSearchAsyncTask.OnRecipeFetchResponse() {

                @Override
                public void onCallback(RecipeList recipeList) {
                    if(!recipeList.getRecipes().isEmpty())
                        response.callback(recipeList.getRecipes().get(0));
                }

            });

            task.execute(title);
        }
}

