package com.fa17.ssu385.fa_2017_h6.ui.search.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fa17.ssu385.fa_2017_h6.R;
import com.fa17.ssu385.fa_2017_h6.model.Recipe;
import com.fa17.ssu385.fa_2017_h6.model.RecipeList;
import com.fa17.ssu385.fa_2017_h6.ui.search.viewholder.RecipeItemViewHolder;

import java.util.ArrayList;

public class RecipeSearchAdapter extends RecyclerView.Adapter<RecipeItemViewHolder> {

    private RecipeList bindableCollection;

    public interface RecipeItemClickListener{
        void onRecipeItemClicked(Recipe selectedItem);
    }

    public void setRecipeItemClickListener(RecipeItemClickListener recipeItemClickListener) {
        this.recipeItemClickListener = recipeItemClickListener;
    }

    private RecipeItemClickListener recipeItemClickListener;

    public RecipeSearchAdapter(RecipeList collection){
        this.bindableCollection = collection;
    }

    @Override
    public RecipeItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflatedView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recipe_search_item, parent, false);

        return new RecipeItemViewHolder(inflatedView);
    }

    @Override
    public void onBindViewHolder(RecipeItemViewHolder holder, int position) {
        Recipe item = bindableCollection.getRecipes().get(position);
        holder.setListener(new RecipeItemViewHolder.OnItemClickedListener(){
            @Override
            public void onItemClicked(int position){
                if (recipeItemClickListener != null){
                    recipeItemClickListener.onRecipeItemClicked(bindableCollection.getRecipes().get(position));
                }
            }
        });
        holder.bindView(item);
    }

    @Override
    public int getItemCount() {
        return this.bindableCollection.getRecipes().size();
    }
}