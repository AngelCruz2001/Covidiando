package com.jpg.covidiando.ui.fraternity.;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jpg.covidiando.R;

import java.util.ArrayList;

public class recycler_adapter_contact extends RecyclerView.Adapter<recycler_adapter_contact.ListViewHolder> {
    ArrayList<contact_list> list;

    public recycler_adapter_contact(ArrayList<contact_list> list){
        this.list=list;
    }

    public static class ListViewHolder  extends RecyclerView.ViewHolder{
        ImageView image;
        TextView name;
        TextView phoneNumber;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            image = (ImageView) itemView.findViewById(R.id.img);
            name = (TextView) itemView.findViewById(R.id.tvName);
            phoneNumber = (TextView) itemView.findViewById(R.id.tvPhoneNumber)
        }


    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        ListViewHolder listViewHolder = new ListViewHolder(v);
        return listViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        item_list currentItem = list.get(position);

        holder.image.setImageResource(currentItem.getSourceImage());
        holder.text_Info.setText(currentItem.getText_info());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


}
