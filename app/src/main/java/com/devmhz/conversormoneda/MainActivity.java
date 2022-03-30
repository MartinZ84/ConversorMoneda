package com.devmhz.conversormoneda;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etDolar;
    EditText etEuro;
    TextView tvValorConversion2;
    RadioButton rbADolares;
    RadioButton rbAEuros;
    Button cambiarValor;
    Button convertir;

    private void inicializarVista(){
        etDolar = findViewById(R.id.etDolar);
        etEuro = findViewById(R.id.etEuro);
        tvValorConversion2 = findViewById(R.id.tvValorConversion2);
        rbADolares = findViewById(R.id.rbDolar);
        rbAEuros = findViewById(R.id.rbEuro);
        cambiarValor = findViewById(R.id.btCambiarValor);
        convertir = findViewById(R.id.btConvertir);

        cambiarValor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        convertir.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                float valor;
                float resultado;
                if (rbADolares.isChecked()) {

                    valor=Float.parseFloat(etEuro.getText().toString());
                    resultado = (float) (valor * 1.11);
                    etDolar.setText(resultado+"");
                } else if(rbAEuros.isChecked()){
                    valor=Float.parseFloat(etDolar.getText().toString());
                    resultado = (float) (valor * 0.9);
                    etEuro.setText(resultado+"");
                }

            }
        });

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarVista();

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);

        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.dolar){
            //Hacer algo
            return true;

        }
        return true;

    }
}