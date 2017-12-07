package com.fa17.ssu385.fa_2017_h6.ui.search.presenter;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.model.RecipeList;
import com.fa17.ssu385.fa_2017_h6.ui.search.interactor.RecipeSearchInteractor;
import com.fa17.ssu385.fa_2017_h6.ui.search.interactor.RecipeSearchInteractorImpl;
import com.fa17.ssu385.fa_2017_h6.ui.search.view.SearchView;

public class SearchPresenter {

        private SearchView view;
        private RecipeSearchInteractor interactor;

        public SearchPresenter (SearchView v, RecipeSearchInteractor i) {
            this.view = v;
            this.interactor = i;
        }

        public void getResults(String keywords) {
            interactor.getRecipe(keywords, new RecipeSearchInteractorImpl.OnSearchResponse() {
                @Override
                public void callback(RecipeList recipeList) {
                    view.displayResult(recipeList);
                }
            });
        }
}
