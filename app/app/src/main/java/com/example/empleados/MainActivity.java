package com.example.empleados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectAdministrado(View view) {
        Toast.makeText(getApplicationContext(), "administrador", Toast.LENGTH_SHORT).show();
    }

    public void selectVentas(View view) {
        Toast.makeText(getApplicationContext(), "Ventas", Toast.LENGTH_SHORT).show();

    }

    public void selectProduccion(View view) {
        Toast.makeText(getApplicationContext(), "prodduccion", Toast.LENGTH_SHORT).show();

    }


}