package com.example.sgolden.vigilancetask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class ResultsActivity extends AppCompatActivity {

    ProgressBar bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        bar = (ProgressBar) findViewById(R.id.progressBar);
    }
}
