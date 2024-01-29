package com.example.diverscalc;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TelaImc extends AppCompatActivity {

    private EditText editPeso;
    private EditText editAltura;
    private TextView textResultado;
    private TextView textImc;
    private Button btCalcular;
    private TextView textAbaixoPeso;
    private TextView textPesoNormal;
    private TextView textSobrePeso;
    private TextView textObesidadeGrau1;
    private TextView textObesidadeGrau2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_imc);

        IniciarComponentes();

        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (checkAllFields()) {

                    double peso = Double.parseDouble(editPeso.getText().toString());
                    double altura = Double.parseDouble(editAltura.getText().toString());
                    double resultado = Double.parseDouble(String.format("%.0f", peso / (altura * altura)));

                    if (resultado < 19) {
                        textImc.setText(Integer.toString((int) resultado));
                        textResultado.setText(" Abaixo do peso ");
                        textAbaixoPeso.setVisibility(View.VISIBLE);
                        textPesoNormal.setVisibility(View.INVISIBLE);
                        textSobrePeso.setVisibility(View.INVISIBLE);
                        textObesidadeGrau1.setVisibility(View.INVISIBLE);
                        textObesidadeGrau2.setVisibility(View.INVISIBLE);

                    } else if (resultado <= 19 || resultado < 25) {
                        textImc.setText(Integer.toString((int) resultado));
                        textResultado.setText( " Peso normal");
                        textPesoNormal.setVisibility(View.VISIBLE);
                        textSobrePeso.setVisibility(View.INVISIBLE);
                        textObesidadeGrau1.setVisibility(View.INVISIBLE);
                        textObesidadeGrau2.setVisibility(View.INVISIBLE);
                        textAbaixoPeso.setVisibility(View.INVISIBLE);


                    } else if (resultado <= 25 || resultado < 30) {
                        textImc.setText(Integer.toString((int) resultado));
                        textResultado.setText( " Sobre peso");
                        textSobrePeso.setVisibility(View.VISIBLE);
                        textObesidadeGrau1.setVisibility(View.INVISIBLE);
                        textObesidadeGrau2.setVisibility(View.INVISIBLE);
                        textAbaixoPeso.setVisibility(View.INVISIBLE);
                        textPesoNormal.setVisibility(View.INVISIBLE);


                    } else if (resultado <= 30 || resultado < 40) {
                        textImc.setText(Integer.toString((int) resultado));
                        textResultado.setText( " Obesidade gráu I");
                        textObesidadeGrau1.setVisibility(View.VISIBLE);
                        textObesidadeGrau2.setVisibility(View.INVISIBLE);
                        textAbaixoPeso.setVisibility(View.INVISIBLE);
                        textPesoNormal.setVisibility(View.INVISIBLE);
                        textSobrePeso.setVisibility(View.INVISIBLE);


                    } else if (resultado > 40) {
                        textImc.setText(Integer.toString((int) resultado));
                        textResultado.setText(" Obesidade gráu II");
                        textObesidadeGrau2.setVisibility(View.VISIBLE);
                        textAbaixoPeso.setVisibility(View.INVISIBLE);
                        textPesoNormal.setVisibility(View.INVISIBLE);
                        textSobrePeso.setVisibility(View.INVISIBLE);
                        textObesidadeGrau1.setVisibility(View.INVISIBLE);


                    }
                }
            }
        });
    }

    private boolean checkAllFields() {

        if (editPeso.getText().toString().isEmpty()) {
            editPeso.setError("Informe o seu peso");
            editPeso.requestFocus();
            return false;
        } else if (editAltura.getText().toString().isEmpty()) {
            editAltura.setError("informe a sua altura");
            editAltura.requestFocus();
            return false;

        }else {
            return true;
        }

    }

    private void IniciarComponentes() {
        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);
        textResultado = findViewById(R.id.textResultado);
        textImc = findViewById(R.id.textImc);
        btCalcular = findViewById(R.id.btCalcular);
        textAbaixoPeso = findViewById(R.id.textAbixoPeso);
        textPesoNormal = findViewById(R.id.textPesoNormal);
        textSobrePeso = findViewById(R.id.textSobrePeso);
        textObesidadeGrau1 = findViewById(R.id.textObesidadeGrau1);
        textObesidadeGrau2 = findViewById(R.id.textObesidadeGrau2);
    }
}