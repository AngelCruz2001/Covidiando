package com.jpg.covidiando.ui.configuracion;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.jpg.covidiando.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ConfiguracionFragment extends Fragment {
    RecyclerView recyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;
    private ConfiguracionViewModel configuracionViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        configuracionViewModel =
                ViewModelProviders.of(this).get(ConfiguracionViewModel.class);
        View root = inflater.inflate(R.layout.fragment_configuracion, container, false);
        TextView btnUpdateData = (TextView) root.findViewById(R.id.tvUpdateData);
        btnUpdateData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Se ha presionado el boton",Toast.LENGTH_LONG).show();

            }
        });
        //configuracionViewModel = root.findViewById(R.id.recycler_contact);
        /*configuracionViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                //textView.setText(s);
            }
        }); */

        return root;
    }
}
