package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//Developed by: Maria Lourdes Tan
public class MainActivity extends AppCompatActivity {
private Button zero, one, two, three, four, five, six, seven, eight, nine, equal, add, minus, multiply,divide, clear;
private TextView Input, result;
private final char ADDITION = '+';
private final char SUBTRACTION = '-';
private final char MULTIPLICATION = '*';
private final char DIVISION = '/';
private double val1 = Double.NaN;
private double val2;
private double answer;
private char ACTION;
private final char EQU = '0';

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupIUViews();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText(Input.getText().toString() + "0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText(Input.getText().toString() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText(Input.getText().toString() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText(Input.getText().toString() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText(Input.getText().toString() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText(Input.getText().toString() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText(Input.getText().toString() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText(Input.getText().toString() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText(Input.getText().toString() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText(Input.getText().toString() + "9");
            }
        });

        add.setOnClickListener((v) ->{
            compute();
            ACTION = ADDITION;
            result.setText(String.valueOf(val1) + "+" );
            Input.setText(null);
        });

        minus.setOnClickListener((v) ->{
            compute();
            ACTION = SUBTRACTION;
            result.setText(String.valueOf(val1) + "-" );
            Input.setText(null);
        });

        multiply.setOnClickListener((v) ->{
            compute();
            ACTION = MULTIPLICATION;
            result.setText(String.valueOf(val1) + "*" );
            Input.setText(null);
        });

        divide.setOnClickListener((v) ->{
            compute();
            ACTION = DIVISION;
            result.setText(String.valueOf(val1) + "/");
            Input.setText(null);
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = EQU;
                result.setText(result.getText().toString() + String.valueOf(val2) + " = " + String.valueOf(answer));
                Input.setText(null);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Input.getText().length() > 0){
                    CharSequence name = Input.getText().toString();
                    Input.setText(name.subSequence(0, name.length() -1));
                }
                else {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    Input.setText (null);
                    result.setText (null);
                }
            }
        });
    }

   private void setupIUViews(){
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        equal = (Button) findViewById(R.id.equal);
        add = (Button) findViewById(R.id.btnAdd);
        minus = (Button) findViewById(R.id.btnMinus);
        multiply = (Button) findViewById(R.id.btnMultiply);
        divide = (Button) findViewById(R.id.btnDivide);
        Input = (TextView) findViewById(R.id.btnInput);
        result = (TextView) findViewById(R.id.Result);
        clear = (Button) findViewById(R.id.clear);
   }

   private void compute(){
        if (!Double.isNaN(val1)){
            val2 = Double.parseDouble(Input.getText().toString());

            switch(ACTION){

                case ADDITION:
                    answer = val1 + val2;
                    break;

                case SUBTRACTION:
                    answer = val1 - val2;
                    break;
                case MULTIPLICATION:
                    answer = val1 * val2;
                    break;
                case DIVISION:
                    answer = val1 / val2;
                    break;

                case EQU:
                    break;
            }

        }
        else{
           val1 = Double.parseDouble(Input.getText().toString());
        }

   }


}