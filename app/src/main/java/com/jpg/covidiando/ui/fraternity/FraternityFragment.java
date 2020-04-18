package com.jpg.covidiando.ui.fraternity;

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

public class FraternityFragment extends Fragment {
    RecyclerView recyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;
    private FraternityViewModel fraternityViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        fraternityViewModel =
                ViewModelProviders.of(this).get(FraternityViewModel.class);
        View root = inflater.inflate(R.layout.fragment_fraternity, container, false);
        recyclerView = root.findViewById(R.id.recycler_contact);
        /*fraternityViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                //textView.setText(s);
            }
        }); */

        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(container.getContext());
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<contact_list> list1 = new ArrayList<>();
        list1.add(new contact_list("Nombre de la persona","1234567890",R.drawable.google));
        list1.add(new contact_list("Nombre de la persona","1234567890",R.drawable.google));
        list1.add(new contact_list("Nombre de la persona","1234567890",R.drawable.google));
        mAdapter =  new recycler_adapter_contact(list1);

        recyclerView.setAdapter(mAdapter);
        return root;
    }
}
