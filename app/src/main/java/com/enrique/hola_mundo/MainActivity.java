package com.enrique.hola_mundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
/**
 * author Enrique García-Palacios Blasco
 */
public class MainActivity extends AppCompatActivity {
    public Button btnsumar;
    public Button btnrestar;
    public Button btnmultiplicar;
    public Button btndividir;
    public Button btnreset;
    public EditText txtN1;
    public EditText txtN2;
    public TextView txtResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsumar=(Button) findViewById(R.id.btnsumar);
        btnrestar=(Button) findViewById(R.id.btnrestar);
        btnmultiplicar=(Button) findViewById(R.id.btnmultiplicar);
        btndividir=(Button) findViewById(R.id.btndividir);
        btnreset=(Button) findViewById(R.id.btnreset);
        txtN1=(EditText) findViewById(R.id.etn1);
        txtN2=(EditText) findViewById(R.id.etn2);
        txtResultado=(TextView) findViewById(R.id.tv1);

        btnsumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1=0;
                double n2=0;
                double suma=0;

                n1=Double.parseDouble(txtN1.getText().toString());
                n2=Double.parseDouble(txtN2.getText().toString());

                suma=n1+n2;

                txtResultado.setText(String.valueOf(suma));
            }
        });

        btnrestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1=0;
                double n2=0;
                double resta=0;

                n1=Double.parseDouble(txtN1.getText().toString());
                n2=Double.parseDouble(txtN2.getText().toString());

                resta=n1-n2;

                txtResultado.setText(String.valueOf(resta));
            }
        });

        btnmultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1=0;
                double n2=0;
                double multiplicacion=0;

                n1=Double.parseDouble(txtN1.getText().toString());
                n2=Double.parseDouble(txtN2.getText().toString());

                multiplicacion=n1*n2;

                txtResultado.setText(String.valueOf(multiplicacion));
            }
        });

        btndividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1=0;
                double n2=0;
                double dividir=0;

                n1=Double.parseDouble(txtN1.getText().toString());
                n2=Double.parseDouble(txtN2.getText().toString());

                dividir=n1/n2;

                txtResultado.setText(String.valueOf(dividir));
            }
        });

        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtN1.setText(null);
                txtN2.setText(null);
                txtResultado.setText(null);
            }
        });

        //final de la practica
    }
}
