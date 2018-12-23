package br.com.apps.rameda.alcoolougasolina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText alcool;
    EditText gasolina;
    TextView resposta;
    Button Resultado;
    String respo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alcool = (EditText) findViewById(R.id.et_alcoo);
        gasolina = (EditText) findViewById(R.id.et_gasolina);
        Resultado = (Button) findViewById(R.id.btt_resultado);
        resposta = (TextView)findViewById(R.id.tv_resultado);

        Resultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    String preAlcool=alcool.getText().toString();
                    String preGasolina=gasolina.getText().toString();

                    Calculos calculos=new Calculos(preAlcool, preGasolina);
                    if (calculos.validar()==false) {
                        resposta.setText("FAVOR DIGITAR OS VALORES CORRETAMENTE");
                    }
                    else{
                    respo=calculos.Calcula();
                    resposta.setText(respo);
                }

            }
        });



    }







}
