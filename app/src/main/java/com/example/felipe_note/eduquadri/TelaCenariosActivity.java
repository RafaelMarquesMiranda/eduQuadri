package com.example.felipe_note.eduquadri;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TelaCenariosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cenarios);
    }

    public void irParaPersonagem(View v) {
        Intent intent = new Intent(this, TelaPersonagemActivity.class);

        switch (v.getId()) {
            case R.id.idCenario1:
                intent.putExtra("id_imagem", 1);
                break;
            case R.id.idCenario2:
                intent.putExtra("id_imagem", 2);
                break;
            case R.id.idCenario3:
                intent.putExtra("id_imagem", 3);
                break;
        }

        startActivity(intent);
    }
}
