package com.example.amtestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    private String[] names={"Friend1", "Friend2", "Friend3", "Friend4", "Friend5"};
    int[] images = new int[] {R.mipmap.image0, R.mipmap.image1, R.mipmap.image2, R.mipmap.image3, R.mipmap.image4};
    String[] phrases = {"How you doing", "This is cool", "Just Chill", "Keep Calm", "Be Strong"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        int randomIndex = new Random().nextInt(names.length);
        String randomName = names[randomIndex];
        TextView textView=findViewById(R.id.name1);
        textView.setText(randomName);

        //int imageId = (int)(Math.random() * images.length);
        int randomImage = images[randomIndex];
        ImageView mImageView = (ImageView)findViewById(R.id.myImageView);
        mImageView.setBackgroundResource(randomImage);

        String favPhrase = phrases[randomIndex];
        TextView textView1 = findViewById(R.id.phrase);
        textView1.setText(favPhrase);
    }
}