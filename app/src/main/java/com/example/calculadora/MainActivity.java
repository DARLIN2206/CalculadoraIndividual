package com.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText numero1, numero2;
    Button btnSumar, btnRestar, btnMultiplicar, btnDividir;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = findViewById(R.id.numero1);
        numero2 = findViewById(R.id.numero2);
        btnSumar = findViewById(R.id.btnSumar);
        btnRestar = findViewById(R.id.btnRestar);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDividir = findViewById(R.id.btnDividir);
        resultado = findViewById(R.id.resultado);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(numero1.getText().toString());
                double n2 = Double.parseDouble(numero2.getText().toString());
                resultado.setText("Resultado: " + (n1 + n2));
            }
        });

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(numero1.getText().toString());
                double n2 = Double.parseDouble(numero2.getText().toString());
                resultado.setText("Resultado: " + (n1 - n2));
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(numero1.getText().toString());
                double n2 = Double.parseDouble(numero2.getText().toString());
                resultado.setText("Resultado: " + (n1 * n2));
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(numero1.getText().toString());
                double n2 = Double.parseDouble(numero2.getText().toString());

                if (n2 == 0) {
                    Toast.makeText(MainActivity.this, "No se puede dividir entre cero", Toast.LENGTH_SHORT).show();
                } else {
                    resultado.setText("Resultado: " + (n1 / n2));
                }
            }
        });
    }
}