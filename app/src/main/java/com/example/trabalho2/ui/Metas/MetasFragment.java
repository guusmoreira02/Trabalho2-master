package com.example.trabalho2.ui.Metas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.trabalho2.databinding.FragmentMetasBinding;

public class MetasFragment extends Fragment {

    private FragmentMetasBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        com.example.trabalho2.ui.Metas.MetasViewModel MetasViewModel =
                new ViewModelProvider(this).get(com.example.trabalho2.ui.Metas.MetasViewModel.class);

        binding = FragmentMetasBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}