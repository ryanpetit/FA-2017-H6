package com.fa17.ssu385.fa_2017_h6.ui.search.presenter;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.ui.search.interactor.RecipeSearchInteractor;
import com.fa17.ssu385.fa_2017_h6.ui.search.view.SearchView;

/**
 * Created by ryanpetit787 on 11/14/17.
 */

public class SearchPresenter {

        private SearchView view;
        private RecipeSearchInteractor interactor;

        public SearchPresenter (SearchView V, RecipeSearchInteractor I) {
            this.view = V;
            this.interactor = I;
        }

        public void getResults(String keywords){
            interactor.getRecipe(keywords, new RecipeSearchInteractor.OnSearchResponse() {
                @Override
                public void callback(Recipe recipe) {
                    view.displayResult(recipe);
                }
            });
        }
}
