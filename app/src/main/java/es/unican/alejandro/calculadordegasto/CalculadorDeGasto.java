package es.unican.alejandro.calculadordegasto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculadorDeGasto extends AppCompatActivity implements View.OnClickListener{
    Button buttonCalcula;
    EditText editTextNumeroViajeros;
    TextView textViewInformacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculador_de_gasto);
        buttonCalcula = (Button) findViewById(R.id.buttonCalcular);
        editTextNumeroViajeros = (EditText) findViewById(R.id.editTextNumeroViajeros);
        textViewInformacion = (TextView) findViewById(R.id.textViewInformacion);
        buttonCalcula.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.buttonCalcular){
            String numViajeros = editTextNumeroViajeros.getText().toString();
            textViewInformacion.setText(getResources().getString(R.string.infoViajeros)+" "+numViajeros);
        }//if
    }
}
