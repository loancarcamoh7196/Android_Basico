package com.example.miprimeraapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int matematicas=5, quimica= 5, fisica=5, promedio=0;

        promedio = (matematicas + quimica + fisica ) /3;

        if(promedio >= 6) {
            Toast.makeText(this, "Aprobado", Toast.LENGTH_LONG);
        } else if (promedio <=5) {
            Toast.makeText(this, "Reprobo", Toast.LENGTH_LONG);
        }

    }
}