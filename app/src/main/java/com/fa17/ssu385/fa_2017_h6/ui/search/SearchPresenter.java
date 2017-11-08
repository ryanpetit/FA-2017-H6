package com.fa17.ssu385.fa_2017_h6.ui.search;

import android.widget.SearchView;

public class SearchPresenter {
    private SearchView view;
    RecipeSearchInteractor interactor;

    public SearchPresenter(SearchView view, RecipeSearchInteractor interactor) {
        this.view = view;
        this.interactor = interactor;
    }

}
