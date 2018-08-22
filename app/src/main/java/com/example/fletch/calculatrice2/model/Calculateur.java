package com.example.fletch.calculatrice2.model;

import org.mariuszgromada.math.mxparser.Expression;

public class Calculateur {

    private String formule;

    public String getFormule() {
        return formule;
    }

    public Calculateur setFormule(String formule) {
        this.formule = formule;
        return this;
    }


    public double calculer(){
        Expression e = new Expression(formule);
        return e.calculate();
    }


}
