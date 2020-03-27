package com.leaoartes.pedrapapeltesoura;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectedRock(View view){
        this.selectedOption(1);
    }

    public void selectedPaper(View view){
        this.selectedOption(2);
    }

    public void selectedScissors(View view){
        this.selectedOption(3);
    }

    public void selectedOption(int selectedOption){

        int computerChoice = new Random().nextInt(3) + 1;

        if(computerChoice == 1) {
            ImageView imageViewComputer = findViewById(R.id.imageViewChoice);
            imageViewComputer.setImageResource(R.drawable.pedra);

        }else if (computerChoice == 2){
            ImageView imageViewComputer = findViewById(R.id.imageViewChoice);
            imageViewComputer.setImageResource(R.drawable.papel);

        }else{
            ImageView imageViewComputer = findViewById(R.id.imageViewChoice);
            imageViewComputer.setImageResource(R.drawable.tesoura);

        }

        if (selectedOption == computerChoice){

            TextView text = findViewById(R.id.textViewOurOption);
            text.setText("Empate! :/");

        }else if (selectedOption == 2 && computerChoice == 1 || selectedOption == 3 && computerChoice == 2 || selectedOption == 1 && computerChoice == 3){

            TextView text = findViewById(R.id.textViewOurOption);
            text.setText("Você ganhou! :)");

        }else {
            TextView text = findViewById(R.id.textViewOurOption);
            text.setText("Você perdeu! :(");

        }

    }
}
