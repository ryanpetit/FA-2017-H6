package com.fa17.ssu385.fa_2017_h6.ui.search;

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
}
