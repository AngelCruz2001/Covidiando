package com.jpg.covidiando.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jpg.covidiando.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    RecyclerView recyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;
    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = root.findViewById(R.id.recycler_info);
        /*homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
            }
        });*/

        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(container.getContext());
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<item_list> list = new ArrayList<>();
        list.add(new item_list(R.drawable.covid19,"Aqui se va a mostrar informacion actualizada sobre el covid-19"));
        list.add(new item_list(R.drawable.covid19,"Aqui se va a mostrar informacion actualizada sobre el covid-19"));
        list.add(new item_list(R.drawable.covid19,"Aqui se va a mostrar informacion actualizada sobre el covid-19"));
        list.add(new item_list(R.drawable.covid19,"Aqui se va a mostrar informacion actualizada sobre el covid-19"));

        mAdapter =  new recycler_adapter(list);

        recyclerView.setAdapter(mAdapter);
        return root;


    }


}
