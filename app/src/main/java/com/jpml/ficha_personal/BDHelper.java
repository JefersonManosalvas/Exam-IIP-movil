package com.jpml.ficha_personal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BDHelper extends SQLiteOpenHelper {
    public BDHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

            db.execSQL("CREATE TABLE tbRegUsu"+"(" +
                    "cedula_usu text PRIMARY KEY,"+
                    "nombre text NOT NULL,"+
                    "fecha text NOT NULL,"+
                    "correo text NOT NULL," +
                    "telefono text NOT NULL,"+
                    "direccion text NOT NULL)"
            );

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //CAMBIE LA VERSIÓN DE LA TABLA DE LA BDD
        db.execSQL("DROP TABLE tbRegUsu");
        onCreate(db);
    }
}
