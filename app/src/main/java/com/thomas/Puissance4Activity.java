package com.thomas;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

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

        findViewById(R.id.column1).setOnClickListener(view -> {
            clickColonne("1");
        });

        findViewById(R.id.column2).setOnClickListener(view -> {
            clickColonne("2");
        });

        findViewById(R.id.column3).setOnClickListener(view -> {
            clickColonne("3");
        });

        findViewById(R.id.column4).setOnClickListener(view -> {
            clickColonne("4");
        });

        findViewById(R.id.column5).setOnClickListener(view -> {
            clickColonne("5");
        });

        findViewById(R.id.column6).setOnClickListener(view -> {
            clickColonne("6");
        });

        findViewById(R.id.column7).setOnClickListener(view -> {
            clickColonne("7");
        });
    }

    public void clickColonne(String colonne) {
        nbTour++;

        if (colonne.equals("1")) {
            if (colonne1 < 6) {

                //mettre le pion en n+1
                colonne1++;
            }
        }





// mettre le pion en fonction du joueur et de la colonne
// +1 à la colonne récupérée
        if (nbTour % 2 == 0) {
            Joueur = "yellow";
        } else {
            Joueur = "red";
        }
    }
}