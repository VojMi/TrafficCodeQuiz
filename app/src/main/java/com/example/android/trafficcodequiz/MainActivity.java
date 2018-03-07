package com.example.android.trafficcodequiz;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    /**
     * Score is set to 0 points.
     */
    private int score = 0;
    private RadioGroup question1;
    private EditText question2;
    private CheckBox chb3Tyre;
    private CheckBox chb3AidKit;
    private CheckBox chb3Bulbs;
    private CheckBox chb3Fuel;
    private CheckBox chb3Manual;
    private CheckBox chb3Extinguisher;
    private RadioGroup question4;
    private RadioGroup question5;
    private EditText question6;
    private RadioGroup question7;
    private RadioGroup question8;
    private CheckBox chb9Wheels;
    private CheckBox chb9Brakes;
    private CheckBox chb9Fuel;
    private CheckBox chb9Colour;
    private CheckBox chb9Sun;
    private CheckBox chb9Wind;
    private RadioGroup question10;

    private boolean isChoiceRight;
    private boolean isChoiceQ4Speed;
    private boolean isChoiceRightS;
    private boolean isChoiceQ7Speed;
    private boolean isChoicePriorityR;
    private boolean isChoiceAllPass;

    private RadioGroup.OnCheckedChangeListener question1Right;
    private RadioGroup.OnCheckedChangeListener question4Q4Speed;
    private RadioGroup.OnCheckedChangeListener question5RightS;
    private RadioGroup.OnCheckedChangeListener question7Q7Speed;
    private RadioGroup.OnCheckedChangeListener question8PriorityR;
    private RadioGroup.OnCheckedChangeListener question10AllPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /**
         * Initialization of RadioGroups.
         */
        question1 = (RadioGroup) findViewById(R.id.questionNo1);
        question4 = (RadioGroup) findViewById(R.id.questionNo4);
        question5 = (RadioGroup) findViewById(R.id.questionNo5);
        question7 = (RadioGroup) findViewById(R.id.questionNo7);
        question8 = (RadioGroup) findViewById(R.id.questionNo8);
        question10 = (RadioGroup) findViewById(R.id.questionNo10);

        /**
         * Initialization of EditTexts.
         */
        question2 = (EditText) findViewById(R.id.questionNo2);
        question6 = (EditText) findViewById(R.id.questionNo6);

        /**
         * Initialization of CheckBoxes for question No.3.
         */
        chb3Tyre = (CheckBox) findViewById(R.id.chb_q3_tyre);
        chb3AidKit = (CheckBox) findViewById(R.id.chb_q3_aidkit);
        chb3Bulbs = (CheckBox) findViewById(R.id.chb_q3_bulbs);
        chb3Fuel = (CheckBox) findViewById(R.id.chb_q3_fuel);
        chb3Manual = (CheckBox) findViewById(R.id.chb_q3_manual);
        chb3Extinguisher = (CheckBox) findViewById(R.id.chb_q3_extinguisher);

        /**
         * Initialization of CheckBoxes for question No.9.
         */
        chb9Brakes = (CheckBox) findViewById(R.id.chb9_brakes);
        chb9Wheels = (CheckBox) findViewById(R.id.chb9_wheels);
        chb9Fuel = (CheckBox) findViewById(R.id.chb9_famount);
        chb9Colour = (CheckBox) findViewById(R.id.chb9_color);
        chb9Sun = (CheckBox) findViewById(R.id.chb9_sun);
        chb9Wind = (CheckBox) findViewById(R.id.chb9_wind);

        setListeners();
    }

    public void setListeners() {
        /**
         * Answer No.1 result processing via conditional statement.
         */
        question1Right = new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int radioButtonId) {
                switch (radioGroup.getId()) {
                    case R.id.questionNo1:
                        /**
                         * Correct scenario.
                         */ /**
                     * Incorrect scenario.
                     */isChoiceRight = R.id.questionNo1_right == radioButtonId;
                        break;
                }
            }
        };
        /**
         * Answer No.4 result processing via conditional statement.
         */
        question4Q4Speed = new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int radioButtonId) {
                switch (radioGroup.getId()) {
                    case R.id.questionNo4:
                        /**
                         * Correct scenario.
                         */ /**
                     * Incorrect scenario.
                     */isChoiceQ4Speed = R.id.questionNo4_90 == radioButtonId;
                        break;
                }
            }
        };
        /**
         * Answer No.5 result processing via conditional statement.
         */
        question5RightS = new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int radioButtonId) {
                switch (radioGroup.getId()) {
                    case R.id.questionNo5:

                        /**
                         * Correct scenario.
                         */ /**
                     * Incorrect scenario.
                     */isChoiceRightS = R.id.questionNo5_rights == radioButtonId;
                        break;
                }
            }
        };
        /**
         * Answer No.7 result processing via conditional statement.
         */
        question7Q7Speed = new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int radioButtonId) {
                switch (radioGroup.getId()) {
                    case R.id.questionNo7:
                        /**
                         * Correct scenario.
                         */ /**
                     * Incorrect scenario.
                     */isChoiceQ7Speed = R.id.questionNo7_q7speed1 == radioButtonId;
                        break;
                }
            }
        };
        /**
         * Answer No.8 result processing via conditional statement.
         */
        question8PriorityR = new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int radioButtonId) {
                switch (radioGroup.getId()) {
                    case R.id.questionNo8:
                        /**
                         * Correct scenario.
                         */ /**
                     * Incorrect scenario.
                     */isChoicePriorityR = R.id.questionNo8_priorityroad == radioButtonId;
                        break;
                }
            }
        };
        /**
         * Answer No.10 result processing via conditional statement.
         */
        question10AllPass = new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int radioButtonId) {
                switch (radioGroup.getId()) {
                    case R.id.questionNo10:
                        /**
                         * Correct scenario.
                         */ /**
                     * Incorrect scenario.
                     */isChoiceAllPass = R.id.questionNo10_allpas == radioButtonId;
                        break;
                }
            }
        };
        question1.setOnCheckedChangeListener(question1Right);
        question4.setOnCheckedChangeListener(question4Q4Speed);
        question5.setOnCheckedChangeListener(question5RightS);
        question7.setOnCheckedChangeListener(question7Q7Speed);
        question8.setOnCheckedChangeListener(question8PriorityR);
        question10.setOnCheckedChangeListener(question10AllPass);
    }

    /**
     * This method is called when the button SUBMIT ANSWERS is pressed.
     */
    @SuppressLint("StringFormatInvalid")
    public void submitQuizAnswers(View view) {

        EditText nameInput = (EditText) findViewById(R.id.username);
        String userName = nameInput.getText().toString();

        /**
         * Calculation of points for all radio groups.
         */
        if (isChoiceRight) {
            score = +1;
        }
        if (isChoiceQ4Speed) {
            score += 1;
        }
        if (isChoiceRightS) {
            score += 1;
        }
        if (isChoiceQ7Speed) {
            score += 1;
        }
        if (isChoicePriorityR) {
            score += 1;
        }
        if (isChoiceAllPass) {
            score += 1;
        }
        /**
         * Check of question No.2 EditView.
         */
        String answerForQuestion2 = question2.getText().toString();
        if (answerForQuestion2.equals("50")) {
            score += 1;
        }
        /**
         * Check of question No.6 EditView.
         */
        String answerForQuestion6 = question6.getText().toString();
        if (answerForQuestion6.equals("15000")) {
            score += 1;
        }
        /**
         * Check of question No.3 CheckBox.
         */
        if (chb3Tyre.isChecked() && chb3AidKit.isChecked() && chb3Bulbs.isChecked()) {
            score += 1;
            if (chb3Fuel.isChecked() || chb3Manual.isChecked() || chb3Extinguisher.isChecked()) {
                score -= 1;
            }
        }

        /**
         * Check of question No.9 CheckBox.
         */
        if (chb9Brakes.isChecked() && chb9Wheels.isChecked() && chb9Fuel.isChecked()) {
            score += 1;
            if (chb9Colour.isChecked() || chb9Sun.isChecked() || chb9Wind.isChecked()) {
                score -= 1;
            }
        }

        /**
         * After submitting the result, generate toast messages.
         */

        if (score < 5) {
            Toast.makeText(this, getString(R.string.toast1, userName, score), Toast.LENGTH_SHORT).show();
            score = 0;
            return;
        }
        if (5 < score && score <= 7) {
            Toast.makeText(this, getString(R.string.toast2, userName, score), Toast.LENGTH_SHORT).show();
            score = 0;
            return;
        }
        if (7 < score && score <= 9) {
            Toast.makeText(this, getString(R.string.toast3, userName, score), Toast.LENGTH_SHORT).show();
            score = 0;
            return;
        }
        if (9 < score) {
            Toast.makeText(this, getString(R.string.toast4, userName, score), Toast.LENGTH_SHORT).show();
            score = 0;
            return;
        }
    }

    /**
     * Score reset
     */
    public void reset(View View) {
        score = 0;
        /**
         * CheckBoxes reset
         */
        chb3Bulbs.setChecked(false);
        chb3AidKit.setChecked(false);
        chb3Tyre.setChecked(false);
        chb3Fuel.setChecked(false);
        chb3Manual.setChecked(false);
        chb3Extinguisher.setChecked(false);
        chb9Fuel.setChecked(false);
        chb9Wheels.setChecked(false);
        chb9Brakes.setChecked(false);
        chb9Colour.setChecked(false);
        chb9Sun.setChecked(false);
        chb9Wind.setChecked(false);
        /**
         * Radio buttons reset
         */
        question1.clearCheck();
        question4.clearCheck();
        question5.clearCheck();
        question7.clearCheck();
        question8.clearCheck();
        question10.clearCheck();
        /**
         * EditTexts reset
         */
        question2.setText(null);
        question6.setText(null);
    }

}