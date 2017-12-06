package com.fa17.ssu385.fa_2017_h6.ui.search;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.fa17.ssu385.fa_2017_h6.R;
import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.ui.search.Interactor.RecipeSearchInteractor;
import com.fa17.ssu385.fa_2017_h6.ui.search.Interactor.RecipeSearchInteractorlmpl;
import com.fa17.ssu385.fa_2017_h6.ui.search.Interactor.RecipeSearchInteractorMockImpl;
import com.fa17.ssu385.fa_2017_h6.ui.search.Presenter.SearchPresenter;
import com.fa17.ssu385.fa_2017_h6.ui.search.View.SearchView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SearchActivity extends AppCompatActivity implements SearchView {

    RecipeSearchInteractor interactor;
    SearchPresenter presenter;

    // Butterknife used to bind view elements
    @BindView(R.id.my_search_button)
    public Button searchButton;

    @BindView(R.id.search_input)
    public EditText searchInput;

    @BindView(R.id.recipe_thumbnail)
    public ImageView recipeThumbnail;

    @BindView(R.id.recipe_name)
    public TextView recipeName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        ButterKnife.bind(this);
        RecipeSearchInteractorMockImpl mock = new RecipeSearchInteractorMockImpl();

        interactor = new RecipeSearchInteractorMockImpl();
        presenter = new SearchPresenter(this, mock);
        searchButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                presenter.getResults(searchInput.getText().toString());
            }

        });
    }

    @Override
    public void displayResult(Recipe recipe) {

        Glide.with(this)
                .load(recipe.getThumbnailSources().get(0))
                .into(recipeThumbnail);
        recipeName.setText(recipe.getName());
    }

}
