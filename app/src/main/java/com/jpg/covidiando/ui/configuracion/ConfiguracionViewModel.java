package com.jpg.covidiando.ui.configuracion;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ConfiguracionViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ConfiguracionViewModel() {

    }

    public LiveData<String> getText() {
        return mText;
    }
}