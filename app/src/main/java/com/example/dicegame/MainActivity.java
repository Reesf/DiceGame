package com.example.dicegame;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private Random rng = new Random();
    private Text Guess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();

            }
        });


    }
    private void rollDice() {
        int randomNumber = rng.nextInt(6) + 1;

        switch (randomNumber) {
            case 1:
                imageViewDice.setImageResource(R.drawable.dice1);
                int dice10 = 1;
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.dice2);
                int dice2 = 2;
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.dice3);
                int dice3 = 3;
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.dice4);
                int dice4 = 4;
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.dice5);
                int dice5 = 5;
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.dice6);
                int dice6 = 6;
                break;


        }
    }

}






