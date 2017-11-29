package com.fa17.ssu385.fa_2017_h6.ui.search.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.fa17.ssu385.fa_2017_h6.R;
import com.fa17.ssu385.fa_2017_h6.model.Recipe;

/**
 * Created by student on 11/28/17.
 */

public class RecipeItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private TextView recipeName;
    private ImageView recipeThumbnail;
    private OnItemClickedListener listener;


    public RecipeItemViewHolder(View itemView) {
        super(itemView);

        recipeName = (TextView)itemView.findViewById(R.id.recipe_name);
        recipeThumbnail = (ImageView)itemView.findViewById(R.id.recipe_thumbnail);
        recipeName.setOnClickListener(this);
        recipeThumbnail.setOnClickListener(this);
    }

    public void bindView(Recipe recipe) {
        recipeName.setText(recipe.getName());
        Glide.with(this.itemView)
                .load(recipe.getThumbnailSources().get(0))
                .into(recipeThumbnail);
    }

    public void setOnItemClickedListener(OnItemClickedListener listener) {
        this.listener = listener;
    }

    @Override
    public void onClick(View view) {
        Log.d("ONCLICK", "GETTING HEREß");
        listener.onItemClicked(RecipeItemViewHolder.this.getLayoutPosition());
    }

    public interface OnItemClickedListener {
        void onItemClicked(int position);
    }
}
