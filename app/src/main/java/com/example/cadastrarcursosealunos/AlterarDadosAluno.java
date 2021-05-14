package com.example.cadastrarcursosealunos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class AlterarDadosAluno extends AppCompatActivity {
    private EditText edtAlterCPFAluno,edtAlterNomeAluno,edtAlterEmailAluno, edtAlterTelefoneAluno;
    private Button btnAlterAlterarDadosAluno, btnAlterExcluirDadosAluno,btnAlterVoltarAluno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alterar_dados_aluno);
        edtAlterCPFAluno = findViewById(R.id.edtAlterCPFAluno);
        edtAlterNomeAluno = findViewById(R.id.edtAlterNomeAluno);
        edtAlterEmailAluno = findViewById(R.id.edtAlterEmailAluno);
        edtAlterTelefoneAluno =findViewById(R.id.edtAlterTelefoneAluno);
        btnAlterAlterarDadosAluno = findViewById(R.id.btnAlterAlterarDadosAluno);
        btnAlterExcluirDadosAluno = findViewById(R.id.btnAlterExcluirDadosAluno);
        btnAlterVoltarAluno = findViewById(R.id.btnAlterVoltarAluno);
    }
}