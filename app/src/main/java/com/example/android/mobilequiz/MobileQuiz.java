package com.example.android.mobilequiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MobileQuiz extends AppCompatActivity {

    double score = 0;
    String nameOfPerson;
    RadioButton radioQuestionTwo;
    EditText stringQuestionThree;
    RadioButton radioQuestionFour;
    CheckBox oneQuestionFive;
    CheckBox twoQuestionFive;
    CheckBox threeQuestionFive;
    CheckBox fourQuestionFive;
    CheckBox fiveQuestionFive;
    CheckBox sixQuestionFive;
    CheckBox sevenQuestionFive;
    CheckBox eightQuestionFive;
    CheckBox nineQuestionFive;
    CheckBox tenQuestionFive;
    EditText stringQuestionSix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_quiz);

        EditText stringQuestionOne = (EditText) findViewById(R.id.question_one_field);
        nameOfPerson = stringQuestionOne.getText().toString();

        radioQuestionTwo = (RadioButton) findViewById(R.id.radio_megapixel);

        stringQuestionThree = (EditText) findViewById(R.id.question_three_field);

        radioQuestionFour = (RadioButton) findViewById(R.id.radio_fhd);
        oneQuestionFive = (CheckBox) findViewById(R.id.c_dual_sim);
        twoQuestionFive = (CheckBox) findViewById(R.id.c_firmware);
        threeQuestionFive = (CheckBox) findViewById(R.id.c_tethering);
        fourQuestionFive = (CheckBox) findViewById(R.id.c_microsd);
        fiveQuestionFive = (CheckBox) findViewById(R.id.c_ram);
        sixQuestionFive = (CheckBox) findViewById(R.id.c_bezel);
        sevenQuestionFive = (CheckBox) findViewById(R.id.c_url);
        eightQuestionFive = (CheckBox) findViewById(R.id.c_os);
        nineQuestionFive = (CheckBox) findViewById(R.id.c_mbps);

        stringQuestionSix = (EditText) findViewById(R.id.question_six_field);


    }

    @Override
    public void onBackPressed() {}

    /**
     * This method is called when the Submit button is tapped.
     */
    public void submitAnswers (View view) {
        calculateScore();
        createToast();
        score = 0;
    }

    private void calculateScore() {
        if (!(TextUtils.isEmpty(nameOfPerson))){
            score++;
        } else {
            createToastNameError();
            return;
        }
        if (radioQuestionTwo.isChecked()) {
            score++;
        }
        if (stringQuestionThree.getText().toString().equals("Samsung") || stringQuestionThree.getText().toString().equals("samsung")) {
            score++;
        }
        if (radioQuestionFour.isChecked()) {
            score++;
        }
        if (oneQuestionFive.isChecked()) {
            score = score + 1/2;
        }
        if (twoQuestionFive.isChecked()) {
            score = score + 1/2;
        }
        if (threeQuestionFive.isChecked()) {
            score = score + 1/2;
        }
        if (fourQuestionFive.isChecked()) {
            score = score + 1/2;
        }
        if (fiveQuestionFive.isChecked()) {
            score = score + 1/2;
        }
        if (sixQuestionFive.isChecked()) {
            score = score + 1/2;
        }
        if (sevenQuestionFive.isChecked()) {
            score = score + 1/2;
        }
        if (eightQuestionFive.isChecked()) {
            score = score + 1/2;
        }
        if (nineQuestionFive.isChecked()) {
            score = score + 1/2;
        }
        if (tenQuestionFive.isChecked()) {
            score = score + 1/2;
        }
        if (stringQuestionSix.getText().toString().equals("Android") || stringQuestionThree.getText().toString().equals("android")) {
            score++;
        }

    }


    private void createToast() {
        Toast.makeText(this, "Congratulations " + nameOfPerson + "! You managed to score " + score + "out of 10!", Toast.LENGTH_LONG).show();
        }

    private void createToastNameError() {
        Toast.makeText(this, "Not gonna give you the score if you don't give me the name...", Toast.LENGTH_SHORT).show();
        }

    }

