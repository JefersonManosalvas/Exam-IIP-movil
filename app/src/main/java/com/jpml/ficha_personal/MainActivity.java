package com.jpml.ficha_personal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText cedula,nombre,apellido,fechaN,correo,telefono,direccion;
    Button calendario,enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cedula=findViewById(R.id.ed_cedula);
        nombre=findViewById(R.id.ed_nombre);
        apellido=findViewById(R.id.ed_apellido);
        fechaN=findViewById(R.id.ed_fechaNa);
        correo=findViewById(R.id.ed_email);
        telefono=findViewById(R.id.ed_telefono);
        direccion=findViewById(R.id.ed_direccion);
        calendario=findViewById(R.id.btn_calendario);
        enviar=findViewById(R.id.btn_enviar);

    }
}