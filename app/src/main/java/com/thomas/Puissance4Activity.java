package com.thomas;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class Puissance4Activity extends AppCompatActivity {
    int joueur = R.color.yellow;

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
            clickColonne(1, view);
        });

        findViewById(R.id.column2).setOnClickListener(view -> {
            clickColonne(2, view);
        });

        findViewById(R.id.column3).setOnClickListener(view -> {
            clickColonne(3, view);
        });

        findViewById(R.id.column4).setOnClickListener(view -> {
            clickColonne(4, view);
        });

        findViewById(R.id.column5).setOnClickListener(view -> {
            clickColonne(5, view);
        });

        findViewById(R.id.column6).setOnClickListener(view -> {
            clickColonne(6, view);
        });

        findViewById(R.id.column7).setOnClickListener(view -> {
            clickColonne(7, view);
        });
    }

    public void clickColonne(int colonneNumber, View colonneView) {
        nbTour++;

        if (colonneNumber == 1) {
            if (colonne1 < 6) {
                colonne1++;
                int caseId = getResources().getIdentifier("case" + colonneNumber, "id", getApplicationContext().getPackageName());
                ImageView caseView = colonneView.findViewById(caseId);
                caseView.setColorFilter(ContextCompat.getColor(getApplicationContext(), joueur), android.graphics.PorterDuff.Mode.MULTIPLY);
            }
        }

        if (nbTour % 2 == 0) {
            joueur = R.color.yellow;
        } else {
            joueur = R.color.red;
        }
    }
}