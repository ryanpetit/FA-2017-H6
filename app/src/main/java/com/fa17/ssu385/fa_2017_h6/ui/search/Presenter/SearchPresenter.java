package com.fa17.ssu385.fa_2017_h6.ui.search.Presenter;


import com.fa17.ssu385.fa_2017_h6.ui.search.view.SearchView;
import com.fa17.ssu385.fa_2017_h6.ui.search.Interactor.RecipeSearchInteractor;


/**
 * Created by blakevollmer on 11/30/17.
 */

public class SearchPresenter {
    SearchView view;
    RecipeSearchInteractor interactor;

    SearchPresenter(SearchView view, RecipeSearchInteractor interactor){
        view = this.view;
        interactor = this.interactor;

    }
}
