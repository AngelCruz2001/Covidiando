package com.jpg.covidiando.ui.fraternity;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FraternityViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FraternityViewModel() {

    }

    public LiveData<String> getText() {
        return mText;
    }
}