package com.example.eva1_16_alert_dialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onShowAlertDialog(View v){
        //AlertDialog miCuadroDialog = new...

        new AlertDialog.Builder(this)
                .setTitle("CUADRO DE DIÁLOGO DE ANDROID")
                .setMessage("Cuadro de diálogo del sistema")
                //.setIcon(R.drawable.ic_launcher_foreground)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.wtf("ALERT DIALOG","YES");

                    }
                })

         .setNeutralButton("No", new DialogInterface.OnClickListener() {
             @Override
             public void onClick(DialogInterface dialog, int which) {
                 Log.wtf("ALERT DIALOG","NO");

             }
         })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.wtf("ALERT DIALOG","CANCEL");

                    }
                })
                .create()
                .show();

    }
    public void onShowMyAlertDialog (View v){
        final Dialog miCuadroDialogo = new Dialog(this);
        miCuadroDialogo.setContentView(R.layout.mi_dialogo);
        TextView txtVwTitulo ;
        txtVwTitulo = miCuadroDialogo.findViewById(R.id.txtVwTitulo);
        txtVwTitulo.setText("Este es mi cuadro de dialogo!!!!");
        final EditText editTxDatos;
        editTxDatos= miCuadroDialogo.findViewById(R.id.editTxtDatos);
        Button btnOk;
        btnOk = miCuadroDialogo.findViewById(R.id.btnOk);
        btnOk .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sCale;
                sCale = editTxDatos.getText().toString();
                Log.wtf("Cuadro personal", sCale);
            }
        });

        miCuadroDialogo.show();

    }
}