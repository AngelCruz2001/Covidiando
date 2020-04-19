package com.jpg.covidiando.ui.fraternity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jpg.covidiando.AskFragment;
import com.jpg.covidiando.MainActivity;
import com.jpg.covidiando.R;
import com.jpg.covidiando.shopping;

import java.util.ArrayList;

public class recycler_adapter_contact extends RecyclerView.Adapter<recycler_adapter_contact.ListViewHolder> {
    ArrayList<contact_list> list;
    AskFragment askFragment;
    public static Context context;
    Activity ac;

    public recycler_adapter_contact(ArrayList<contact_list> list, Activity ac){
        this.list=list;
        this.ac=ac;
    }

    public  static  class ListViewHolder  extends RecyclerView.ViewHolder{
        ImageView image;
        TextView name;
        TextView phoneNumber;
        TextView adress;
        TextView distance;
        TextView btnPedir;
        Context con;

        public ListViewHolder(@NonNull final View itemView) {
            super(itemView);
            context = itemView.getContext();
            image = (ImageView) itemView.findViewById(R.id.imgProfile);
            name = (TextView) itemView.findViewById(R.id.tvName);
            phoneNumber = (TextView) itemView.findViewById(R.id.tvPhoneNumber);
            adress = (TextView) itemView.findViewById(R.id.tvAdress);
            btnPedir = (TextView) itemView.findViewById(R.id.btnPedir);
            btnPedir.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    context = itemView.getContext();
                    Intent detail = new Intent(context.getApplicationContext(), shopping.class);
                    context.startActivity(detail);
                }

            });
        }


    }

    @NonNull


    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_list,parent,false);
        ListViewHolder listViewHolder = new ListViewHolder(v);
        return listViewHolder;
    }



    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        contact_list currentItem = list.get(position);

        holder.image.setImageResource(currentItem.getProfilePicture());
        holder.name.setText(currentItem.getName());
        holder.phoneNumber.setText(currentItem.getPhoneNumber());
        holder.adress.setText(currentItem.getAdress());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }


}
