package br.com.marcogorak.agenda;

import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;

import br.com.marcogorak.agenda.modelo.Aluno;

/**
 * Created by admin on 19/07/17.
 */

public class AuxFormulario {

    EditText edtNome;
    EditText edtEndereco;
    EditText edtTelefone;
    EditText edtSite;
    RatingBar ratBarNota;

    public AuxFormulario(ActFormulario act) {
        edtNome = (EditText) act.findViewById(R.id.edtNome);
        edtEndereco = (EditText) act.findViewById(R.id.edtEndereco);
        edtTelefone = (EditText) act.findViewById(R.id.edtTelefone);
        edtSite = (EditText) act.findViewById(R.id.edtSite);
        ratBarNota = (RatingBar) act.findViewById(R.id.ratBarNota);
    }

    public Aluno getAluno() {
        Aluno aluno = new Aluno();

        aluno.setNome(edtNome.getText().toString());
        aluno.setEndereco(edtEndereco.getText().toString());
        aluno.setTelefone(edtTelefone.getText().toString());
        aluno.setSite(edtSite.getText().toString());
        aluno.setNota(Double.valueOf(ratBarNota.getProgress()));

        return aluno;
    }
}
