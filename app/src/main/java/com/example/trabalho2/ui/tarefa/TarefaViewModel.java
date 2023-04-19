package com.example.trabalho2.ui.tarefa;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TarefaViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public TarefaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}