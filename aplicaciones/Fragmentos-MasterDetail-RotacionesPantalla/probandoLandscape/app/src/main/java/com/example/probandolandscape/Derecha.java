package com.example.probandolandscape;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Derecha extends Fragment {
    TextView txt;
    View rootView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.derecha, container, false);
        txt = rootView.findViewById(R.id.textViewMostrar);
        return rootView;
    }

    public void obtener(String msj){
        txt.setText(msj);
    }

}
