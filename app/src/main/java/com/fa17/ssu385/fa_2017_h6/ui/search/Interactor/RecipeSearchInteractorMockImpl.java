package com.fa17.ssu385.fa_2017_h6.ui.search.Interactor;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.model.RecipeList;
import com.fa17.ssu385.fa_2017_h6.network.RecipeSearchAsyncTask;

import java.util.ArrayList;

/**
 * Created by student on 11/14/17.
 */

public class RecipeSearchInteractorMockImpl implements RecipeSearchInteractor {
    private OnSearchResponse responseListener;

    public void setResponseListener(OnSearchResponse responseListener) {
        this.responseListener = responseListener;
    }

    @Override
    public void getRecipe(String title, final OnSearchResponse response) {
        // Do Something...
        RecipeSearchAsyncTask task = new RecipeSearchAsyncTask();

        task.setCallbackListener(new RecipeSearchAsyncTask.OnRecipeFetchResponse() {
            @Override
            public void onCallback(RecipeList recipeList) {
                ArrayList<String> ingr = new ArrayList<String>();
                ingr.add("Milk");
                ingr.add("Chocolate");
                ArrayList<String> thumbs = new ArrayList<String>();
                thumbs.add("http://veggieandthebeastfeast.com/wp-content/uploads/2014/11/IMG_1036-768x1024.jpg");
                response.callback(new Recipe.Builder()
                                                    .recipeId("1")
                                                    .name("Hot Chocolate")
                                                    .source("dulcepalacios.net")
                                                    .ingredients(ingr)
                                                    .thumbnailSources(thumbs)
                                                    .build());
            }
        });
        task.execute(title);
    }
}
