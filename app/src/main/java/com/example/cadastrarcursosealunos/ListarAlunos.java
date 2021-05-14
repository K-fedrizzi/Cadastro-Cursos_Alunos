package com.example.cadastrarcursosealunos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class ListarAlunos extends AppCompatActivity {
    private ListView lstAlunos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_alunos);
        lstAlunos = findViewById(R.id.lstAlunos);
    }
}