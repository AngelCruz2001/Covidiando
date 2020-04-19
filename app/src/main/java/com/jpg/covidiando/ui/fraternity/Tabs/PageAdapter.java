package com.jpg.covidiando.ui.fraternity.Tabs;

import com.jpg.covidiando.ui.fraternity.CommerceFragment;
import com.jpg.covidiando.ui.fraternity.ContactsFragment;
import com.jpg.covidiando.ui.fraternity.FraternityFragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {
    int numPages;

    public PageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.numPages=behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new ContactsFragment();
            case 1:
                return new CommerceFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 0;
    }
}
