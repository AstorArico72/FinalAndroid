package com.example.finalandroid.ui.home;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.example.finalandroid.R;
import java.util.List;

public class AdaptadorLista extends ArrayAdapter {
    private Context contexto;
    private List <String> notas;
    private LayoutInflater inflador;

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = inflador.inflate(R.layout.item_lista, parent, false);
        }
        TextView textoNota = convertView.findViewById(R.id.item_nota);
        textoNota.setText (notas.get(position));
        return convertView;
    }

    public AdaptadorLista(@NonNull Context context, int resource, @NonNull List<String> objects, LayoutInflater li) {
        super(context, resource, objects);
        this.contexto = context;
        this.notas = objects;
        this.inflador = li;
    }

}
