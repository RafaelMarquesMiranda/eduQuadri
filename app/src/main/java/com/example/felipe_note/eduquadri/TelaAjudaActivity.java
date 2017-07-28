package com.example.felipe_note.eduquadri;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TelaAjudaActivity extends AppCompatActivity {

    TextView txtAjuda;
    TextView txtLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_ajuda);

        txtAjuda = (TextView) findViewById(R.id.txtAjuda);

        String ajuda = "O EduQuadrin nos permitirá criar nosso quadrinho digital. Nele você consegui escolher o layout final " +
                "do seu quadrinho assim que toca na opção \"Criar Quadrinhos\" presente na tela principal, logo em seguida você " +
                "poderá escolher o cenário em que seus personagem poderão interagir. \n\n" +
                "Tendo feito a escolha do seu cenário o EduQuadrin lhe levará para uma " +
                "tela de personagens, onde você esolherá o seu personagem sendo ele uma criança, um menino ou menina, ou ainda um adulto," +
                "homem ou mulher :D\n\n" +
                "Após a escolha dos seus personagens você poderá começar a criar seus próprios quadrinhos !\n" +
                "Basta colocar o texto no balão que encontra-se no lado superior esquerdo da tela e logo em seguida tocar no 'V' verde " +
                "no lado superior direito para confirmar seu texto e poder arrastar seu balão para onde desejar. \n\n" +
                "Tendo concluído sua primeira charge você poderá ir para a charge seguinte tocando na seta que encontra-se no lado inferior direito.\n\n" +
                "Lembrando que, na última charge você poderá salvar seu quadrinho para depois visualizá-lo. \n\nDivirta-se ;)\n\n";

        txtAjuda.setText(ajuda);

    }

    public void criarQuadrinho(View v) {
        Intent it = new Intent(this, TelaLayoutActivity.class);
        startActivity(it);
        finish();
    }


}
