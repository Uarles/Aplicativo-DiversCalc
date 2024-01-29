package com.example.diverscalc;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import java.util.Random;

public class tela_descobre_numero extends AppCompatActivity {

    private EditText textNumero;
    private Button btn_enviar;
    int numeroAleatorio = new Random().nextInt(50);
    private TextView textDica;
    private TextView textTentativas;
    int tentativas = 0;
    private TextView correto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_descobre_numero);

        IniciarComponentes();

        btn_enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


               if (checkAllFields()) {

                   int valor = Integer.valueOf(textNumero.getText().toString());

                   textTentativas.getText().toString();

                   if (valor > 50) {

                       textDica.setText("valor não deve ser maior do que 50 ");

                   } else if (valor < 0) {

                       textDica.setText("valor não deve ser menor do que 0");

                   }else if (valor > numeroAleatorio) {

                       textDica.setText("O valor gerado é menor");
                       tentativas++;

                   } else if (valor < numeroAleatorio) {

                       textDica.setText( "O valor gerado é maior");
                       tentativas++;

                   }else {

                       textDica.setText( "Parabéns você acertou");
                       textTentativas.setText(tentativas + ":Tentativas");
                       correto.setVisibility(View.VISIBLE);


                   }

                }
            }
        });
    }

    public boolean checkAllFields() {


        if (textNumero.getText().toString().isEmpty()) {
            textNumero.setError("Informe um valor");
            textNumero.requestFocus();
            return false;


        } else {
            return true;
        }



    }


    public void IniciarComponentes() {

        textNumero = findViewById(R.id.textNumero);
        btn_enviar = findViewById(R.id.btn_enviar);
        textDica = findViewById(R.id.textDica);
        textTentativas = findViewById(R.id.textTentativas);
        correto = findViewById(R.id.correto);

    }
}