package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

        TextView answerOutput;
        EditText firstnumber, secondnumber;
        Button add, subtract, multiply, divide;

        int num1;
        int num2;
        int answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answerOutput = (TextView)findViewById(R.id.answerOutput);

        firstnumber = (EditText)findViewById(R.id.firstnumber);
        secondnumber = (EditText)findViewById(R.id.secondnumber);

        add = (Button)findViewById(R.id.add);
        subtract = (Button)findViewById(R.id.subtract);
        multiply = (Button)findViewById(R.id.multiply);
        divide = (Button)findViewById(R.id.divide);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(firstnumber.getText().toString());
                num2 = Integer.parseInt(secondnumber.getText().toString());
                answer = num1 + num2;
                answerOutput.setText(String.valueOf(answer));
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(firstnumber.getText().toString());
                num2 = Integer.parseInt(secondnumber.getText().toString());
                answer = num1 - num2;
                answerOutput.setText(String.valueOf(answer));
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(firstnumber.getText().toString());
                num2 = Integer.parseInt(secondnumber.getText().toString());
                answer = num1 * num2;
                answerOutput.setText(String.valueOf(answer));
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(firstnumber.getText().toString());
                num2 = Integer.parseInt(secondnumber.getText().toString());
                answer = num1 / num2;
                answerOutput.setText(String.valueOf(answer));
            }
        });
    }
}