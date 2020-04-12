package com.example.ejercicio1.salarioempleado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText valorH;
    private EditText horasT;
    private Button procesar;
    int Vhora;
    int Htrabajadas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valorH = findViewById(R.id.txtvalorhora);
        horasT = findViewById(R.id.txthorastrabajadas);
        procesar = findViewById(R.id.btnprocesar);

       procesar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Vhora = Integer.parseInt(valorH.getText().toString());
               Htrabajadas = Integer.parseInt(horasT.getText().toString());

               int resultado = Vhora * Htrabajadas;
               Toast.makeText(MainActivity.this, " El salario del empleado es: " + resultado, Toast.LENGTH_LONG).show();

               valorH.setText("");
               horasT.setText("");

           }
       });
    }
}
