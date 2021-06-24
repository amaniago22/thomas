package com.thomas;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Puissance4Activity extends AppCompatActivity {
    String Joueur = "yellow";


    int nbTour = 0;
    int colonne1 = 0;
    int colonne2 = 0;
    int colonne3 = 0;
    int colonne4 = 0;
    int colonne5 = 0;
    int colonne6 = 0;

    ArrayList<String> casesJoueur1 = new ArrayList<>();
    ArrayList<String> casesJoueur2 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puissance_4);
    }

    public void clickColonne(View view) {
        nbTour++;
// récupérer colonne





// mettre le pion en fonction du joueur et de la colonne
// +1 à la colonne récupérée
        if (nbTour % 2 == 0) {
            Joueur = "yellow";
        } else {
            Joueur = "red";
        }
    }

}