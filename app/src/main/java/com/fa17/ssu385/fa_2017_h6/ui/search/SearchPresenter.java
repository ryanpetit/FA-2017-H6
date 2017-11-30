package com.fa17.ssu385.fa_2017_h6.ui.search;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;

/**
 * Created by Ashlop on 11/28/17.
 */

class SearchPresenter {
    private SearchView view;
    private RecipeSearchInteractor interactor;

    SearchPresenter(SearchActivity myView, RecipeSearchInteractor myInteractor){
        this.view = myView;
        this.interactor = myInteractor;
    }

    public void getResults(String keywords){
        interactor.getRecipe(keywords, new RecipeSearchInteractor.OnSearchResponse(){
            @Override
            public void callback(Recipe result){
                view.displayResult(result);
            }
        });
    }
}
