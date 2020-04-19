package com.jpg.covidiando;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jpg.covidiando.ui.fraternity.recycler_adapter_contact;

import org.w3c.dom.Text;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class recycler_adapter_car  extends RecyclerView.Adapter<recycler_adapter_car.carViewHolder> {
    ArrayList<item_car> car_list;

    public recycler_adapter_car(ArrayList<item_car> car_list) {
        this.car_list = car_list;
    }

    @NonNull
    @Override
    public carViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_car,parent,false);
        recycler_adapter_car.carViewHolder listViewHolder = new recycler_adapter_car.carViewHolder(v);
        return listViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull carViewHolder holder, int position) {
        item_car currentItem = car_list.get(position);

        holder.tvNameProduct.setText(currentItem.getNameProduct());
        holder.tvPriceProduct.setText(currentItem.getPriceProduct());
    }

    @Override
    public int getItemCount() {
        return car_list.size();
    }

    public static class carViewHolder extends RecyclerView.ViewHolder{
        TextView tvNameProduct;
        TextView tvPriceProduct;
        public carViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNameProduct = (TextView) itemView.findViewById(R.id.tvNameProduct);
            tvPriceProduct = (TextView) itemView.findViewById(R.id.tvProductPrice);
        }
    }
}

