package com.fa17.ssu385.fa_2017_h6.ui.search.presenter;

import com.fa17.ssu385.fa_2017_h6.ui.search.interactor.RecipeSearchInteractor;
import com.fa17.ssu385.fa_2017_h6.ui.search.view.SearchView;

/**
 * Created by Hydrilusx on 11/8/2017.
 */

public class SearchPresenter {
    private SearchView view;
    private RecipeSearchInteractor interactor;

    void SearchPresenter(SearchView aView, RecipeSearchInteractor aInteractor) {
        this.view = aView;
        this.interactor = aInteractor;
    }

}