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
import com.fa17.ssu385.fa_2017_h6.model.RecipeList;
import com.fa17.ssu385.fa_2017_h6.network.RecipeSearchAsyncTask;
import com.fa17.ssu385.fa_2017_h6.ui.search.interactor.RecipeSearchInteractor;
import com.fa17.ssu385.fa_2017_h6.ui.search.interactor.RecipeSearchInteractorImpl;
import com.fa17.ssu385.fa_2017_h6.ui.search.interactor.RecipeSearchInteractorMockImpl;
import com.fa17.ssu385.fa_2017_h6.ui.search.presenter.SearchPresenter;
import com.fa17.ssu385.fa_2017_h6.ui.search.view.SearchView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SearchActivity extends AppCompatActivity implements SearchView {
    private RecipeSearchInteractor interactor;
    private SearchPresenter presenter;
    private RecipeSearchInteractorMockImpl mockInteractor;

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
        //  required call to bind when using Butterknife
        ButterKnife.bind(this);

        mockInteractor = new RecipeSearchInteractorMockImpl();
        interactor = new RecipeSearchInteractorImpl();
        //presenter = new SearchPresenter(this, interactor);
        presenter = new SearchPresenter(this, mockInteractor);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.getResults(searchInput.getText().toString());
                 /*
                RecipeSearchAsyncTask task = new RecipeSearchAsyncTask();
                task.setCallbackListener(new RecipeSearchAsyncTask.OnRecipeFetchResponse() {
                    @Override
                    public void onCallback(RecipeList recipeList) {
                        Recipe result = recipeList.getRecipes().get(0);
                        Glide.with(SearchActivity.this)
                                .load(result.getThumbnailSources().get(0))
                                .into(recipeThumbnail);
                        recipeName.setText(result.getName());
                    }
                });
                task.execute(searchInput.getText().toString());
                */
            }
        });
    }

    @Override
    public void displayResult(Recipe rec){
        recipeName.setText(rec.getName());
        //leave empty
    }




}
