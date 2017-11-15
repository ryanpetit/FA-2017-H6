package com.fa17.ssu385.fa_2017_h6.ui.search;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.model.RecipeList;
import com.fa17.ssu385.fa_2017_h6.network.RecipeSearchAsyncTask;

import java.util.ArrayList;

public class RecipeSearchInteractorMockImpl implements RecipeSearchInteractor  {
    private OnSearchResponse responseListener;

    public void setResponseListener(OnSearchResponse responseListener) {
        this.responseListener = responseListener;
    }

    @Override
    public void getRecipe(String title, final OnSearchResponse searchResponse) {
        ArrayList<String> thumbs = new ArrayList<String>();
        thumbs.add("http://food.fnr.sndimg.com/content/dam/images/food/video/0/01/018/0186/0186701.jpg.rend.hgtvcom.616.462.suffix/1481335396438.jpeg");
        searchResponse.callback(new Recipe.Builder().name("Spaghetti").thumbnailSources(thumbs).build());
    }
}
