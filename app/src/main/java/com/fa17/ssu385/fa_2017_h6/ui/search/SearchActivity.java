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
import org.parceler.Parcels;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SearchActivity extends AppCompatActivity implements SearchView {

    // Butterknife used to bind view elements
    @BindView(R.id.my_search_button)
    public Button searchButton;

    @BindView(R.id.search_input)
    public EditText searchInput;

   // @BindView(R.id.recipe_thumbnail)
   // public ImageView recipeThumbnail;

    //@BindView(R.id.recipe_name)
    //public TextView recipeName;

    //things for recyclerview
    private LinearLayoutManager linearLayoutManager;
    private RecyclerView recipeResultList;
    private RecipeSearchAdapter adapter;

    private RecipeSearchInteractor interactor;
    private SearchPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        //  required call to bind when using Butterknife
        ButterKnife.bind(this);

        //butterknife doesn't like recyclerviews
        recipeResultList = (RecyclerView)findViewById(R.id.recipe_result_list);
        //interactor = new RecipeSearchInteractorMockImpl();
        interactor = new RecipeSearchInteractorImpl();
        presenter = new SearchPresenter(this, interactor);

        //layout manager for recyclerview
        linearLayoutManager = new LinearLayoutManager(this);
        recipeResultList.setLayoutManager(linearLayoutManager);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.getResults(searchInput.getText().toString());

            }
        });
    }

    @Override
    public void displayResult(RecipeList result) {
        adapter = new RecipeSearchAdapter(result.getRecipes());
        adapter.setRecipeItemClickListener(new RecipeSearchAdapter.RecipeItemClickListener(){

            @Override
            public void onRecipeItemClicked(Recipe selectedItem) {
                Intent navIntent = new Intent(SearchActivity.this, RecipeDetailActivity.class);
                navIntent.putExtra(RecipeDetailActivity.RECIPE_EXTRA_KEY, Parcels.wrap(selectedItem));
                startActivity(navIntent);
            }
        });
        recipeResultList.setAdapter(adapter);
        //recipeName.setText(result.getName());
        //Glide.with(this).load(result.getThumbnailSources().get(0)).into(recipeThumbnail);

    }
}
