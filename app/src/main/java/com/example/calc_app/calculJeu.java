package com.example.calc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class calculJeu extends AppCompatActivity {

    private TextView operateur;

    private TextView valeur1;

    private TextView valeur2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcul_jeu);
        operateur = findViewById(R.id.operateur);
        operateur.setText("");
        valeur1 = findViewById(R.id.valeur1);
        valeur1.setText("");
        valeur2 = findViewById(R.id.valeur2);
        valeur2.setText("");
    }

    private void faisLeCalcul(String calcul){
        Random random = new Random();
        int cal;
        cal = random.nextInt(4);
        Random random1 = new Random();
        valeur1.setText(""+random1.nextInt(101));
        Random random2 = new Random();
        valeur2.setText(""+random2.nextInt(100)+1);
        switch (cal){
            case 0:
                operateur.setText("-");
            case 1:
                operateur.setText("+");
            case 2:
                operateur.setText("/");
            case 3:
                operateur.setText("*");
        }
    }
}