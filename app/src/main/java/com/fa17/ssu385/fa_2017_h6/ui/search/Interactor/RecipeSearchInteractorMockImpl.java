package com.fa17.ssu385.fa_2017_h6.ui.search.Interactor;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.model.RecipeList;
import com.fa17.ssu385.fa_2017_h6.network.RecipeSearchAsyncTask;
import java.util.ArrayList;

public class RecipeSearchInteractorMockImpl implements RecipeSearchInteractor {

    private OnSearchResponse responseListener;

    public void setResponseListener(OnSearchResponse responseListener) {
        this.responseListener = responseListener;
    }

    @Override
    public void getRecipe(String title, final OnSearchResponse response) {

        ArrayList<String> thumbs = new ArrayList<String>();
        thumbs.add("https://static01.nyt.com/images/2017/03/24/dining/24COOKING-CLASSICPANCAKES/24COOKING-CLASSICPANCAKES-videoSixteenByNineJumbo1600.jpg");
        response.callback(new Recipe.Builder().name("pancakes").thumbnailSources(thumbs).build());

    }
}
