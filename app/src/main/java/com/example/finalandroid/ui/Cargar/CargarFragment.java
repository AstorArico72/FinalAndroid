package com.example.finalandroid.ui.Cargar;

import android.arch.lifecycle.MutableLiveData;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.ViewModelProvider;

import com.example.finalandroid.databinding.FragmentNuevaBinding;

public class CargarFragment extends Fragment {

    private FragmentNuevaBinding binding;
    public static MutableLiveData <String> TextoNota;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CargarViewModel viewModel = new CargarViewModel(getContext());
        TextoNota = new MutableLiveData<>();
        binding = FragmentNuevaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textGallery;
        viewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        Button BotonGuardado = binding.BotonGuardado;

        BotonGuardado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextoNota.setValue(String.valueOf(binding.EntradaNota.getText()));
                viewModel.GuardarNota ();
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}