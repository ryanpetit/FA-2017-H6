package com.fa17.ssu385.fa_2017_h6.ui.search.Interactor;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.model.RecipeList;

/**
 * Created by student on 11/7/17.
 */

public interface RecipeSearchInteractor {
    interface OnSearchResponse {
        void callback(RecipeList list);
    }
    void getRecipeList(String title, OnSearchResponse response);
}
