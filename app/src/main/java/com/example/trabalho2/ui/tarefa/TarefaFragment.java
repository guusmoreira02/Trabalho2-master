package com.example.trabalho2.ui.tarefa;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.trabalho2.databinding.FragmentTarefasBinding;

public class TarefaFragment extends Fragment {

    private FragmentTarefasBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        TarefaViewModel TarefaViewModel =
                new ViewModelProvider(this).get(TarefaViewModel.class);

        binding = FragmentTarefasBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}