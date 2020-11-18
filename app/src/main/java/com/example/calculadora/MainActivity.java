package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button soma, subtrair, multiplicar, dividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        num1 = findViewById(R.id.editTextNum1);
        num2 = findViewById(R.id.editTextNum2);
        soma = findViewById(R.id.buttonSoma);
        subtrair = findViewById(R.id.buttonSub);
        multiplicar = findViewById(R.id.buttonMult);
        dividir = findViewById(R.id.buttonDiv);

        //Declaracao variaveis


        soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float vDig1 = Float.parseFloat(num1.getText().toString());
                float vDig2 = Float.parseFloat(num2.getText().toString());

                Intent soma = new Intent(getApplicationContext(), Soma.class);
                Bundle numeros = new Bundle();
                numeros.putFloat("Digito 1", vDig1);
                numeros.putFloat("Digito 2", vDig2);
                soma.putExtras(numeros);
                startActivity(soma);

            }
        });

        subtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float vDig1 = Float.parseFloat(num1.getText().toString());
                float vDig2 = Float.parseFloat(num2.getText().toString());

                Intent subtrair = new Intent(getApplicationContext(), Subtrair.class);
                Bundle numeros = new Bundle();
                numeros.putFloat("Digito 1", vDig1);
                numeros.putFloat("Digito 2", vDig2);
                subtrair.putExtras(numeros);
                startActivity(subtrair);

            }
        });

        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float vDig1 = Float.parseFloat(num1.getText().toString());
                float vDig2 = Float.parseFloat(num2.getText().toString());

                Intent multiplicar = new Intent(getApplicationContext(), Multiplicar.class);
                Bundle numeros = new Bundle();
                numeros.putFloat("Digito 1", vDig1);
                numeros.putFloat("Digito 2", vDig2);
                multiplicar.putExtras(numeros);
                startActivity(multiplicar);

            }
        });

        dividir.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float vDig1 = Float.parseFloat(num1.getText().toString());
                float vDig2 = Float.parseFloat(num2.getText().toString());

                Intent dividir = new Intent(getApplicationContext(), Dividir.class);
                Bundle numeros = new Bundle();
                numeros.putFloat("Digito 1", vDig1);
                numeros.putFloat("Digito 2", vDig2);
                dividir.putExtras(numeros);
                startActivity(dividir);

            }
        }));
    }
}