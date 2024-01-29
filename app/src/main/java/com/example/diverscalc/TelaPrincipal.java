package com.example.diverscalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class TelaPrincipal extends AppCompatActivity {

   private ImageView iconePerfil;
   private Button btImc;
   private Button btAdivinhar;
   private Button textCalculo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        CarregarDados();
        iconePerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TelaPrincipal.this, TelaDePerfil.class);
                startActivity(intent);
            }
        });

        btImc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TelaPrincipal.this, TelaImc.class);
                startActivity(intent);
            }
        });

        btAdivinhar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TelaPrincipal.this, tela_descobre_numero.class);
                startActivity(intent);
            }
        });

        textCalculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TelaPrincipal.this, tela_calculo.class);
                startActivity(intent);
            }
        });


    }

    private void CarregarDados() {

        iconePerfil = findViewById(R.id.iconePerfil);
        btImc = findViewById(R.id.btImc);
        btAdivinhar = findViewById(R.id.text_adivinhar);
        textCalculo = findViewById(R.id.textCalculo);

    }
}