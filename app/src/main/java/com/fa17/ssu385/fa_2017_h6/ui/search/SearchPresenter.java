package com.fa17.ssu385.fa_2017_h6.ui.search;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;

/**
 * Created by Brooke on 11/2/2017.
 */

public class SearchPresenter {
    private SearchView view;
    private RecipeSearchInteractor interactor;

    SearchPresenter(SearchView myView, RecipeSearchInteractor myInteractor){
        this.view = myView;
        this.interactor = myInteractor;
    }

    public void getResults(String keywords){
        interactor.getRecipe(keywords, new RecipeSearchInteractor.OnSearchResponse() {
            @Override
            public void callback(Recipe result) {
                view.displayResult(result);
            }
        });
    }
}
