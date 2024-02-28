package com.example.finalandroid.ui.home;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.finalandroid.R;

import java.util.ArrayList;

public class HomeViewModel extends ViewModel {

    private LayoutInflater inf;
    private final MutableLiveData<String> mText;
    public static ArrayList<String> ListaDeNotas = new ArrayList<>();
    private Context ctx;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Lista de notas");
        ListaDeNotas = new ArrayList<>();
    }

    public void CargarLista (View vistaPadre) {
        ArrayAdapter <String> adaptador = new AdaptadorLista(this.ctx, R.layout.item_lista, ListaDeNotas, inf);
        ListView listaPrincipal = vistaPadre.findViewById(R.id.ListadoNotas);
        listaPrincipal.setAdapter(adaptador);
    }

    public LiveData<String> getText() {
        return mText;
    }

    public HomeViewModel (Context con, LayoutInflater li) {
        this.ctx = con;
        this.inf = li;
        mText = new MutableLiveData<>();
        mText.setValue("Lista de notas");
    }
}