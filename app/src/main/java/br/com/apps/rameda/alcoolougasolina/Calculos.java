package br.com.apps.rameda.alcoolougasolina;

import android.widget.EditText;

public class Calculos {
    //atributos
    String alcool;
    String gasolina;


    //construtor
    public Calculos(String alcoo, String gasol) {
        alcool=alcoo;
        gasolina=gasol;
    }
    //metodos

    public String Calcula() {
        Double resultado=0.0;
        Double alcooo=Double.parseDouble(alcool);
        Double gasosa=Double.parseDouble(gasolina);

        resultado=alcooo / gasosa;
        if (resultado >= 0.7) {
            return "MELHOR UTILIZAR GASOLINA";
        } else {
            return "MELHOR UTLIZAR ALCOOL";
        }
    }

    public boolean validar() {

        if (alcool == null || alcool.equals("")) {
            return false;
        } else {
            if (gasolina == null || gasolina.equals("")) {
                return false;
            }
        }
        return true;
    }
}