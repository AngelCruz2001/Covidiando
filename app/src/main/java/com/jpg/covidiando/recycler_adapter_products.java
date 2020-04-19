package com.jpg.covidiando;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class recycler_adapter_products extends RecyclerView.Adapter<recycler_adapter_products.productsViewHolder> implements View.OnClickListener {
    ArrayList<item_product> products_list;
    private View.OnClickListener listener;
    public recycler_adapter_products(ArrayList<item_product> products_list) {
        this.products_list = products_list;
    }


    @NonNull
    @Override
    public productsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product, parent, false);
        productsViewHolder listViewHolder = new productsViewHolder(v);
        v.setOnClickListener(this);
        return listViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull productsViewHolder holder, int position) {
        item_product currentItem = products_list.get(position);

        holder.tvNameP.setText(currentItem.getNameP());
        holder.tvDescriptionP.setText(currentItem.getDescriptionP());
        holder.tvPriceP.setText(currentItem.getPriceP());
        holder.imgProduct.setImageResource(currentItem.getImageP())
        ;


    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener=listener;
    }
    @Override
    public int getItemCount() {
        return products_list.size();
    }

    @Override
    public void onClick(View v) {
        if(listener!=null){
            listener.onClick(v);
        }
    }

    public static class productsViewHolder extends RecyclerView.ViewHolder {
        TextView tvNameP;
        TextView tvDescriptionP;
        TextView tvPriceP;
        ImageView imgProduct;

        public productsViewHolder(@NonNull View v) {
            super(v);
            tvNameP = v.findViewById(R.id.tvNameProduct);
            tvDescriptionP = v.findViewById(R.id.tvDescriptionP);
            tvPriceP = v.findViewById(R.id.tvPriceP);
            imgProduct = v.findViewById(R.id.imgP);

        }
    }
}
