package com.jpg.covidiando;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class shopping extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);
        TextView make = (TextView)findViewById(R.id.btnPedir);
        final RecyclerView recycler_products = (RecyclerView)findViewById(R.id.recycler_products);
        RecyclerView recycler_car = (RecyclerView)findViewById(R.id.recycler_car);
        recycler_products.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recycler_products.setLayoutManager(layoutManager);

        final ArrayList<item_product> list = new ArrayList<>();
        list.add(new item_product("Chimichangas","Descripcion del producto","$ 45.00",R.drawable.ic_image));
        list.add(new item_product("Tacos","Descripcion del producto","$ 50.00",R.drawable.ic_image));
        list.add(new item_product("Torta","Descripcion del producto","$ 35.00",R.drawable.ic_image));
        list.add(new item_product("Burro","Descripcion del producto","$ 29.00",R.drawable.ic_image));


        recycler_adapter_products adapter =  new recycler_adapter_products(list);
        recycler_products.setAdapter(adapter);
        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                item_product item =list.get(recycler_products.getChildAdapterPosition(v));
                Toast.makeText(getApplicationContext(),"Seleccion"+item.nameP,Toast.LENGTH_LONG).show();
            }
        });
        make.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}
