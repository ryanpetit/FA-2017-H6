package com.fa17.ssu385.fa_2017_h6.ui.search.presenter;


import android.widget.SectionIndexer;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.ui.search.interactor.RecipeSearchInteractor;
import com.fa17.ssu385.fa_2017_h6.ui.search.view.SearchView;

/**
 * Created by Kurt on 11/9/17.
 */

public class SearchPresenter implements SearchView {
    private SearchView view;
    private RecipeSearchInteractor interactor;


    public SearchPresenter(com.fa17.ssu385.fa_2017_h6.ui.search.view.SearchView v, RecipeSearchInteractor i){
        view = v;
        interactor = i;
    }

    @Override
    public void displayResult(Recipe recipe) {

    }
}
