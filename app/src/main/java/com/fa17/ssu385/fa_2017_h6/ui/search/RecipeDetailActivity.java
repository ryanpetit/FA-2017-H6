package com.fa17.ssu385.fa_2017_h6.ui.search;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.ImageViewTarget;
import com.fa17.ssu385.fa_2017_h6.R;
import com.fa17.ssu385.fa_2017_h6.model.Recipe;

import org.parceler.Parcels;
import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecipeDetailActivity extends AppCompatActivity {
    public static final String RECIPE_EXTRA_KEY = "recipeExtraKey";

    @BindView(R.id.recipe_detail_name)
    public TextView recipeDetailName;

    @BindView(R.id.recipe_description)
    public TextView recipeSourceDisplayName;

    @BindView(R.id.recipe_detail_image)
    public ImageView recipeDetailImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_detail);

        ButterKnife.bind(this);

        Recipe recipe = Parcels.unwrap(getIntent().getParcelableExtra(RECIPE_EXTRA_KEY));

        recipeDetailName.setText(recipe.getName());
        recipeSourceDisplayName.setText(recipe.getSource());

        Glide.with(this).load(recipe.getThumbnailSources().get(0)).into(recipeDetailImage);

    }
}
