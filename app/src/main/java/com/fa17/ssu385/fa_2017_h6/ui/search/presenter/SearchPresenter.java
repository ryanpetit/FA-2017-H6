package com.fa17.ssu385.fa_2017_h6.ui.search.presenter;

import android.widget.SearchView;
import android.widget.SectionIndexer;

import com.fa17.ssu385.fa_2017_h6.ui.search.interactor.RecipeSearchInteractor;

/**
 * Created by Kurt on 11/9/17.
 */

public class SearchPresenter {
    private SearchView view;
    private RecipeSearchInteractor interactor;

    public SearchPresenter(SearchView v, RecipeSearchInteractor i){
        view = v;
        interactor = i;
    }
}
