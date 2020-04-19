package com.jpg.covidiando;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AskFragment#newInstance} factory method to
 * create an instance of this fragment.
 *
 */
public class AskFragment extends Fragment   {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AskFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AskFragment newInstance(String param1, String param2) {
        AskFragment fragment = new AskFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
    public AskFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View root = inflater.inflate(R.layout.fragment_ask, container, false);
        TextView make = (TextView)root.findViewById(R.id.btnPedir);
        RecyclerView recycler_products = (RecyclerView) root.findViewById(R.id.recycler_products);
        RecyclerView recycler_car = (RecyclerView) root.findViewById(R.id.recycler_car);
        recycler_products.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(container.getContext());
        recycler_products.setLayoutManager(layoutManager);

        ArrayList<item_product> list = new ArrayList<>();
        list.add(new item_product("Chimichangas","Descripcion del producto","$ 120.00",R.drawable.covid19));
        list.add(new item_product("Chimichangas","Descripcion del producto","$ 120.00",R.drawable.covid19));
        list.add(new item_product("Chimichangas","Descripcion del producto","$ 120.00",R.drawable.covid19));
        list.add(new item_product("Chimichangas","Descripcion del producto","$ 120.00",R.drawable.covid19));
        list.add(new item_product("Chimichangas","Descripcion del producto","$ 120.00",R.drawable.covid19));

        recycler_adapter_products adapter =  new recycler_adapter_products(list);
        recycler_products.setAdapter(adapter);
        make.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return root;
    }
    public void makeOrder(View v) {
        Toast.makeText(v.getContext()," Angel1 no el 21",Toast.LENGTH_LONG).show();

    }



}
