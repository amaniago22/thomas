package com.thomas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        relancerDes(null);
        calculPairImpair(null);
    }

    public void calculPairImpair(View view) {
        int de_1 = (int) (Math.random() * (6 - 1)) + 1;
        int de_2 = (int) (Math.random() * (6 - 1)) + 1;

        int somme = de_1 + de_2;

        findViewById(R.id.compteur_7).setVisibility(View.GONE);
        findViewById(R.id.compteur_8).setVisibility(View.GONE);

        if(somme % 2 == 1) {
            ((TextView) findViewById(R.id.compteur_6)).setText("Nombre impair (" + somme + ")");
        } else {
            ((TextView) findViewById(R.id.compteur_6)).setText("Nombre pair (" + somme + ")");
        }

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
//            de_1 = (int) (Math.random()*(6-1)) + 1;
//            de_2 = (int) (Math.random()*(6-1)) + 1;
//
//            switch (de_1 + de_2) {
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
//        ((TextView) findViewById(R.id.compteur_6)).setText("Nombre de 6 : " + compteur6);
//        ((TextView) findViewById(R.id.compteur_7)).setText("Nombre de 7 : " + compteur7);
//        ((TextView) findViewById(R.id.compteur_8)).setText("Nombre de 8 : " + compteur8);
//    }
}