package com.jpg.covidiando;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class recycler_adapter_products extends RecyclerView.Adapter<recycler_adapter_products.productsViewHolder>{
    ArrayList<item_product> products_list;

    public recycler_adapter_products(ArrayList<item_product> products_list) {
        this.products_list = products_list;
    }

    @NonNull
    @Override
    public productsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product,parent,false);
        productsViewHolder listViewHolder = new productsViewHolder(v);
        return listViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull productsViewHolder holder, int position) {
        item_product currentItem = products_list.get(position);

        holder.imgProduct.setImageResource(currentItem.getImageP());
        holder.tvNameP.setText(currentItem.getNameP());
        holder.tvDescriptionP.setText(currentItem.getDescriptionP());
        holder.tvPriceP.setText(currentItem.getPriceP());
    }

    @Override
    public int getItemCount() {
        return products_list.size();
    }

    public static class productsViewHolder extends RecyclerView.ViewHolder{
        TextView tvNameP,tvDescriptionP,tvPriceP;
        ImageView imgProduct;
        public productsViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNameP = (TextView) itemView.findViewById(R.id.tvNameP);
            tvDescriptionP = (TextView) itemView.findViewById(R.id.tvDescriptionP);
            tvPriceP = (TextView) itemView.findViewById(R.id.tvPriceP);
            imgProduct = (ImageView) itemView.findViewById(R.id.imgP);
        }
    }
}
