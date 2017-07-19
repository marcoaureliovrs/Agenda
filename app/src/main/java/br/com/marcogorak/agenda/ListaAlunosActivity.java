package br.com.marcogorak.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ListaAlunosActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnNovoAluno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos);
        //Aula01
        String[] alunos = {"Marco", "João", "Jefferson"};
        ListView listaAlunos = (ListView)findViewById(R.id.lista_alunos);
       ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alunos);
        listaAlunos.setAdapter(adapter);

        btnNovoAluno = (Button) findViewById(R.id.btnNovoAluno);

        btnNovoAluno.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnNovoAluno:
                Intent it = new Intent(ListaAlunosActivity.this, ActFormulario.class);
                startActivity(it);
        }
    }
}
