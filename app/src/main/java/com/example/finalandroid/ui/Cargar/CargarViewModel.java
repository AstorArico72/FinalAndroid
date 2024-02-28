package com.example.finalandroid.ui.Cargar;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.content.Context;
import android.widget.Toast;

import static com.example.finalandroid.ui.home.HomeViewModel.ListaDeNotas;
import static com.example.finalandroid.ui.Cargar.CargarFragment.TextoNota;

public class CargarViewModel extends ViewModel {

    private final MutableLiveData<String> mText;
    private Context ctx;

    public CargarViewModel(Context context) {
        mText = new MutableLiveData<>();
        mText.setValue("Nueva nota");
        this.ctx = context;
    }

    public void GuardarNota () {
        String texto = TextoNota.getValue();
        if (texto == null || texto.length() == 0) {
            Toast.makeText (ctx, "Ingresa algo de texto, la nota no puede quedar vacía.", Toast.LENGTH_SHORT).show();
        } else {
            ListaDeNotas.add(texto);
            Toast.makeText (ctx, "Nota guardada.", Toast.LENGTH_SHORT).show();
        }
    }

    public LiveData<String> getText() {
        return mText;
    }
}