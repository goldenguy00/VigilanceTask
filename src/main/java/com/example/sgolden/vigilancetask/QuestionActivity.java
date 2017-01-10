package com.example.sgolden.vigilancetask;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class QuestionActivity extends AppCompatActivity {

    private TextView question, question2, question3;
    private EditText getAnswer, getAnswer2, getAnswer3;
    private RadioButton[] radioButtons;
    private int hits, misses, falseStarts;
    private double[] reactionTimeArray;
    private double avgReactionTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        Intent intent = getIntent();
        reactionTimeArray = intent.getDoubleArrayExtra(MainActivity.EXTRA_REACTION_ARRAY);
        hits = intent.getIntExtra(MainActivity.EXTRA_HITS, 0);
        misses = intent.getIntExtra(MainActivity.EXTRA_MISSES, 0);
        falseStarts = intent.getIntExtra(MainActivity.EXTRA_FALSE_STARTS, 0);

        question = (TextView) findViewById(R.id.question);
        question2 = (TextView) findViewById(R.id.question2);
        question3 = (TextView) findViewById(R.id.question3);
        getAnswer = (EditText) findViewById(R.id.answerInput);
        getAnswer2 = (EditText) findViewById(R.id.answerInput2);
        getAnswer3 = (EditText) findViewById(R.id.answerInput3);
        radioButtons[0] = (RadioButton) findViewById(R.id.radioButton1);
        radioButtons[1] = (RadioButton) findViewById(R.id.radioButton2);
        radioButtons[2] = (RadioButton) findViewById(R.id.radioButton3);
        radioButtons[3] = (RadioButton) findViewById(R.id.radioButton4);
        radioButtons[4] = (RadioButton) findViewById(R.id.radioButton5);
        radioButtons[5] = (RadioButton) findViewById(R.id.radioButton6);
        radioButtons[6] = (RadioButton) findViewById(R.id.radioButton7);
    }
}