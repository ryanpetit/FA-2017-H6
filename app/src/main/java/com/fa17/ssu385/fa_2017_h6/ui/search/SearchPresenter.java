package com.fa17.ssu385.fa_2017_h6.ui.search;

/**
 * Created by Ashlop on 11/19/17.
 */

public class SearchPresenter {
    private SearchView view;
    private RecipeSearchInteractor interactor;

    SearchPresenter(SearchView myView, RecipeSearchInteractor myInteractor){
        this.view = myView;
        this.interactor = myInteractor;
    }
}
