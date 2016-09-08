package com.betosoft.primerproyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnOk, btnCancel, btnNuevo;
    EditText txtMensaje;
    TextView txtMensaje2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMensaje = (EditText) findViewById(R.id.txtMensaje);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);
        txtMensaje2 = (TextView) findViewById(R.id.txtSalida);
        txtMensaje.setText("Hola Mundo");
        btnOk.setOnClickListener(this);
        btnCancel.setOnClickListener(
                new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMensaje.setText("");
                txtMensaje2.setText("");
            }
        }
        );
        btnNuevo = new Button(this);
        LinearLayout ll = (LinearLayout) findViewById(R.id.SegundoLayout);
        ll.addView(btnNuevo);

    }

    @Override
    public void onClick(View v) {
        txtMensaje2.append("\n" + txtMensaje.getText());
    }

}
