package com.almanbet11.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView leftImage;
    ImageView rightImage;
    Random random;

    Integer[] imageOfDices = {
        R.drawable.ic_onepoint,
        R.drawable.ic_twopoint,
        R.drawable.ic_threepoint,
        R.drawable.ic_fourpoint,
        R.drawable.ic_fivepoint,
        R.drawable.ic_sixpoint};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        leftImage = (ImageView) findViewById(R.id.imageLeft);
        rightImage = (ImageView) findViewById(R.id.imageRight);
        random = new Random();
    }

    public void roll(View view){

        leftImage.setImageResource(imageOfDices[random.nextInt(imageOfDices.length)]);
        rightImage.setImageResource(imageOfDices[random.nextInt(imageOfDices.length)]);
    }

}
