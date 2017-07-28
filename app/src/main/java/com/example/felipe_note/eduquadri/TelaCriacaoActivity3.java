package com.example.felipe_note.eduquadri;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class TelaCriacaoActivity3 extends AppCompatActivity
        implements View.OnTouchListener {

    int idCenario, idPerson;
    ImageView imageViewCen,
            imageViewPers;

    EditText edt1;
    //EditText edt2;

    int x, y;
    private ViewGroup rootLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_criacao3);

        Intent it = getIntent();
        idCenario = it.getIntExtra("id_cenario", -1);
        idPerson = it.getIntExtra("id_person", -1);

        imageViewCen = (ImageView) findViewById(R.id.imageView);
        imageViewPers = (ImageView) findViewById(R.id.imageView2);

        if(idCenario == 1)
            imageViewCen.setImageResource(R.drawable.cozinha);
        if(idCenario == 2)
            imageViewCen.setImageResource(R.drawable.bibli);
        if(idCenario == 3)
            imageViewCen.setImageResource(R.drawable.parque);

        switch (idPerson) {
            case 1:
                imageViewPers.setImageResource(R.drawable.person_1_1);
                break;
            case 2:
                //imageViewPers.setImageResource(R.drawable.person_2_1);
                break;
            case 3:
                imageViewPers.setImageResource(R.drawable.person_4_1);
                break;
            case 4:
                //imageViewPers.setImageResource(R.drawable.person_5_1);
                break;
        }


        edt1 = (EditText) findViewById(R.id.edt1);
        //edt2 = (EditText) findViewById(R.id.edt2);
        //edt1.setText("Colocar algo aq");


        //Para o touch das views
        //rootLayout = (ViewGroup) findViewById(R.id.view_root);
        //RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(150, 150);

        //edt1.setLayoutParams(layoutParams);
        //edt1.setOnTouchListener(this);

        //edt2.setLayoutParams(layoutParams);
        //edt2.setOnTouchListener(this);
    }

    public void digitar(View v) {

        if(edt1.getText().toString().equals("")) {
            Toast.makeText(this, "Para confirmar, adicione texto no balão a esquerda", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Texto gravado\nPode arrastá-lo para onde desejar", Toast.LENGTH_LONG).show();

            rootLayout = (ViewGroup) findViewById(R.id.view_root);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(150, 150);

            edt1.setLayoutParams(layoutParams);
            edt1.setOnTouchListener(this);
        }
    }

    public void salvarQuadrinho(View v) {


        AlertDialog.Builder dialog = new AlertDialog.Builder(TelaCriacaoActivity3.this);
        dialog.setTitle("Aviso");
        dialog.setMessage("Deseja salvar este quadrinho ?");
        dialog.setNegativeButton("Não", null);
        dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                //Confirmação do cadastro do quadrinho
                Toast.makeText(getBaseContext(), "Quadrinho Cadastrado com sucesso !", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
                finish();

            }
        });
        dialog.show();
    }


    @Override
    public boolean onTouch(View view, MotionEvent event) {
        final int X = (int) event.getRawX();
        final int Y = (int) event.getRawY();
        switch (event.getAction() & MotionEvent.ACTION_MASK) {
            case MotionEvent.ACTION_DOWN:
                RelativeLayout.LayoutParams lParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
                x = X - lParams.leftMargin;
                y = Y - lParams.topMargin;
                break;
            case MotionEvent.ACTION_MOVE:
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view
                        .getLayoutParams();
                layoutParams.leftMargin = X - x;
                layoutParams.topMargin = Y - y;
                layoutParams.rightMargin = -250;
                layoutParams.bottomMargin = -250;
                view.setLayoutParams(layoutParams);
                break;
        }
        //rootLayout.invalidate();
        return true;
    }
}
