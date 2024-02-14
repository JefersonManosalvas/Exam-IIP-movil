package com.jpml.ficha_personal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class ficha_generada extends AppCompatActivity {
    TextView Cedula,Nombre,edad,Direccion,Telefono,Correo;
    String fecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ficha_generada);
        Cedula=findViewById(R.id.txt_cedula);
        Nombre=findViewById(R.id.txt_nombre);
        edad=findViewById(R.id.txt_edad);
        Direccion=findViewById(R.id.txt_direccion);
        Telefono=findViewById(R.id.txt_telefono);
        Correo=findViewById(R.id.txt_email);

        Bundle datos = this.getIntent().getExtras();
        String cedula = datos.getString("cedulaP");
        String nombre = datos.getString("nombresP");
        String apellido = datos.getString("apellido");
         fecha = datos.getString("fecha");
        String correo = datos.getString("correo");
        String telefono = datos.getString("telefono");
        String direccion = datos.getString("direccion");


        Cedula.setText(cedula);
        Nombre.setText(nombre+" "+apellido);
        edad.setText(fecha);
        Direccion.setText(direccion);
        Telefono.setText(telefono);
        Correo.setText(correo);

    }

    public void RegUsu(View V) {
        BDHelper admin = new BDHelper(this, "registrar.db", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String cedula = Cedula.getText().toString();
        String nombre = Nombre.getText().toString();
        String Edad = edad.getText().toString();
        String direccion = Direccion.getText().toString();
        String telefono = Telefono.getText().toString();
        String correo = Correo.getText().toString();

        ContentValues datosReg = new ContentValues();
        datosReg.put("cedula", cedula);
        datosReg.put("nombre", nombre);
        datosReg.put("fecha", Edad);
        datosReg.put("direccion", direccion);
        datosReg.put("telefono", telefono);
        datosReg.put("correo", correo);

        bd.insert("tbRegUsu", null, datosReg);
        Toast.makeText(ficha_generada.this, "LA FICHA SE REGISTRO CORRECTAMENTE", Toast.LENGTH_SHORT).show();

    }




}