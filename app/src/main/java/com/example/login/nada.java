package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class nada extends AppCompatActivity {
    TextView usu_t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nada);

        usu_t = (TextView) findViewById(R.id.usuaria);
        usu_t.setText(getIntent().getExtras().getString("usuario"));
    }
}