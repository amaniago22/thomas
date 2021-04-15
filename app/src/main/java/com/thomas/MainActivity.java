package com.thomas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String nbutilisateur = "";
    ArrayList<String> listNbUtilisateur = new ArrayList<>();
    private String currentText = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        listNbUtilisateur.add(nbutilisateur);
        nbutilisateur = "";
        currentText = ((TextView) findViewById(R.id.nombre_user)).getText() + " + ";
        ((TextView) findViewById(R.id.nombre_user)).setText(currentText);
    }

    public void somme(View view) {
        int resultat = 0;
        for (int i = 0; i < listNbUtilisateur.size(); i++) {
            int nombre = Integer.parseInt(listNbUtilisateur.get(i));
            resultat = resultat + nombre;
        }
        if(!nbutilisateur.equals("")) {
            int nombrecourant = Integer.parseInt(nbutilisateur);
            resultat = resultat + nombrecourant;
            ((TextView) findViewById(R.id.nombre_user)).setText(((TextView) findViewById(R.id.nombre_user)).getText() + " = " + resultat);
        }
        currentText = "";
        nbutilisateur = "";
        listNbUtilisateur.clear();
    }

}