package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText contraseña, usuario;
    TextView usu_t,t_con;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.inicioo);
        contraseña = (EditText) findViewById(R.id.contraseña);
        usuario = (EditText) findViewById(R.id.usuario);
        usu_t = (TextView) findViewById(R.id.usu_t);
        t_con = (TextView) findViewById(R.id.t_con);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario2="liooficial",contraseña2="12345",usuario1=usuario.getText().toString(),contraseña1=contraseña.getText().toString();
                if (usuario1.equals(usuario2)){
                    if(contraseña1.equals(contraseña2)){
                    Intent i =new Intent(MainActivity.this,nada.class);
                        i.putExtra("usuario", usuario1);
                    startActivity(i);
                    }else{

                    }

                }else{

                }


            }
        });
    }
}
