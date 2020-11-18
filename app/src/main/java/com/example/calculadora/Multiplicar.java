package com.example.calculadora;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Multiplicar extends AppCompatActivity {

    TextView resultado;
    Button voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soma);
        resultado = findViewById(R.id.textViewSoma);
        voltar = findViewById(R.id.buttonVoltar);

        Intent multiplicar = getIntent();
        Bundle numeros = multiplicar.getExtras();

        float num1 = numeros.getFloat("Digito 1");
        float num2 = numeros.getFloat("Digito 2");
        String res = String.valueOf(num1 * num2);

        resultado.setText(res);

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
