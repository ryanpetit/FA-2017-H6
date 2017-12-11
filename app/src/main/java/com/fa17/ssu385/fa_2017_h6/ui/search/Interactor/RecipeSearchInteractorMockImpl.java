package com.fa17.ssu385.fa_2017_h6.ui.search.Interactor;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.model.RecipeList;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ctwatson on 11/29/17.
 */

public class RecipeSearchInteractorMockImpl implements RecipeSearchInteractor {
    private OnSearchResponse responseListener;

    public void setResponseListener (OnSearchResponse responseListener) {
        this.responseListener = responseListener;
    }

    @Override
    public void getRecipe(String string, final OnSearchResponse response) {
        Recipe recipe = new Recipe.Builder()
                                .recipeId("recipe id")
                                .ingredients(new ArrayList<String>(Arrays.asList("vegan shit", "more vegan shit", "even more vegan shit")))
                                .name("Shite Vegan Food")
                                .build();
        ArrayList<Recipe> recipes = new ArrayList<Recipe>();
        recipes.add(recipe);
        response.callback(new RecipeList.Builder().recipes(recipes).build());
    }
}
