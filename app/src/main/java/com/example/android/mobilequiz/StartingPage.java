package com.example.android.mobilequiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class StartingPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.starting_page);
    }

    public void startQuiz(View view) {
        Intent intent = new Intent(this, MobileQuiz.class);
        startActivity(intent);
    }
}

