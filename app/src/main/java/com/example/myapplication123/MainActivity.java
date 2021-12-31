package com.example.myapplication123;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ButtonClicked(View v)
    {
        TextView dice_text = findViewById(R.id.text);
        ImageView dice_img = findViewById(R.id.dice_image);

        Random rnd = new Random();
        int random = rnd.nextInt(6)+1;

                switch (random)
                {
                    case 1:
                        dice_text.setText("Zar 1 geldi");
                        dice_img.setImageResource(R.drawable.alea_1);
                        break;
                    case 2:
                        dice_text.setText("Zar 2 geldi");
                        dice_img.setImageResource(R.drawable.alea_2);
                        break;
                    case 3:
                        dice_text.setText("Zar 3 geldi");
                        dice_img.setImageResource(R.drawable.alea_3);
                        break;
                    case 4:
                        dice_text.setText("Zar 4 geldi");
                        dice_img.setImageResource(R.drawable.alea_4);
                        break;
                    case 5:
                        dice_text.setText("Zar 5 geldi");
                        dice_img.setImageResource(R.drawable.alea_5);
                        break;
                    case 6:
                        dice_text.setText("Zar 6 geldi");
                        dice_img.setImageResource(R.drawable.alea_6);
                        break;
                }
    }
}