package com.fa17.ssu385.fa_2017_h6.ui.detail;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.fa17.ssu385.fa_2017_h6.R;
import com.fa17.ssu385.fa_2017_h6.model.Recipe;

import org.parceler.Parcels;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Kurt on 11/29/17.
 */

public class RecipeDetailActivity extends AppCompatActivity{
    public static final String RECIPE_EXTRA_KEY = "recipeExtraKey";
    @BindView(R.id.recipe_detail_name)
    public TextView recipeDetailName;
    @BindView(R.id.recipe_description)
    public TextView recipeDescription;
    @BindView(R.id.recipe_detail_image)
    public ImageView recipeDetainImage;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_detail);
        ButterKnife.bind(this);
        Recipe recipe = Parcels.unwrap(getIntent().getParcelableExtra(RECIPE_EXTRA_KEY));
        recipeDetailName.setText(recipe.getName());
        recipeDescription.setText(recipe.getSource());
        Glide.with(this).load(recipe.getThumbnailSources().get(0)).into(recipeDetainImage);
    }
}
