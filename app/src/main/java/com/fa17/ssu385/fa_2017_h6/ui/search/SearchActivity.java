package com.fa17.ssu385.fa_2017_h6.ui.search;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.fa17.ssu385.fa_2017_h6.R;
import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.ui.search.interactor.RecipeSearchInteractorMockImpl;
import com.fa17.ssu385.fa_2017_h6.ui.search.interactor.SearchInteractor;
import com.fa17.ssu385.fa_2017_h6.ui.search.presenter.SearchPresenter;
import com.fa17.ssu385.fa_2017_h6.ui.search.view.SearchView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SearchActivity extends AppCompatActivity implements SearchView {

    // Butterknife is used to bind view elements
    @BindView(R.id.my_search_button)
    public Button searchButton;

    @BindView(R.id.search_input)
    public EditText searchInput;

    @BindView(R.id.recipe_thumbnail)
    public ImageView recipeThumbnail;

    @BindView(R.id.recipe_name)
    public TextView recipeName;

    private SearchInteractor.RecipeSearchInteractor mockData;
    //private RecipeSearchInteractor interactor;
    private SearchPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        //  required call to bind when using Butterknife
        ButterKnife.bind(this);

        mockData = new RecipeSearchInteractorMockImpl();
        presenter = new SearchPresenter(this, mockData);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.getResults(searchInput.getText().toString());
            }
        });
    }

    @Override
    public void displayResult(Recipe recipe) {
        recipeName.setText(recipe.getName());
        Glide.with(recipeThumbnail)
                .load(recipe.getThumbnailSources().get(0))
                .into(recipeThumbnail);

    }
}
