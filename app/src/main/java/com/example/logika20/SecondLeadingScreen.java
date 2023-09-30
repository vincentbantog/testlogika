package com.example.logika20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SecondLeadingScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_leading_screen);

        showSecondLoadingScreen();
    }
    public void showSecondLoadingScreen(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(SecondLeadingScreen.this, MainMenu.class);
                startActivity(mainIntent);
                finish();
            }
        }, 3000);
    }
}