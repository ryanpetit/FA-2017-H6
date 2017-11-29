package com.fa17.ssu385.fa_2017_h6.ui.search.Interactor;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.model.RecipeList;
import com.fa17.ssu385.fa_2017_h6.network.RecipeSearchAsyncTask;

import java.util.ArrayList;

/**
 * Created by hayleygerard on 11/28/17.
 */

public class RecipeSearchInteractorMockImpl implements RecipeSearchInteractor {
    private OnSearchResponse responseListener;

    public void setResponseListener(OnSearchResponse responseListener){
        this.responseListener =responseListener;
    }

    @Override
    public void getRecipe(String title, final OnSearchResponse response) {
        ArrayList<String> thumbs = new ArrayList<String>();
        thumbs.add("https://media1.s-nbcnews.com/i/newscms/2017_28/1227790/cauliflower-tacos-today-170711-tease_71e80d9474e61c857412af888201d716.jpg");
        response.callback(new Recipe.Builder().name("Tacos").thumbnailSources(thumbs).build());
    }

}
