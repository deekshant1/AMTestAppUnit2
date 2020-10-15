package com.example.amtestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    private String[] names={"Friend1", "Friend2", "Friend3", "Friend4", "Friend5"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        int randomIndex = new Random().nextInt(names.length);
        String randomName = names[randomIndex];
        TextView textView=findViewById(R.id.name1);
        textView.setText(randomName);
    }
}