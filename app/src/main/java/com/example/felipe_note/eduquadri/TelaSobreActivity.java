package com.example.felipe_note.eduquadri;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TelaSobreActivity extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_sobre);

        text = (TextView) findViewById(R.id.idText);
        text.setText("            Informação\n\n" +
                "Programa de Iniciação Ciêntifica (PIC) " +
                "realizado na Universidade Federal Rural " +
                "de Pernambuco (UFRPE) no curso de Ciência " +
                "da Computação tendo como  objetivo a criação " +
                "de um aplicativo mobile com o intuito de desenvolver " +
                "quadrinhos digitais para alunos do ensino fundamental, " +
                "para uso nas práticas pedagógicas de alfabetização.\n" +
                "\n\n" +
                "Aluno: Felipe Guimarães \n" +
                "Orientador: Robson Santos");


    }
}
