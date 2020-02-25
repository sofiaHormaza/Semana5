package com.example.semana5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText nombre;
    private Button continuarBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre=findViewById(R.id.nombre);
        continuarBtn=findViewById(R.id.continuarBtn);

        continuarBtn.setOnClickListener(
                (v) -> {
                    String name=nombre.getText().toString();
                    Intent i=new Intent(MainActivity.this,Main2Activity.class);
                    i.putExtra("nom",name);
                    startActivity(i);
                }
        );
    }
}
