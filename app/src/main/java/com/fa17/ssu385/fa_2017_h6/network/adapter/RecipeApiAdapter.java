package com.fa17.ssu385.fa_2017_h6.network.adapter;

import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.model.RecipeList;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import io.reactivex.Observable;

public interface RecipeApiAdapter {

    @GET("v1/api/recipes")
    Observable<RecipeList> getRecipes(@Query("_app_key") String appKey,
                                      @Query("_app_id") String appId,
                                      @Query("q") String searchTerms);

    @GET("v1/api/{recipe-id}")
    Observable<Recipe> getRecipeById(@Path("recipe-id") String id,
                                     @Query("_app_key") String appKey,
                                     @Query("_app_id") String appId);
}