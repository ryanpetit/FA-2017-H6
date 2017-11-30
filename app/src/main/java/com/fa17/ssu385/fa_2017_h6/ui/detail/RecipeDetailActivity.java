package com.fa17.ssu385.fa_2017_h6.ui.detail;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.fa17.ssu385.fa_2017_h6.R;
import com.fa17.ssu385.fa_2017_h6.model.Recipe;

import org.parceler.Parcels;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecipeDetailActivity extends AppCompatActivity {
    public static final String RECIPE_EXTRA_KEY = "recipeExtraKey";

    @BindView(R.id.recipe_detail_name)
    public TextView recipeDetailName;

    @BindView(R.id.recipe_description)
    public TextView recipeDescription;

    @BindView(R.id.recipe_detail_image)
    public ImageView recipeDetailImage;

    @BindView(R.id.recipe_id_num)
    public TextView recipeId;

    @BindView(R.id.recipe_time)
    public TextView recipeTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_detail);

        ButterKnife.bind(this);

        Recipe recipe = Parcels.unwrap(getIntent().getParcelableExtra(RECIPE_EXTRA_KEY));
        recipeDetailName.setText(recipe.getName());

        ArrayList<String> list = recipe.getIngredients();
        String ingredients = "Ingredients: \n     ";
        for (int i = 0; i < list.size(); i++) {
            ingredients += list.get(i);
            if (i != list.size() - 1) {
                ingredients += ", ";
            } else {
                ingredients += ".";
            }
        }
        recipeDescription.setText(ingredients);
        recipeId.setText(recipe.getRecipeId());

        recipeTime.setText("Prep Time: ~" + Integer.toString((Integer.parseInt(recipe.getTotalTimeInSeconds())/60)) + "min");


        Glide.with(this).load(recipe.getThumbnailSources().get(0)).into(recipeDetailImage);

    }
}
