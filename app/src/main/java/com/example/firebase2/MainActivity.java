package com.example.firebase2;



import android.annotation.SuppressLint;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) final Button tictactoe = findViewById(R.id.tictactoe);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) final Button numguessing = findViewById(R.id.numguessing);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) final Button reflexes = findViewById(R.id.reflexes);

        tictactoe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Tic_tac_toe.class);
                startActivity(intent);
            }
        });
        numguessing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Number_guessing.class);
                startActivity(intent);
            }
        });
        reflexes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Reflex.class);
                startActivity(intent);
            }
        });
    }
}