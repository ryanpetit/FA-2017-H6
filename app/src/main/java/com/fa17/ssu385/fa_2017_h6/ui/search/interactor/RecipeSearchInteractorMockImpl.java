package com.fa17.ssu385.fa_2017_h6.ui.search.interactor;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.model.RecipeList;
import com.fa17.ssu385.fa_2017_h6.network.RecipeSearchAsyncTask;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Kurt on 11/25/17.
 */

public class RecipeSearchInteractorMockImpl implements RecipeSearchInteractor {
    @Override
    public void getRecipe(String search, final OnSearchResponse responseAction) {
        responseAction.callback(new Recipe.Builder()
                .recipeId("Number_1")
                .name("Thanksgiving food")
                .thumbnailSources(new ArrayList<String>(Arrays.asList("https://pbs.twimg.com/profile_images/914239697907355648/xTkPwVLA_bigger.jpg")))
                .build()
        );
    }

}
