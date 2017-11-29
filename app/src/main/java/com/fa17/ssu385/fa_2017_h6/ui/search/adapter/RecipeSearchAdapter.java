package com.fa17.ssu385.fa_2017_h6.ui.search.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fa17.ssu385.fa_2017_h6.R;
import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.ui.search.viewholder.RecipeItemViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 11/28/17.
 */

public class RecipeSearchAdapter extends RecyclerView.Adapter<RecipeItemViewHolder>{

    // The collection that we will pull elements from to bind to the ViewHolder
    private ArrayList<Recipe> bindableCollection;
    private RecipeItemClickListener recipeItemClickListener;

    public RecipeSearchAdapter(ArrayList<Recipe> collection){
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

    @Override
    public void onBindViewHolder(RecipeItemViewHolder holder, int position) {
        Recipe item = bindableCollection.get(position);
        holder.setListener(new RecipeItemViewHolder.OnItemClickedListener() {
            @Override
            public void onItemClicked(int position) {
                if(recipeItemClickListener != null){
                    recipeItemClickListener.onRecipeitemClicked(bindableCollection.get(position));
                }
            }
        });
        holder.bindView(item);
    }

    @Override
    public int getItemCount() {
        return this.bindableCollection.size();
    }

    public void setRecipeItemClickListener(RecipeItemClickListener recipeItemClickListener){
        this.recipeItemClickListener = recipeItemClickListener;
    }

    public interface RecipeItemClickListener{
        void onRecipeitemClicked(Recipe selectedItem);
    }
}
