package com.fa17.ssu385.fa_2017_h6.ui.search.presenter;

import android.widget.SearchView;

import com.fa17.ssu385.fa_2017_h6.ui.search.interactor.RecipeSearchInteractor;

/**
 * Created by student on 11/7/17.
 */

public class SearchPresenter {

    private SearchView view;
    private RecipeSearchInteractor interactor;

    void SearchPresenter(SearchView view, RecipeSearchInteractor interactor){
        this.view = view;
        this.interactor = interactor;
    }

}
