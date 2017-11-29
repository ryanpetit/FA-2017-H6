package com.fa17.ssu385.fa_2017_h6.ui.search.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.fa17.ssu385.fa_2017_h6.R;
import com.fa17.ssu385.fa_2017_h6.model.Recipe;

public class RecipeItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    private TextView recipeName;
    private ImageView recipeThumbnail;
    private TextView sourceDisplayName;
    private OnItemClickedListener listener;

    // setter for OnItemClickedListener
    public void setListener(OnItemClickedListener listener) {
        this.listener = listener;
    }

    public RecipeItemViewHolder(View itemView) {
        super(itemView);

        recipeName = (TextView)itemView.findViewById(R.id.recipe_name);
        recipeThumbnail = (ImageView)itemView.findViewById(R.id.recipe_thumbnail);
    }

    public void bindView(Recipe item) {
        recipeName.setOnClickListener(this);
        recipeThumbnail.setOnClickListener(this);
        // sourceDisplayName.setOnClickListener(this);

        recipeName.setText(item.getName());
        // sourceDisplayName.setText(item.getSource());

        Glide.with(this.itemView)
                .load(item.getThumbnailSources().get(0))
                .into(recipeThumbnail);
    }

    @Override
    public void onClick(View view) {
        listener.onItemClicked(RecipeItemViewHolder.this.getLayoutPosition());
    }

    public interface OnItemClickedListener {
        void onItemClicked(int position);
    }

}