package com.fa17.ssu385.fa_2017_h6.ui.search.presenter;


import com.fa17.ssu385.fa_2017_h6.ui.search.SearchActivity;
import com.fa17.ssu385.fa_2017_h6.ui.search.interactor.SearchInteractor;
import com.fa17.ssu385.fa_2017_h6.ui.search.view.SearchView;

public class SearchPresenter {
    private SearchView view;
    private SearchInteractor.RecipeSearchInteractor interactor;


    public SearchPresenter(SearchView view, SearchInteractor.RecipeSearchInteractor interactor) {
        this.view = view;
        this.interactor = interactor;
    }
}
