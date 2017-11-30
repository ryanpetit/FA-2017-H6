package com.fa17.ssu385.fa_2017_h6.ui.search.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.fa17.ssu385.fa_2017_h6.R;
import com.fa17.ssu385.fa_2017_h6.model.Recipe;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Kurt on 11/28/17.
 */

/*public class RecipeItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public interface OnItemClickedListener{
        void onItemClicked(int position);
    }
    private OnItemClickedListener listener;

    @BindView(R.id.recipe_name)
    public TextView recipeName;
    @BindView(R.id.recipe_thumbnail)
    public ImageView recipeThumbnail;
    @BindView(R.id.source_display_name)
    public TextView sourceDisplayName;

    public void setListener(OnItemClickedListener a){listener = a;}

    public RecipeItemViewHolder(View itemView){
        super(itemView);
        ButterKnife.bind(itemView);
    }

    public void bindView(Recipe item) {
        recipeName.setText(item.getName());
        sourceDisplayName.setText(item.getSource());
        Glide.with(this.itemView)
                .load(item.getThumbnailSources().get(0))
                .into(recipeThumbnail);
    }

    @Override
    public void onClick(View view) {
        listener.onItemClicked(RecipeItemViewHolder.this.getLayoutPosition());
    }
}*/

public class RecipeItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    public interface OnItemClickedListener{
        void onItemClicked(int position);
    }
    private OnItemClickedListener listener;
    private TextView recipeName;
    private ImageView recipeThumbnail;
    private TextView sourceDisplayName;
    public void setListener(OnItemClickedListener a){
        listener = a;
    }

    public RecipeItemViewHolder(View itemView) {
        super(itemView);

        recipeName = (TextView)itemView.findViewById(R.id.recipe_name);
        sourceDisplayName = (TextView)itemView.findViewById(R.id.source_display_name);
        recipeThumbnail = (ImageView)itemView.findViewById(R.id.recipe_thumbnail);
        recipeName.setOnClickListener(this);
        sourceDisplayName.setOnClickListener(this);
        recipeThumbnail.setOnClickListener(this);
    }

    public void bindView(Recipe item) {
        recipeName.setText(item.getName());
        sourceDisplayName.setText(item.getSource());
        Glide.with(this.itemView)
                .load(item.getThumbnailSources().get(0))
                .into(recipeThumbnail);
    }

    @Override
    public void onClick(View view) {
        listener.onItemClicked(RecipeItemViewHolder.this.getLayoutPosition());
    }

}



