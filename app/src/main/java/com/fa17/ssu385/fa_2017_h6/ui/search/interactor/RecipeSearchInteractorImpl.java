package com.fa17.ssu385.fa_2017_h6.ui.search.interactor;

import android.content.Intent;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.model.RecipeList;
import com.fa17.ssu385.fa_2017_h6.network.RecipeApi;
import com.fa17.ssu385.fa_2017_h6.network.RecipeSearchAsyncTask;
import com.fa17.ssu385.fa_2017_h6.ui.search.SearchActivity;

import org.parceler.Parcels;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;


public class RecipeSearchInteractorImpl implements RecipeSearchInteractor {

    private OnSearchResponse responseListener;
    private RecipeSearchAdapter adapter;

    private final String apiKey = "ec3e34e0bb6801670dbd3dbd02ce7608";
    private final String appId = "4911b643";


    public void setResponseListener(OnSearchResponse responseListener) {
        this.responseListener = responseListener;
    }

    @Override
    public void getRecipe(String search, final OnSearchResponse searchResponse) {

        RecipeApi.adapter().getRecipes(apiKey, appId, search)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<RecipeList>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull RecipeList recipeList) {
                        searchResponse.callback(recipeList);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}

