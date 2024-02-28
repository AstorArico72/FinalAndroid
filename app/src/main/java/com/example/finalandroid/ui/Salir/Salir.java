package com.example.finalandroid.ui.Salir;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.finalandroid.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Salir#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Salir extends Fragment {


    public Salir() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Salir.
     */
    // TODO: Rename and change types and number of parameters
    public static Salir newInstance() {
        Salir fragment = new Salir();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AlertDialog alerta = new AlertDialog.Builder(getContext()).setTitle("Salir")
                .setMessage("¿Quieres salir?")
                .setPositiveButton(R.string.si, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        System.exit(0);
                    }
                })
                .setNegativeButton(R.string.no, null)
                .show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_salir, container, false);
    }
}