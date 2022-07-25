package com.example.andoid_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MainActivity extends AppCompatActivity {

    TextView makingTV;
    TextView resultTV;

    String making = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initTextViews();
    }

    private void initTextViews() {
        makingTV = findViewById(R.id.MakingTextView);
        resultTV = findViewById(R.id.ResultTextView);
    }

    private void setMaking(String givenValue) {
        making = making + givenValue;
        makingTV.setText(making);
    }

    public void equalsOnClick(View view) {
        Double result = null;
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");

        try {
            result = (double)engine.eval(making);
        }
        catch (ScriptException e) {
            Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
        }

        if(result != null) {
            resultTV.setText(String.valueOf(result.doubleValue()));
        }
    }


    public void clearOnClick(View view) {
        makingTV.setText("");
        making = "";
        resultTV.setText("");
    }

    public void divideOnClick(View view) {
        setMaking("/");
    }

    public void multiplyOnClick(View view) {
        setMaking("*");
    }

    public void plusOnClick(View view) {
        setMaking("+");
    }

    public void minusOnClick(View view) {
        setMaking("-");
    }

    public void zeroOnClick(View view) {
        setMaking("0");
    }

    public void oneOnClick(View view) {
        setMaking("1");
    }

    public void twoOnClick(View view) {
        setMaking("2");
    }

    public void threeOnClick(View view) {
        setMaking("3");
    }

    public void fourOnClick(View view) {
        setMaking("4");
    }

    public void fiveOnClick(View view) {
        setMaking("5");
    }

    public void sixOnClick(View view) {
        setMaking("6");
    }

    public void sevenOnClick(View view) {
        setMaking("7");
    }

    public void eightOnClick(View view) {
        setMaking("8");
    }

    public void nineOnClick(View view) {
        setMaking("9");
    }
}