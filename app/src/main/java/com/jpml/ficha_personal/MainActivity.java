package com.jpml.ficha_personal;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText cedula,nombre,apellido,fechaN,correo,telefono,direccion;
    Button calendario,enviar;
    String fecha;

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
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                envia_form();
            }
        });



    }

    public void envia_form(){
        Bundle datos = new Bundle();
        String cedulaP = cedula.getText().toString();
        String nombresP = nombre.getText().toString();
        String Apellido = apellido.getText().toString();
        String Fechan = fechaN.getText().toString();
        String Correo = correo.getText().toString();
        String Telefono = telefono.getText().toString();
        String Direccion = direccion.getText().toString();

            Intent intent = new Intent(MainActivity.this, ficha_generada.class);
            datos.putString("cedulaP", cedulaP);
            datos.putString("nombresP", nombresP);
            datos.putString("apellido", Apellido);
            datos.putString("fecha", Fechan);
            datos.putString("correo", Correo);
            datos.putString("telefono", Telefono);
            datos.putString("direccion", Direccion);
            intent.putExtras(datos);
            startActivity(intent);






    }

    public void AbrirCalendario(View view) {
        Calendar cal = Calendar.getInstance();
        int anio = cal.get(Calendar.YEAR);
        int mes = cal.get(Calendar.MONTH);
        int dia = cal.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog dpd = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                fecha = dayOfMonth + "/" + (month + 1) + "/" + year;
                fechaN.setText(fecha);
            }
        }, dia, mes, anio);
        dpd.show();
    }



}