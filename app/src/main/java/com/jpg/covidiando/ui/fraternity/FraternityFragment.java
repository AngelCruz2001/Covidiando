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
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.jpg.covidiando.R;
import com.jpg.covidiando.ui.fraternity.Tabs.PageAdapter;

import java.util.ArrayList;

public class FraternityFragment extends Fragment {
    RecyclerView recyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;
    TabLayout tabLayout;
    ViewPager viewPager;
    TabItem tbContacts,tbCommerce;
    PageAdapter pageAdapter;
    private FraternityViewModel fraternityViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        fraternityViewModel =
                ViewModelProviders.of(this).get(FraternityViewModel.class);
        View root = inflater.inflate(R.layout.fragment_fraternity, container, false);

        /*fraternityViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                //textView.setText(s);
            }
        }); */
        /*recyclerView = root.findViewById(R.id.recycler_contact);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(container.getContext());
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<contact_list> list1 = new ArrayList<>();
        list1.add(new contact_list("Nombre de la persona","1234567890",R.drawable.google));
        list1.add(new contact_list("Nombre de la persona","1234567890",R.drawable.google));
        list1.add(new contact_list("Nombre de la persona","1234567890",R.drawable.google));
        mAdapter =  new recycler_adapter_contact(list1);

        recyclerView.setAdapter(mAdapter);*/
        tabLayout = (TabLayout) root.findViewById(R.id.tabLayout);
        viewPager = (ViewPager) root.findViewById(R.id.viewPager);

        tbContacts = (TabItem) root.findViewById(R.id.tbContacts);
        tbCommerce = (TabItem) root.findViewById(R.id.tbCommerce);
        pageAdapter =  new PageAdapter(this.getParentFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if(tab.getPosition()==0){
                    pageAdapter.notifyDataSetChanged();
                }else if(tab.getPosition()==1){
                    pageAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        return root;
    }
}
