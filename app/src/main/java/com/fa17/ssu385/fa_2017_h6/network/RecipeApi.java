package com.fa17.ssu385.fa_2017_h6.network;

import com.fa17.ssu385.fa_2017_h6.network.adapter.RecipeApiAdapter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by student on 12/7/17.
 */

public class RecipeApi {
    private static RecipeApi api;

    private RecipeApi() { api = this; }

    final public static RecipeApiAdapter adapter() {
        Gson gson = new GsonBuilder().create();

        final RecipeApiAdapter apiAdapter = new Retrofit.Builder()
                .baseUrl("http://api.yummly.com/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
                .create(RecipeApiAdapter.class);
        return apiAdapter;
    }
}