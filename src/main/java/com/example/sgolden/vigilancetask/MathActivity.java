package com.example.sgolden.vigilancetask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MathActivity extends AppCompatActivity {

    public static String EXTRA_RESULT = "com.example.sgolden.vigilancetask";
    public static String EXTRA_RESULT2 = "com.example.sgolden.vigilancetask";
    public static int iteration = 0;
    private TextView question;
    private EditText answer;
    private Button submit;
    private int mathAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);

        question = (TextView) findViewById(R.id.mathQuestion);
        answer = (EditText) findViewById(R.id.answer);
        submit = (Button) findViewById(R.id.submitButton);

        setQuestion();
        iteration++;
    }

    private void setQuestion() {
        int x, y;
        String newText;
        Random random = new Random();

        x = random.nextInt(20) + 1;
        y = random.nextInt(20) + 1;
        mathAnswer = x + y;
        newText = question.getText().toString();
        newText = newText.replaceAll("x", "" + x);
        newText = newText.replaceAll("y", "" + y);
        question.setText(newText);
    }

    public void sendData(View view) {
        Intent intent = new Intent(this, ResultsActivity.class);

        if(iteration == 0)
            intent.putExtra(EXTRA_RESULT, mathAnswer);
        else
            intent.putExtra(EXTRA_RESULT2, mathAnswer);

    }
}
