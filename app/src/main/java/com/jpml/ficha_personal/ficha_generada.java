package com.jpml.ficha_personal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
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
        //edad.setText(calcul_edad(fecha));
        Direccion.setText(direccion);
        Telefono.setText(telefono);
        Correo.setText(correo);

    }



//    public String calcul_edad(String fechaNacimiento) {
//
//        String[] partesFecha = fechaNacimiento.split("-");
//        int añoNacimiento = Integer.parseInt(partesFecha[0]);
//        int mesNacimiento = Integer.parseInt(partesFecha[1]) - 1; // Restar 1 porque los meses en Calendar empiezan en 0
//        int diaNacimiento = Integer.parseInt(partesFecha[2]);
//
//
//        Calendar fechaActual = Calendar.getInstance();
//        int añoActual = fechaActual.get(Calendar.YEAR);
//        int mesActual = fechaActual.get(Calendar.MONTH); // Los meses también empiezan en 0
//        int diaActual = fechaActual.get(Calendar.DAY_OF_MONTH);
//
//        int edad = añoActual - añoNacimiento;
//
//
//        if (mesActual < mesNacimiento || (mesActual == mesNacimiento && diaActual < diaNacimiento)) {
//            edad--;
//        }

//
//        return String.valueOf(edad);
//    }
}