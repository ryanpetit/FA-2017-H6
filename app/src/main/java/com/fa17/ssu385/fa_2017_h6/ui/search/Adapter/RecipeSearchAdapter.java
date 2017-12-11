package com.fa17.ssu385.fa_2017_h6.ui.search.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fa17.ssu385.fa_2017_h6.R;
import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.ui.search.ViewHolder.RecipeItemViewHolder;

import java.util.ArrayList;

public class RecipeSearchAdapter extends RecyclerView.Adapter<RecipeItemViewHolder>{
    //The collection that we will pull elements from to bind to the ViewHolder
    private ArrayList<Recipe> bindableCollection;
    private RecipeItemClickListener recipeItemClickListener;

    public interface RecipeItemClickListener {
        void onRecipeItemClicked(Recipe selectedItem);
    }

    public void setRecipeItemClickListener(RecipeItemClickListener recipeItemClickListener) {
        this.recipeItemClickListener = recipeItemClickListener;
    }

    public RecipeSearchAdapter(ArrayList<Recipe> collection) {
        this.bindableCollection = collection;
    }

    // Creates an instance of the ViewHolder to bind an item to
    @Override
    public RecipeItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflatedView = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.recipe_search_item, parent, false);

        return new RecipeItemViewHolder(inflatedView);
    }

    // Binds an item to a viewholder
    @Override
    public void onBindViewHolder(RecipeItemViewHolder holder, int position) {
        Recipe item = bindableCollection.get(position);
        holder.setOnItemClickedListener(new RecipeItemViewHolder.OnItemClickedListener() {
            @Override
            public void onItemClicked(int position) {
                if (recipeItemClickListener != null) {
                    recipeItemClickListener.onRecipeItemClicked(bindableCollection.get(position));
                }
            }
        });
        holder.bindView(item);
    }

    @Override
    public int getItemCount() {
        return this.bindableCollection.size();
    }
}
