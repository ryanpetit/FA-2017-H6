package com.fa17.ssu385.fa_2017_h6.ui.search.interactor;


import com.fa17.ssu385.fa_2017_h6.model.Recipe;

public class SearchInteractor {
    public interface RecipeSearchInteractor {
        public interface OnSearchResponse {
            void callback(Recipe recipe);
        }

        void getRecipe(String recipe, OnSearchResponse onSearchResponse);
    }
}
