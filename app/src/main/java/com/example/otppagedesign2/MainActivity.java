package com.example.otppagedesign2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.goodiebag.pinview.Pinview;

public class MainActivity extends AppCompatActivity {
Pinview pinview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intFunction();
        intLisener();
    }

    private void intLisener() {
        pinview.setPinViewEventListener(new Pinview.PinViewEventListener() {
            @Override
            public void onDataEntered(Pinview pinview, boolean fromUser) {
               if (pinview !=null) {
                   Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                   startActivity(intent);
               }
            }
        });

    }

    private void intFunction() {
        pinview = findViewById(R.id.pinview);

    }
}