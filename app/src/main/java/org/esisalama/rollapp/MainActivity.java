package org.esisalama.rollapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView diceImage = findViewById(R.id.diceImage);
        Button rollBtn = (Button) findViewById(R.id.rollButton);
        Random rn = new Random();
        rollBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = rn.nextInt(6);
                switch (i){
                    case 1:
                        diceImage.setImageResource(R.drawable.dice_1);
                        break;
                    case 2:
                        diceImage.setImageResource(R.drawable.dice_2);
                        break;
                    case 3:
                        diceImage.setImageResource(R.drawable.dice_3);
                        break;
                    case 4:
                        diceImage.setImageResource(R.drawable.dice_4);
                        break;
                    case 5:
                        diceImage.setImageResource(R.drawable.dice_5);
                        break;
                    case 6:
                        diceImage.setImageResource(R.drawable.dice_6);
                }

            }
        });
    }
}