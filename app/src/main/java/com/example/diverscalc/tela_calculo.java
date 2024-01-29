package com.example.diverscalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class tela_calculo extends AppCompatActivity {


    private Button btngerar;
    private TextView textDica;

    private  TextView rosto1;
    private  TextView rosto2;
    private  TextView rosto3;
    private  TextView rosto4;
    private  TextView rosto5;
    private  TextView rosto6;


    //em cima estao o botao e a mensagem que aparece no final e os rostos feliz

    int userAdicao = 0;
    private Button btn_adicao;
    private TextView adicao1;
    private TextView adicao2;

    private EditText valorAdicao ;
    private EditText corretoAdicao;
    private EditText errorAdicao;
    int adicaoAleatorio1 = 0;
    int adicaoAleatorio2 = 0;

    //parte de baixo é sobre subtracao

    private Button btn_subtracao;

    private TextView textSubtracao;
    private TextView textIgual2;
    private TextView subtracao1;
    private TextView subtracao2;
    private EditText valorSubtracao;
    private EditText errorSubtracao;
    private EditText corretoSubtracao;
    int subtracaoAleatorio1 = 0;
    int subtracaoAleatorio2 = 0;

    // parte de baixo é sobre Multiplicacao

    private Button btn_multiplicacao;
    private TextView multiplicacao1;
    private TextView textMultiplicacao;
    private TextView multiplicacao2;
    private TextView textIgual3;
    private EditText valorMultiplicacao;
    private EditText errorMultiplicacao;
    private EditText corretoMultiplicacao;
    int multiplicacaoAleatorio1 = 0;
    int multiplicacaoAleatorio2 = 0;

    //parte de baixo é sobre divisao

    private Button btn_divisao;
    private TextView divisao1;
    private TextView textDivisao;
    private TextView divisao2;
    private TextView textIgual4;
    private EditText valorDivisao;
    private EditText errorDivisao;
    private EditText corretoDivisao;
    int divisaoAleatorio1 = 0;
    int divisaoAleatorio2 = 0;








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_calculo);

        IniciarComponentes();

        btngerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                errorAdicao.setVisibility(View.INVISIBLE);
                corretoAdicao.setVisibility(View.INVISIBLE);

                errorSubtracao.setVisibility(View.INVISIBLE);
                corretoSubtracao.setVisibility(View.INVISIBLE);

                errorMultiplicacao.setVisibility(View.INVISIBLE);
                corretoMultiplicacao.setVisibility(View.INVISIBLE);

                errorDivisao.setVisibility(View.INVISIBLE);
                corretoDivisao.setVisibility(View.INVISIBLE);

                rosto1.setVisibility(View.INVISIBLE);
                rosto2.setVisibility(View.INVISIBLE);
                rosto3.setVisibility(View.INVISIBLE);
                rosto4.setVisibility(View.INVISIBLE);
                rosto5.setVisibility(View.INVISIBLE);
                rosto6.setVisibility(View.INVISIBLE);

                subtracao1.setVisibility(View.INVISIBLE);
                textSubtracao.setVisibility(View.INVISIBLE);
                subtracao2.setVisibility(View.INVISIBLE);
                textIgual2.setVisibility(View.INVISIBLE);
                valorSubtracao.setVisibility(View.INVISIBLE);
                btn_subtracao.setVisibility(View.INVISIBLE);

                multiplicacao1.setVisibility(View.INVISIBLE);
                textMultiplicacao.setVisibility(View.INVISIBLE);
                multiplicacao2.setVisibility(View.INVISIBLE);
                textIgual3.setVisibility(View.INVISIBLE);
                valorMultiplicacao.setVisibility(View.INVISIBLE);
                btn_multiplicacao.setVisibility(View.INVISIBLE);

                divisao1.setVisibility(View.INVISIBLE);
                textDivisao.setVisibility(View.INVISIBLE);
                divisao2.setVisibility(View.INVISIBLE);
                textIgual4.setVisibility(View.INVISIBLE);
                valorDivisao.setVisibility(View.INVISIBLE);
                btn_divisao.setVisibility(View.INVISIBLE);

                adicaoAleatorio1 = new Random().nextInt(80);
                adicaoAleatorio2 = new Random().nextInt(80);

                adicao1.setText(Integer.toString(adicaoAleatorio1));
                adicao2.setText(Integer.toString(adicaoAleatorio2));

                subtracaoAleatorio1 =  new Random().nextInt(51) + 50;
                subtracaoAleatorio2 =  new Random().nextInt(50);

                subtracao1.setText(Integer.toString(subtracaoAleatorio1));
                subtracao2.setText(Integer.toString(subtracaoAleatorio2));

                multiplicacaoAleatorio1 =  new Random().nextInt(20);
                multiplicacaoAleatorio2 =  new Random().nextInt(20);

                multiplicacao1.setText(Integer.toString(multiplicacaoAleatorio1));
                multiplicacao2.setText(Integer.toString(multiplicacaoAleatorio2));

                divisaoAleatorio1 =  new Random().nextInt(51) + 50;
                divisaoAleatorio2 =  new Random().nextInt(50);

                divisao1.setText(Integer.toString(divisaoAleatorio1));
                divisao2.setText(Integer.toString(divisaoAleatorio2));

            }

        });

        btn_adicao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (checkAllFields()) {

                    userAdicao = Integer.valueOf(valorAdicao.getText().toString());

                    int resultadoAdicao = adicaoAleatorio1 + adicaoAleatorio2;

                    if (userAdicao == resultadoAdicao ) {

                        textDica.setText("primeiro esta correto");

                        corretoAdicao.setVisibility(View.VISIBLE);
                        subtracao1.setVisibility(View.VISIBLE);
                        textSubtracao.setVisibility(View.VISIBLE);
                        subtracao2.setVisibility(View.VISIBLE);
                        textIgual2.setVisibility(View.VISIBLE);
                        valorSubtracao.setVisibility(View.VISIBLE);
                        btn_subtracao.setVisibility(View.VISIBLE);


                    }else {
                        errorAdicao.setVisibility(View.VISIBLE);
                        textDica.setText("Errou, gere outro número");

                    }
                }
            }
        });

        btn_subtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int userSubtracao = Integer.valueOf(valorSubtracao.getText().toString());

                int resultadoSubtracao = subtracaoAleatorio1 - subtracaoAleatorio2;

                if (userSubtracao == resultadoSubtracao) {

                    textDica.setText("A segunda esta correta");

                    corretoSubtracao.setVisibility(View.VISIBLE);
                    multiplicacao1.setVisibility(View.VISIBLE);
                    textMultiplicacao.setVisibility(View.VISIBLE);
                    multiplicacao2.setVisibility(View.VISIBLE);
                    textIgual3.setVisibility(View.VISIBLE);
                    valorMultiplicacao.setVisibility(View.VISIBLE);
                    btn_multiplicacao.setVisibility(View.VISIBLE);

                }else {

                    textDica.setText("Errou, gere outro número");
                    errorSubtracao.setVisibility(View.VISIBLE);
                }

            }
        });

        btn_multiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int userMultiplicacao = Integer.valueOf(valorMultiplicacao.getText().toString());

                int resultadoMultiplicacao = multiplicacaoAleatorio1 * multiplicacaoAleatorio2;

                if (userMultiplicacao == resultadoMultiplicacao) {

                    textDica.setText("A terceira esta correta");

                    corretoMultiplicacao.setVisibility(View.VISIBLE);
                    divisao1.setVisibility(View.VISIBLE);
                    textDivisao.setVisibility(View.VISIBLE);
                    divisao2.setVisibility(View.VISIBLE);
                    textIgual4.setVisibility(View.VISIBLE);
                    valorDivisao.setVisibility(View.VISIBLE);
                    btn_divisao.setVisibility(View.VISIBLE);

                }else {

                    textDica.setText("Errou, gere outro número");
                    errorMultiplicacao.setVisibility(View.VISIBLE);
                }
            }
        });

        btn_divisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int userDivisao = Integer.valueOf(valorDivisao.getText().toString());

                int resultadoDivisao = divisaoAleatorio1 / divisaoAleatorio2;

                if (userDivisao == resultadoDivisao) {

                    textDica.setText("parabéns você acertou todas");

                    corretoDivisao.setVisibility(View.VISIBLE);
                    rosto1.setVisibility(View.VISIBLE);
                    rosto2.setVisibility(View.VISIBLE);
                    rosto3.setVisibility(View.VISIBLE);
                    rosto4.setVisibility(View.VISIBLE);
                    rosto5.setVisibility(View.VISIBLE);
                    rosto6.setVisibility(View.VISIBLE);




                }else {

                    textDica.setText("Errou, gere outro número");
                    errorDivisao.setVisibility(View.VISIBLE);
                }

            }
        });

    }

    public boolean checkAllFields() {

        if ( valorAdicao.getText().toString().isEmpty()) {
            valorAdicao.setError("Informe o valor");
            valorAdicao.requestFocus();
            return false;

        } else {

            return true;
        }



    }

    private void IniciarComponentes() {

        btn_adicao = findViewById(R.id.btn_adicao);
        btngerar = findViewById(R.id.btn_gerar);
        rosto1 = findViewById(R.id.rosto1);
        rosto2 = findViewById(R.id.rosto2);
        rosto3 = findViewById(R.id.rosto3);
        rosto4 = findViewById(R.id.rosto4);
        rosto5 = findViewById(R.id.rosto5);
        rosto6 = findViewById(R.id.rosto6);
        textDica = findViewById(R.id.textDica);
        adicao1 = findViewById(R.id.adicao1);
        adicao2 = findViewById(R.id.adicao2);
        valorAdicao = findViewById(R.id.valorAdicao);
        errorAdicao = findViewById(R.id.errorAdicao);
        corretoAdicao = findViewById(R.id.corretoAdicao);
        //parte da subtracao embaixo
        subtracao1 = findViewById(R.id.subtracao1);
        subtracao2 = findViewById(R.id.subtracao2);
        textSubtracao = findViewById(R.id.textSubtracao);
        textIgual2 = findViewById(R.id.textIgual2);
        valorSubtracao = findViewById(R.id.valorSubtracao);
        errorSubtracao = findViewById(R.id.errorSubtracao);
        corretoSubtracao = findViewById(R.id.corretoSubtracao);
        btn_subtracao = findViewById(R.id.btn_subtracao);
        //pate de baixo é multiplicacao
        btn_multiplicacao = findViewById(R.id.btn_multiplicacao);
        multiplicacao1 = findViewById(R.id.multiplicacao1);
        textMultiplicacao = findViewById(R.id.textMultiplicacao);
        multiplicacao2 = findViewById(R.id.multiplicacao2);
        textIgual3 = findViewById(R.id.textIgual3);
        valorMultiplicacao = findViewById(R.id.valorMultiplicacao);
        errorMultiplicacao = findViewById(R.id.errorMultiplicacao);
        corretoMultiplicacao = findViewById(R.id.corretoMultiplicacao);
        //parte de baixo é divisao
        btn_divisao = findViewById(R.id.btn_divisao);
        divisao1 = findViewById(R.id.divisao1);
        textDivisao = findViewById(R.id.textDivisao);
        divisao2 = findViewById(R.id.divisao2);
        textIgual4 = findViewById(R.id.textIgual4);
        valorDivisao = findViewById(R.id.valorDivisao);
        errorDivisao = findViewById(R.id.errorDivisao);
        corretoDivisao = findViewById(R.id.corretoDivisao);



    }



}