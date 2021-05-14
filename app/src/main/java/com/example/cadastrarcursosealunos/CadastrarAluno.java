package com.example.cadastrarcursosealunos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class CadastrarAluno extends AppCompatActivity {
    private EditText edtCadNomeAluno, edtCadCPFAluno,
            edtCadEmailAluno, edtCadTelefoneAluno;
    private Spinner spinnCadCursoAluno;
    private Button btnCadCadastrarAluno;
    private Button btnCadVoltarAluno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_aluno);
        edtCadNomeAluno = findViewById(R.id.edtCadNomeAluno);
        edtCadCPFAluno = findViewById(R.id.edtCadCPFAluno);
        edtCadEmailAluno = findViewById(R.id.edtCadEmailAluno);
        edtCadTelefoneAluno = findViewById(R.id.edtCadTelefoneAluno);
        spinnCadCursoAluno = findViewById(R.id.spinnCadCursoAluno);
        btnCadCadastrarAluno = findViewById(R.id.btnCadCadastrarAluno);
        btnCadVoltarAluno = findViewById(R.id.btnCadVoltarAluno);
    }
}