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
import com.fa17.ssu385.fa_2017_h6.ui.search.Adapter.RecipeSearchAdapter;
import com.fa17.ssu385.fa_2017_h6.ui.search.Interactor.RecipeSearchInteractor;
import com.fa17.ssu385.fa_2017_h6.ui.search.Interactor.RecipeSearchInteractorImpl;
import com.fa17.ssu385.fa_2017_h6.ui.search.Presenter.SearchPresenter;
import com.fa17.ssu385.fa_2017_h6.ui.search.View.SearchView;
import org.parceler.Parcels;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SearchActivity extends AppCompatActivity implements SearchView {
    private RecipeSearchInteractor interactor;
    private SearchPresenter presenter;
    private RecipeSearchAdapter recipeSearchAdapter;
    private LinearLayoutManager linearLayoutManager;
    public RecyclerView recyclerView;

    // Butterknife used to bind view elements
    @BindView(R.id.my_search_button)
    public Button searchButton;

    @BindView(R.id.search_input)
    public EditText searchInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        //  required call to bind when using Butterknife
        ButterKnife.bind(this);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView = (RecyclerView) findViewById(R.id.recipe_results);
        recyclerView.setLayoutManager(linearLayoutManager);

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
    public void displayResult (RecipeList recipeList) {
        recipeSearchAdapter = new RecipeSearchAdapter(recipeList.getRecipes());
        recipeSearchAdapter.setRecipeItemClickListener(new RecipeSearchAdapter.RecipeItemClickListener() {
            @Override
            public void onRecipeItemClicked(Recipe selectedItem) {
                Intent intent = new Intent(SearchActivity.this, RecipeDetailActivity.class);
                intent.putExtra(RecipeDetailActivity.RECIPE_EXTRA_KEY, Parcels.wrap(selectedItem));
                startActivity(intent);
            }
        });
        recyclerView.setAdapter(recipeSearchAdapter);
    }
}
