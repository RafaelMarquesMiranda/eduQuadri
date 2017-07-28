package com.example.felipe_note.eduquadri;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TelaLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_layout);

        //Para fechar a Activity: Função sair.
        if (getIntent().getBooleanExtra("EXIT", false)) {
            finish();
        }
    }

    public void irPraTelaCenario(View v) {
        Intent intent = new Intent(this, TelaCenariosActivity.class);
        startActivity(intent);
    }
}
