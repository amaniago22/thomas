package com.thomas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int nombre_pair = 0;
    int nombre_impair = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        relancerDes(null);
        calculPairImpair(null);
    }

    public void calculPairImpair(View view) {

        for (int i = 0; i < 60000; i++) {

            int somme = calculSommeDe2Des();
            int moduloSomme = somme % 2;

            if (moduloSomme == 1) {
                nombre_impair++;
            } else {
                nombre_pair++;
            }
        }

        afficherResultats();
    }

    private void afficherResultats() {
        ((TextView) findViewById(R.id.impair)).setText("Compteur impair = " + nombre_impair);
        ((TextView) findViewById(R.id.pair)).setText( "Compteur pair = " + nombre_pair);
    }

    private int calculSommeDe2Des() {
        int de_1 = (int) (Math.random() * (12 - 1)) + 1;
        int de_2 = (int) (Math.random() * (12 - 1)) + 1;
        int somme = de_1 + de_2;

        return somme;
    }

//    public void relancerDes(View view) {
//        int compteur6 = 0;
//        int compteur7 = 0;
//        int compteur8 = 0;
//
//        int de_1 = 1;
//        int de_2 = 1;
//
//        for (int i = 0; i < 60000; i++) {
////            de_1 = (int) (Math.random()*(6-1)) + 1;
////            de_2 = (int) (Math.random()*(6-1)) + 1;
//
//            int somme = calculSommeDe2Des();
//
//            switch (somme) {
//                case 6 :
//                    compteur6++;
//                    break;
//                case 7:
//                    compteur7++;
//                    break;
//                case 8:
//                    compteur8++;
//                    break;
//            }
//        }
//
//        afficherResultats("Compteur de 6", compteur6, "Compteur de 7", compteur7);
//    }
}