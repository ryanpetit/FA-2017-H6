package com.fa17.ssu385.fa_2017_h6.ui.search;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.fa17.ssu385.fa_2017_h6.R;
import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.model.RecipeList;
import com.fa17.ssu385.fa_2017_h6.network.RecipeSearchAsyncTask;
import com.fa17.ssu385.fa_2017_h6.ui.search.adapter.RecipeSearchAdapter;
import com.fa17.ssu385.fa_2017_h6.ui.search.detail.viewcontroller.RecipeDetailActivity;
import com.fa17.ssu385.fa_2017_h6.ui.search.interactor.RecipeSearchInteractor;
import com.fa17.ssu385.fa_2017_h6.ui.search.interactor.RecipeSearchInteractorImpl;
import com.fa17.ssu385.fa_2017_h6.ui.search.interactor.RecipeSearchInteractorMockImpl;
import com.fa17.ssu385.fa_2017_h6.ui.search.presenter.SearchPresenter;
import com.fa17.ssu385.fa_2017_h6.ui.search.view.SearchView;

import org.parceler.Parcels;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SearchActivity extends AppCompatActivity implements SearchView{

    private RecipeSearchInteractor interactor;
    private SearchPresenter presenter;
    private RecipeSearchInteractorMockImpl mockInteractor;
    private LinearLayoutManager linearLayoutManager;
    private RecipeSearchAdapter recipeSearchAdapter;
    private RecyclerView recipeList;

    @BindView(R.id.search_input)
    public EditText searchInput;

//    @BindView(R.id.recipe_thumbnail)
//    public ImageView recipeThumbnail;

    @BindView(R.id.my_search_button)
    public Button searchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        //  required call to bind when using Butterknife
        ButterKnife.bind(this);
        //mockInteractor = new RecipeSearchInteractorMockImpl();

        recipeList = (RecyclerView)findViewById(R.id.recipe_result_list);
        linearLayoutManager = new LinearLayoutManager(this);
        recipeList.setLayoutManager(linearLayoutManager);
        interactor = new RecipeSearchInteractorImpl();
        presenter = new SearchPresenter(this, interactor);
        searchButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                presenter.getResults(searchInput.getText().toString());
            }
        });
    }

    @Override
    public void displayResult(RecipeList recipes) {

        recipeSearchAdapter = new RecipeSearchAdapter(recipes);
        recipeSearchAdapter.setRecipeItemClickListener(new RecipeSearchAdapter.RecipeItemClickListener() {
            @Override
            public void onRecipeItemClicked(Recipe selectedItem) {
                Intent navIntent = new Intent(SearchActivity.this, RecipeDetailActivity.class);
                navIntent.putExtra(RecipeDetailActivity.RECIPE_EXTRA_KEY, Parcels.wrap(selectedItem));
                startActivity(navIntent);
            }
        });
        recipeList.setAdapter(recipeSearchAdapter);

        //recipeName.setText(recipe.getName());
        //Glide.with(this).load(recipe.getThumbnailSources().get(0))
          //    .into(recipeThumbnail);
    }
}
