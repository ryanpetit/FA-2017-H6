package com.fa17.ssu385.fa_2017_h6.ui.search.interactor;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by student on 11/28/17.
 */

public class RecipeSearchInteractorMockImpl implements RecipeSearchInteractor {

    @Override
    public void getRecipe(String string, OnSearchResponse listener) {
        listener.callback(new Recipe.Builder()
                .recipeId("1")
                .thumbnailSources(new ArrayList<String>(Arrays.asList("http://travel.home.sndimg.com/content/dam/images/travel/fullset/2014/07/20/32/food-paradise-102-ss-001.rend.hgtvcom.966.544.suffix/1491584380240.jpeg")))
                .name("Good Ass Sandwich").build());

    }
}
