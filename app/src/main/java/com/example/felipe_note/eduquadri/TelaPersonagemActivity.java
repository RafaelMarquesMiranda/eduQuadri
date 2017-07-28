package com.example.felipe_note.eduquadri;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class TelaPersonagemActivity extends AppCompatActivity {

    int id = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_personagem);

        Intent it = getIntent();
        id = it.getIntExtra("id_imagem", -1);
    }


    public void irParaTelaCriacao(View v) {
        Intent intent = new Intent(this, TelaCriacaoActivity.class);
        intent.putExtra("id_cenario", id);

        switch (v.getId()) {
            case R.id.imgPerson1:
                intent.putExtra("id_person", 1);
                break;
            case R.id.imgPerson2:
                intent.putExtra("id_person", 2);
                break;
            case R.id.imgPerson3:
                intent.putExtra("id_person", 3);
                break;
            case R.id.imgPerson4:
                intent.putExtra("id_person", 4);
                break;
        }

        startActivity(intent);
    }

}
