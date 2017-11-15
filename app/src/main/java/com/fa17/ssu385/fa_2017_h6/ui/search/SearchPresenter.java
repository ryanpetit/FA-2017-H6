package com.fa17.ssu385.fa_2017_h6.ui.search;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;

public class SearchPresenter {
    private SearchView view;
    RecipeSearchInteractor interactor;

    public SearchPresenter(SearchView view, RecipeSearchInteractor interactor) {
        this.view = view;
        this.interactor = interactor;
    }

    public void getResults(String keywords){
        interactor.getRecipe(keywords, new RecipeSearchInteractor.OnSearchResponse() {
            @Override
            public void callback(Recipe recipe) {
                view.displayResult(recipe);
            }
        });
    }

}
