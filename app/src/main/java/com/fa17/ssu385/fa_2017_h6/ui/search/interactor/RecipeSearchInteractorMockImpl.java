package com.fa17.ssu385.fa_2017_h6.ui.search.interactor;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.model.RecipeList;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by student on 11/28/17.
 */

public class RecipeSearchInteractorMockImpl implements RecipeSearchInteractor {

    @Override
    public void getRecipe(String string, OnSearchResponse listener) {
        listener.callback(new Recipe.Builder()
                .recipeId("276")
                .name("Food")
                .thumbnailSources(new ArrayList<String>(Arrays.asList("http://cdn-image.myrecipes.com/sites/default/files/styles/4_3_horizontal_-_1200x900/public/image/recipes/ck/11/04/seared-strip-steak-ck-x.jpg?itok=2ukHtBa3")))
                .build());
    }

}
