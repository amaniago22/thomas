package com.thomas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String nbutilisateur = "";
    ArrayList<String> listNbUtilisateur=new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cliqueBouton1(View view) {
        nbutilisateur = nbutilisateur+"1";
    }

    public void cliqueBouton2(View view) {
        nbutilisateur = nbutilisateur+"2";
    }

    public void cliqueBouton3(View view) {
        nbutilisateur = nbutilisateur+"3";
    }

    public void cliqueBouton4(View view) {
        nbutilisateur = nbutilisateur+"4";
    }

    public void cliqueBouton5(View view) {
        nbutilisateur = nbutilisateur+"5";
    }

    public void cliqueBouton6(View view) {
        nbutilisateur = nbutilisateur+"6";
    }

    public void cliqueBouton7(View view) {
        nbutilisateur = nbutilisateur+"7";
    }

    public void cliqueBouton8(View view) {
        nbutilisateur = nbutilisateur+"8";
    }

    public void cliqueBouton9(View view) {
        nbutilisateur = nbutilisateur+"9";
    }

    public void cliqueBoutonPlus(View view) {
        if(nbutilisateur==""){
            return;
        }
        listNbUtilisateur.add(nbutilisateur);
        // mettre le +
        nbutilisateur="";
    }

    public void somme(View view) {
        int resultat=0;
        for(int i=0;i < listNbUtilisateur.size(); i++) {
            int nombre=Integer.parseInt(listNbUtilisateur.get(i));
            resultat=resultat+nombre;
        }
        if(nbutilisateur!="") {
            int nombrecourant=Integer.parseInt(nbutilisateur);
            resultat=resultat+nombrecourant;
        }
        //afficher résultat
    }

}