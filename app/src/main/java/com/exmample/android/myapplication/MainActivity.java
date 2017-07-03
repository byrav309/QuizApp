package com.exmample.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private int mCorrectAnswers = 0;
    private static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button submitButton = (Button)findViewById(R.id.submit_button);
        submitButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.submit_button){
            checkAnswer();
            Toast.makeText(this, String.format(getResources().getString(R.string.correct_answer), mCorrectAnswers),
                    Toast.LENGTH_LONG).show();
            mCorrectAnswers = 0;
        }
    }

    private void checkAnswer(){
        RadioButton radioButton;
        radioButton = (RadioButton)findViewById(R.id.radio1_hydrogen_sulphide);
        if(radioButton.isChecked()){
            mCorrectAnswers++;
        }else {
            Log.i(TAG, "selected wrong answer for question 1");
        }
        radioButton = (RadioButton)findViewById(R.id.radio2_bromine);
        if(radioButton.isChecked()){
            mCorrectAnswers++;
        }else {
            Log.i(TAG, "selected wrong answer for question 2");
        }
        radioButton = (RadioButton)findViewById(R.id.radio3_megnesium);
        if(radioButton.isChecked()){
            mCorrectAnswers++;
        }else {
            Log.i(TAG, "selected wrong answer for question 3");
        }
        radioButton = (RadioButton)findViewById(R.id.radio4_graphite);
        if(radioButton.isChecked()){
            mCorrectAnswers++;
        }else {
            Log.i(TAG, "selected wrong answer for question 4");
        }
        radioButton = (RadioButton)findViewById(R.id.radio5_mercury);
        if(radioButton.isChecked()){
            mCorrectAnswers++;
        }else {
            Log.i(TAG, "selected wrong answer for question 5");
        }
        EditText editText = (EditText)findViewById(R.id.answer6_edit_text);
        if(getResources().getString(R.string.tiger).equalsIgnoreCase(editText.getText().toString())){
            mCorrectAnswers++;
        }else {
            Log.i(TAG, "wrong answer for question 6");
        }
        CheckBox checkBoxDelhi = (CheckBox)findViewById(R.id.answer7_delhi);
        CheckBox checkBoxMumbai = (CheckBox)findViewById(R.id.answer7_mumbai);
        CheckBox checkBoxBangalore = (CheckBox)findViewById(R.id.answer7_banglore);
        if(checkBoxDelhi.isChecked() && checkBoxBangalore.isChecked() && !checkBoxMumbai.isChecked()){
            mCorrectAnswers++;
        }else {
            Log.i(TAG, "checked wrong answer for question 7");
        }
    }

}
