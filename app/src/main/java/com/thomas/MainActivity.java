package com.thomas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openCalcul(View view) {
        startActivity(new Intent(getApplicationContext(), CalculetteActivity.class));
    }

    public void openMorpion(View view) {
        startActivity(new Intent(getApplicationContext(), MorpionActivity.class));
    }

    public void openPuissance4(View view) {
        startActivity(new Intent(getApplicationContext(), Puissance4Activity.class));
    }
}
