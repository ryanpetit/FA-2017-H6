package com.fa17.ssu385.fa_2017_h6.ui.search.search.presenter;


import com.fa17.ssu385.fa_2017_h6.model.RecipeList;
import com.fa17.ssu385.fa_2017_h6.ui.search.search.interactor.RecipeSearchInteractor;
import com.fa17.ssu385.fa_2017_h6.ui.search.search.view.SearchView;

public class SearchPresenter implements SearchView {
    private SearchView view;
    private RecipeSearchInteractor interactor;

    public void getResults(String keywords){
        interactor.getRecipeList(keywords, new RecipeSearchInteractor.OnSearchResponse() {
            @Override
            public void callback(RecipeList recipeList) {
                view.displayResult(recipeList);
            }
        });
    }

    public SearchPresenter(SearchView v, RecipeSearchInteractor i){
        view = v;
        interactor = i;
    }

    @Override
    public void displayResult(RecipeList recipeList) {

    }
}
