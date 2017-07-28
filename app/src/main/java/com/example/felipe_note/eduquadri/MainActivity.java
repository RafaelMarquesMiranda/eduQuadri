package com.example.felipe_note.eduquadri;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener{

    private Button btnCreate,
                btnVisualize,
                btnSobre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnCreate = (Button) findViewById(R.id.btnCreate);
        btnVisualize = (Button) findViewById(R.id.btnVisualize);
        btnSobre = (Button) findViewById(R.id.btnSobre);

        btnCreate.setOnClickListener(this);
        btnVisualize.setOnClickListener(this);
        btnSobre.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
        //return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        switch (id) {
            case R.id.exit:

                //Enviará uma Flag para a primiera activy que executou o startActvty, e fechará
                Intent intent = new Intent(getApplicationContext(), TelaLayoutActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("EXIT", true);
                startActivity(intent);
                break;
            case R.id.ajuda:
                Intent it = new Intent(this, TelaAjudaActivity.class);
                startActivity(it);
                break;

        }

        if(id == R.id.exit)
            finish();


        return super.onOptionsItemSelected(item);

    }

    @Override
    public void onClick(View v) {

        Intent it;

        switch (v.getId()) {

            case R.id.btnCreate:
                it = new Intent(this, TelaLayoutActivity.class);
                startActivity(it);
                break;

            case R.id.btnVisualize:
                it = new Intent(this, TelaVisualizarActivity.class);
                startActivity(it);
                break;

            case R.id.btnSobre:
                it = new Intent(this, TelaSobreActivity.class);
                startActivity(it);
                break;
        }
    }
}
