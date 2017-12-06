package com.fa17.ssu385.fa_2017_h6.ui.search.Presenter;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.ui.search.Interactor.RecipeSearchInteractor;
import com.fa17.ssu385.fa_2017_h6.ui.search.View.SearchView;

public class SearchPresenter {
    private SearchView view;
    private RecipeSearchInteractor interactor;

    public SearchPresenter(SearchView view, RecipeSearchInteractor interactor) {
        this.view = view;
        this.interactor = interactor;
    }

    public void getResults(String keywords) {
        interactor.getRecipe(keywords, new RecipeSearchInteractor.OnSearchResponse() {
            @Override
            public void callback(Recipe recipe) {
                view.displayResult(recipe);
            }
        });
    }
}