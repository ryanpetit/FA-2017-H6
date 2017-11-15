package com.fa17.ssu385.fa_2017_h6.ui.search.Presenter;

import com.fa17.ssu385.fa_2017_h6.ui.search.Interactor.RecipeSearchInteractor;
import com.fa17.ssu385.fa_2017_h6.ui.search.View.SearchView;

/**
 * Created by ctwatson on 11/14/17.
 */

public class SearchPresenter {
    private SearchView view;
    private RecipeSearchInteractor interactor;

    public SearchPresenter (SearchView v, RecipeSearchInteractor i) {
        view = v;
        interactor = i;
    }
}
