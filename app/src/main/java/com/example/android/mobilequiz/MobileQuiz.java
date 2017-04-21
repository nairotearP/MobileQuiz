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
    int checkCounter = 0;
    String nameOfPerson;
    EditText stringQuestionOne;
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
        if (stringQuestionThree.getText().toString().toLowerCase().equals("samsung")) {
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
        if (stringQuestionSix.getText().toString().toLowerCase().equals("streaming")) {
            score++;
        }
        stringQuestionSeven = (EditText) findViewById(R.id.question_seven_field);
        if (stringQuestionSeven.getText().toString().toLowerCase().equals("android")) {
            score++;
        }
    }

    /**
     * These methods check how many checkboxes are checked, limits this number to 4 and unchecks the 5th checked box.
     * @param view all checkboxes
     */
    public void checkboxOneClick(View view) {
        oneQuestionFive = (CheckBox) findViewById(R.id.c_dual_sim);
        if (oneQuestionFive.isChecked()) {
            checkCounter++;
            if (checkCounter > 4) {
                oneQuestionFive.setChecked(false);
                checkCounter--;
                createToastCheckboxLimit();
            }
        } else {
            checkCounter--;
        }
    }

    public void checkboxTwoClick(View view) {
        twoQuestionFive = (CheckBox) findViewById(R.id.c_hdd);
        if (twoQuestionFive.isChecked()) {
            checkCounter++;
            if (checkCounter > 4) {
                twoQuestionFive.setChecked(false);
                checkCounter--;
                createToastCheckboxLimit();
            }
        } else {
            checkCounter--;
        }
    }

    public void checkboxThreeClick(View view) {
        threeQuestionFive = (CheckBox) findViewById(R.id.c_bezel);
        if (threeQuestionFive.isChecked()) {
            checkCounter++;
            if (checkCounter > 4) {
                threeQuestionFive.setChecked(false);
                checkCounter--;
                createToastCheckboxLimit();
            }
        } else {
            checkCounter--;
        }
    }

    public void checkboxFourClick(View view) {
        fourQuestionFive = (CheckBox) findViewById(R.id.c_terminal);
        if (fourQuestionFive.isChecked()) {
            checkCounter++;
            if (checkCounter > 4) {
                fourQuestionFive.setChecked(false);
                checkCounter--;
                createToastCheckboxLimit();
            }
        } else {
            checkCounter--;
        }
    }

    public void checkboxFiveClick(View view) {
        fiveQuestionFive = (CheckBox) findViewById(R.id.c_routing);
        if (fiveQuestionFive.isChecked()) {
            checkCounter++;
            if (checkCounter > 4) {
                fiveQuestionFive.setChecked(false);
                checkCounter--;
                createToastCheckboxLimit();
            }
        } else {
            checkCounter--;
        }
    }

    public void checkboxSixClick(View view) {
        sixQuestionFive = (CheckBox) findViewById(R.id.c_gorilla);
        if (sixQuestionFive.isChecked()) {
            checkCounter++;
            if (checkCounter > 4) {
                sixQuestionFive.setChecked(false);
                checkCounter--;
                createToastCheckboxLimit();
            }
        } else {
            checkCounter--;
        }
    }

    public void checkboxSevenClick(View view) {
        sevenQuestionFive = (CheckBox) findViewById(R.id.c_microsd);
        if (sevenQuestionFive.isChecked()) {
            checkCounter++;
            if (checkCounter > 4) {
                sevenQuestionFive.setChecked(false);
                checkCounter--;
                createToastCheckboxLimit();
            }
        } else {
            checkCounter--;
        }
    }

    public void checkboxEightClick(View view) {
        eightQuestionFive = (CheckBox) findViewById(R.id.c_ethernet);
        if (eightQuestionFive.isChecked()) {
            checkCounter++;
            if (checkCounter > 4) {
                eightQuestionFive.setChecked(false);
                checkCounter--;
                createToastCheckboxLimit();
            }
        } else {
            checkCounter--;
        }
    }

    /**
     * This method creates a Toast when the score is 7 and above.
     */
    private void createToast() {
        Toast toast = Toast.makeText(this, "Congratulations " + nameOfPerson + "! You managed to score " + score + " out of 10!", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    /**
     * This method creates a Toast when the score is 6 and below.
     */
    private void createToaster() {
        Toast toaster = Toast.makeText(this, "I was hoping you'd do better " + nameOfPerson + ". You managed to score " + score + " out of 10!", Toast.LENGTH_LONG);
        toaster.setGravity(Gravity.CENTER, 0, 0);
        toaster.show();
    }

    /**
     * This method creates a Toast when more than 4 checkboxes are checked for Question 5.
     */
    private void createToastCheckboxLimit() {
        Toast checkboxLimit = Toast.makeText(this, "Only 4 answers are correct!", Toast.LENGTH_SHORT);
        checkboxLimit.setGravity(Gravity.CENTER, 0, 0);
        checkboxLimit.show();
    }
}

