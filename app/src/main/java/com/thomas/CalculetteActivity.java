package com.thomas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class CalculetteActivity extends AppCompatActivity {

    String nbutilisateur = "";
    ArrayList<Terme> listeTermes = new ArrayList<>();
    private String currentText = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculette);
    }

    public void cliqueBouton(String valeur) {
        nbutilisateur = nbutilisateur + valeur;
        ((TextView) findViewById(R.id.nombre_user)).setText(currentText + nbutilisateur);
    }

    public void cliqueBouton0(View view) {
        cliqueBouton("0");
    }

    public void cliqueBouton1(View view) {
        cliqueBouton("1");
    }

    public void cliqueBouton2(View view) {
        cliqueBouton("2");
    }

    public void cliqueBouton3(View view) {
        cliqueBouton("3");
    }

    public void cliqueBouton4(View view) {
        cliqueBouton("4");
    }

    public void cliqueBouton5(View view) {
        cliqueBouton("5");
    }

    public void cliqueBouton6(View view) {
        cliqueBouton("6");
    }

    public void cliqueBouton7(View view) {
        cliqueBouton("7");
    }

    public void cliqueBouton8(View view) {
        cliqueBouton("8");
    }

    public void cliqueBouton9(View view) {
        cliqueBouton("9");
    }

    public void cliqueBoutonPlus(View view) {
        if(nbutilisateur.equals("")){
            return;
        }
        Terme termeCourant = new Terme(Integer.parseInt(nbutilisateur), "+");
        listeTermes.add(termeCourant);
        nbutilisateur = "";
        currentText = ((TextView) findViewById(R.id.nombre_user)).getText() + " + ";
        ((TextView) findViewById(R.id.nombre_user)).setText(currentText);
    }

    public void cliqueBoutonMultiplier(View view) {
        if(nbutilisateur.equals("")){
            return;
        }
        Terme termeCourant = new Terme(Integer.parseInt(nbutilisateur), "x");
        listeTermes.add(termeCourant);
        nbutilisateur = "";
        currentText = ((TextView) findViewById(R.id.nombre_user)).getText() + " x ";
        ((TextView) findViewById(R.id.nombre_user)).setText(currentText);
    }


    public void calcul(View view) {
        int resultat = 0;
        String operationCourante = "";

        for (int i = 0; i < listeTermes.size(); i++) {
            Terme termeCourant = listeTermes.get(i);
            int valeur = termeCourant.getValeur();

            if(operationCourante.equals("+")){
                resultat = resultat + valeur;
            } else if (operationCourante.equals("x")) {
                resultat = resultat * valeur;
            } else {
                resultat = resultat + valeur;
            }

            operationCourante = termeCourant.getOperation();
        }

        if(!nbutilisateur.equals("")) {
            int valeur = Integer.parseInt(nbutilisateur);
            if(operationCourante.equals("+")){
                resultat = resultat + valeur;
            } else if (operationCourante.equals("x")) {
                resultat = resultat * valeur;
            }
            ((TextView) findViewById(R.id.nombre_user)).setText(((TextView) findViewById(R.id.nombre_user)).getText() + " = " + resultat);
        }
        currentText = "";
        nbutilisateur = "";
        listeTermes.clear();
    }
}
