package com.fa17.ssu385.fa_2017_h6.ui.search.presenter;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.model.RecipeList;
import com.fa17.ssu385.fa_2017_h6.ui.search.interactor.RecipeSearchInteractor;
import com.fa17.ssu385.fa_2017_h6.ui.search.view.SearchView;

/**
 * Created by student on 11/14/17.
 */

public class SearchPresenter {
    private SearchView view;
    private RecipeSearchInteractor interactor;

    public void getResults(String keywords) {
        interactor.getRecipe(keywords, new RecipeSearchInteractor.OnSearchResponse() {
            @Override
            public void callback(RecipeList recipeList) {
                view.displayResult(recipeList);
            }
        });
    }

    public SearchPresenter(SearchView view, RecipeSearchInteractor interactor){
        this.view = view;
        this.interactor = interactor;
    }
}
