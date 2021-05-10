package com.thomas;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MorpionActivity extends AppCompatActivity {

    String joueur = "X";

    int nbTour = 0;

    ArrayList<String> casesJoueurX = new ArrayList<>();
    ArrayList<String> casesJoueurO = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morpion);
    }

    public void clickCase(View view) {
        if (((TextView) view).getText().equals("")) {
            ((TextView) view).setText(joueur);

            nbTour++;

            if (nbTour % 2 == 0) {
                casesJoueurO.add(getResources().getResourceEntryName(view.getId()));
                joueur = "X";
            } else {
                casesJoueurX.add(getResources().getResourceEntryName(view.getId()));
                joueur = "O";
            }

            detecterVainqueur();
        }
    }

    private void detecterVainqueur() {
        /*
        Si trois croix alignées alors joueur X gagne
        Si trois ronds alignés alors joueur 0 gagne
        Sinon égalité (Que si nombre tour = 9
         */


        //Cas joueur X gagne
        if (checkCombinaisons(casesJoueurX)) {
            new AlertDialog.Builder(this)
                    .setTitle("Joueur 1 gagne")
                    .setPositiveButton("OK", (dialog, which) -> {
                        dialog.dismiss();
                        MorpionActivity.this.recreate();
                    })
                    .setCancelable(false)
                    .setIcon(android.R.drawable.ic_dialog_info)
                    .show();
        } else if (checkCombinaisons(casesJoueurO)) {
            new AlertDialog.Builder(this)
                    .setCancelable(false)
                    .setTitle("Joueur 2 gagne")
                    .setPositiveButton("OK", (dialog, which) -> {
                        dialog.dismiss();
                        MorpionActivity.this.recreate();
                    })
                    .setIcon(android.R.drawable.ic_dialog_info)
                    .show();
        } else if (nbTour == 9) {
            new AlertDialog.Builder(this)
                    .setTitle("Égalité")
                    .setPositiveButton("OK", (dialog, which) -> {
                        dialog.dismiss();
                        MorpionActivity.this.recreate();
                    })
                    .setCancelable(false)
                    .setIcon(android.R.drawable.ic_dialog_info)
                    .show();
        }
    }

    private boolean checkCombinaisons(ArrayList<String> casesJoueur) {

        /*
        Combinaisons :

            - 987
            - 654
            - 321
            - 963
            - 852
            - 741
            - 951
            - 753

         */

        if (casesJoueur.contains("_9") && casesJoueur.contains("_8") && casesJoueur.contains("_7")) {
            return true;
        } else if (casesJoueur.contains("_6") && casesJoueur.contains("_5") && casesJoueur.contains("_4")) {
            return true;
        } else if (casesJoueur.contains("_3") && casesJoueur.contains("_2") && casesJoueur.contains("_1")) {
            return true;
        } else if (casesJoueur.contains("_9") && casesJoueur.contains("_6") && casesJoueur.contains("_3")) {
            return true;
        } else if (casesJoueur.contains("_8") && casesJoueur.contains("_5") && casesJoueur.contains("_2")) {
            return true;
        } else if (casesJoueur.contains("_7") && casesJoueur.contains("_4") && casesJoueur.contains("_1")) {
            return true;
        } else if (casesJoueur.contains("_9") && casesJoueur.contains("_5") && casesJoueur.contains("_1")) {
            return true;
        } else if (casesJoueur.contains("_7") && casesJoueur.contains("_5") && casesJoueur.contains("_3")) {
            return true;
        }

        return false;
    }
}