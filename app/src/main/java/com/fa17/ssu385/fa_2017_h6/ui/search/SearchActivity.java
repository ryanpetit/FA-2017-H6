package com.fa17.ssu385.fa_2017_h6.ui.search;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.fa17.ssu385.fa_2017_h6.R;
import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.model.RecipeList;
import com.fa17.ssu385.fa_2017_h6.ui.detail.RecipeDetailActivity;
import com.fa17.ssu385.fa_2017_h6.ui.search.adapter.RecipeSearchAdapter;
import com.fa17.ssu385.fa_2017_h6.ui.search.interactor.RecipeSearchInteractor;
import com.fa17.ssu385.fa_2017_h6.ui.search.interactor.RecipeSearchInteractorImpl;
import com.fa17.ssu385.fa_2017_h6.ui.search.presenter.SearchPresenter;
import com.fa17.ssu385.fa_2017_h6.ui.search.view.SearchView;

import org.parceler.Parcels;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SearchActivity extends AppCompatActivity implements SearchView {

    // Butterknife is used to bind view elements
    @BindView(R.id.my_search_button)
    public Button searchButton;

    @BindView(R.id.search_input)
    public EditText searchInput;

    /*@BindView(R.id.recipe_thumbnail)
    public ImageView recipeThumbnail;

    @BindView(R.id.recipe_name)
    public TextView recipeName;*/

    @BindView(R.id.recipe_result_list)
    public RecyclerView recipeResultList;

    private RecipeSearchInteractor interactor;
    private RecipeSearchAdapter adapter;
    private SearchPresenter presenter;
    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        //  required call to bind when using Butterknife
        ButterKnife.bind(this);
        linearLayoutManager = new LinearLayoutManager(this);
        recipeResultList.setLayoutManager(linearLayoutManager);
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
    public void displayResult(RecipeList recipeList) {
        adapter = new RecipeSearchAdapter(recipeList.getRecipes());
        adapter.SetRecipeItemClickListener(new RecipeSearchAdapter.RecipeItemClickListener() {
            @Override
            public void onRecipeItemClicked(Recipe selectedItem) {
                Intent navIntent = new Intent(SearchActivity.this, RecipeDetailActivity.class);
                navIntent.putExtra(RecipeDetailActivity.RECIPE_EXTRA_KEY, Parcels.wrap(selectedItem));
                startActivity(navIntent);
            }
        });
        // This sets the adapter for the RecyclerView
        recipeResultList.setAdapter(adapter);
    }
}
