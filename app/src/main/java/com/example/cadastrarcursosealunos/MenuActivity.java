package com.example.cadastrarcursosealunos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    private Button btnMenuCadastrarCurso,btnMenuCadastrarAluno,
            btnMenuListarAlunos,btnMenuAlterarDadosCurso,btnMenuAlterarDadosAluno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_main);
        btnMenuCadastrarCurso = findViewById(R.id.btnMenuCadastrarCurso);
        btnMenuCadastrarAluno = findViewById(R.id.btnMenuCadastrarAluno);
        btnMenuListarAlunos = findViewById(R.id.btnMenuListarAlunos);
        btnMenuAlterarDadosCurso = findViewById(R.id.btnMenuAlterarDadosCurso);
        btnMenuAlterarDadosAluno = findViewById(R.id.btnMenuAlterarDadosAluno);
    }
}