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

            detecterVainqueur();

            if (nbTour % 2 == 0) {
                casesJoueurO.add(getResources().getResourceName(view.getId()));
                joueur = "X";
            } else {
                casesJoueurX.add(getResources().getResourceName(view.getId()));
                joueur = "O";
            }
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
                    .setPositiveButton("OK", (dialog, which) -> dialog.dismiss())
                    .setIcon(android.R.drawable.ic_dialog_info)
                    .show();
        } else if (checkCombinaisons(casesJoueurO)) {
            new AlertDialog.Builder(this)
                    .setTitle("Joueur 2 gagne")
                    .setPositiveButton("OK", (dialog, which) -> dialog.dismiss())
                    .setIcon(android.R.drawable.ic_dialog_info)
                    .show();
        } else if (nbTour == 9) {
            new AlertDialog.Builder(this)
                    .setTitle("Égalité")
                    .setPositiveButton("OK", (dialog, which) -> dialog.dismiss())
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

        if(casesJoueur.contains("9") && casesJoueur.contains("8") && casesJoueur.contains("7")){
            return true;
        } else if(casesJoueur.contains("6") && casesJoueur.contains("5") && casesJoueur.contains("4")){
            return true;
        } else if(casesJoueur.contains("3") && casesJoueur.contains("2") && casesJoueur.contains("1")){
            return true;
        } else if(casesJoueur.contains("9") && casesJoueur.contains("6") && casesJoueur.contains("3")){
            return true;
        } else if(casesJoueur.contains("8") && casesJoueur.contains("5") && casesJoueur.contains("2")){
            return true;
        } else if(casesJoueur.contains("7") && casesJoueur.contains("4") && casesJoueur.contains("1")){
            return true;
        } else if(casesJoueur.contains("9") && casesJoueur.contains("5") && casesJoueur.contains("1")){
            return true;
        } else if(casesJoueur.contains("7") && casesJoueur.contains("5") && casesJoueur.contains("3")){
            return true;
        }

        return false;
    }
}