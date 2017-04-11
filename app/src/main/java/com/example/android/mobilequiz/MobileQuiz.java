package com.example.android.mobilequiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MobileQuiz extends AppCompatActivity {

    int score = 0;
    String nameOfPerson;
    EditText stringQuestionOne;
    RadioButton radioQuestionTwo;
    EditText stringQuestionThree;
    RadioButton radioQuestionFour;
    CheckBox oneQuestionFive;
    CheckBox threeQuestionFive;
    CheckBox sixQuestionFive;
    CheckBox sevenQuestionFive;
    EditText stringQuestionSix;
    EditText stringQuestionSeven;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_quiz);
    }

    /**
     * This override removes the functionality of the Back button in the main activity.
     */
    @Override
    public void onBackPressed() {
    }

    /**
     * This method is called when the Submit button is tapped.
     */
    public void submitAnswers(View view) {
        calculateScore();
        if (score > 6) {
            createToast();
        } else {
            createToaster();
        }
        score = 0;
    }

    /**
     * This method verifies the answers and increments the score accordingly.
     */
    private void calculateScore() {

        stringQuestionOne = (EditText) findViewById(R.id.question_one_field);
        nameOfPerson = stringQuestionOne.getText().toString();
        if (!(TextUtils.isEmpty(nameOfPerson))) {
            score++;
        }

        radioQuestionTwo = (RadioButton) findViewById(R.id.radio_megapixel);
        if (radioQuestionTwo.isChecked()) {
            score++;
        }
        stringQuestionThree = (EditText) findViewById(R.id.question_three_field);
        if (stringQuestionThree.getText().toString().equals("Samsung")) {
            score++;
        }
        radioQuestionFour = (RadioButton) findViewById(R.id.radio_fhd);
        if (radioQuestionFour.isChecked()) {
            score++;
        }
        oneQuestionFive = (CheckBox) findViewById(R.id.c_dual_sim);
        if (oneQuestionFive.isChecked()) {
            score++;
        }
        threeQuestionFive = (CheckBox) findViewById(R.id.c_bezel);
        if (threeQuestionFive.isChecked()) {
            score++;
        }
        sixQuestionFive = (CheckBox) findViewById(R.id.c_gorilla);
        if (sixQuestionFive.isChecked()) {
            score++;
        }
        sevenQuestionFive = (CheckBox) findViewById(R.id.c_microsd);
        if (sevenQuestionFive.isChecked()) {
            score++;
        }
        stringQuestionSix = (EditText) findViewById(R.id.question_six_field);
        if (stringQuestionSix.getText().toString().equals("Streaming")) {
            score++;
        }
        stringQuestionSeven = (EditText) findViewById(R.id.question_seven_field);
        if (stringQuestionSeven.getText().toString().equals("Android")) {
            score++;
        }
    }

    private void createToast() {
        Toast toast = Toast.makeText(this, "Congratulations " + nameOfPerson + "! You managed to score " + score + " out of 10!", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    private void createToaster() {
        Toast toaster = Toast.makeText(this, "I was hoping you'd do better " + nameOfPerson + ". You managed to score " + score + " out of 10!", Toast.LENGTH_LONG);
        toaster.setGravity(Gravity.CENTER, 0, 0);
        toaster.show();
    }
}

