package com.fa17.ssu385.fa_2017_h6.ui.search.Presenter;

import android.util.Log;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.model.RecipeList;
import com.fa17.ssu385.fa_2017_h6.ui.search.Interactor.RecipeSearchInteractor;
import com.fa17.ssu385.fa_2017_h6.ui.search.View.SearchView;

/**
 * Created by student on 11/7/17.
 */

public class SearchPresenter {
    private SearchView view;
    private RecipeSearchInteractor interactor;

    public SearchPresenter(SearchView view, RecipeSearchInteractor interactor) {
        this.view = view;
        this.interactor = interactor;
    }

    public void getResults(String keywords) {
        interactor.getRecipeList(keywords, new RecipeSearchInteractor.OnSearchResponse() {
            @Override
            public void callback(RecipeList list) {
                Log.d("ONCLICK", "GETTING HEREß");
                view.displayResults(list); }
        });
    }
}
