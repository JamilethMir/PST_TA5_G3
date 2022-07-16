package com.example.amst3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Inicio extends AppCompatActivity {

    private EditText et1,et2;
    private String user,contra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        user = "root";
        contra = "root";
        et1=(EditText)findViewById(R.id.usuario);
        et2=(EditText)findViewById(R.id.contraseña);
    }

    public void logear(View v){
        if(et1.getText().toString().equals(user) && et2.getText().toString().equals(contra)){
            Intent i = new Intent(this, Menu.class );
            startActivity(i);
        }
    }
}
