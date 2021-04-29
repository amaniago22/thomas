package com.thomas;

class Terme {
    private int valeur;
    private String operation;

    public Terme (int valeurParam, String operationParam) {
        valeur = valeurParam;
        operation = operationParam;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
