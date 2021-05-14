package com.example.cadastrarcursosealunos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class AlterarDadosCurso extends AppCompatActivity {
    private EditText edtAlterCodCurso, edtAlterNomeCurso, edtAlterQuatidadeHorasCurso;
    private Button btnAlterAlterarDadosCurso,btnAlterExcluirDadosCurso,btnAlterVoltarCurso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alterar_dados_curso);
        edtAlterCodCurso = findViewById(R.id.edtAlterCodCurso);
        edtAlterNomeCurso = findViewById(R.id.edtAlterNomeCurso);
        edtAlterQuatidadeHorasCurso = findViewById(R.id.edtAlterQuatidadeHorasCurso);
        btnAlterAlterarDadosCurso = findViewById(R.id.btnAlterAlterarDadosCurso);
        btnAlterExcluirDadosCurso = findViewById(R.id.btnAlterExcluirDadosCurso);
        btnAlterVoltarCurso = findViewById(R.id.btnAlterVoltarCurso);
    }
}