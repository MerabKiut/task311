package com.example.task311;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView result;
    private double firstVariable;
    private double secondVariable;
    private double resultVariable;

    boolean mMultiply;
    boolean mDivide;
    boolean mPlus;
    boolean mMinus;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {

        result = findViewById(R.id.result);



    }

    public void buttonClicked(View view) {

        if (view.getId() == R.id.btn_0) {
            result.setText(result.getText() + "0");
        } else if (view.getId() == R.id.btn_1) {
            result.setText(result.getText() + "1");
        } else if (view.getId() == R.id.btn_2) {
            result.setText(result.getText() + "2");
        } else if (view.getId() == R.id.btn_3) {
            result.setText(result.getText() + "3");
        } else if (view.getId() == R.id.btn_4) {
            result.setText(result.getText() + "4");

        } else if (view.getId() == R.id.btn_5) {
            result.setText(result.getText() + "5");

        } else if (view.getId() == R.id.btn_6) {
            result.setText(result.getText() + "6");

        } else if (view.getId() == R.id.btn_7) {
            result.setText(result.getText() + "7");

        } else if (view.getId() == R.id.btn_8) {
            result.setText(result.getText() + "8");

        } else if (view.getId() == R.id.btn_9) {
            result.setText(result.getText() + "9");

        } else if (view.getId() == R.id.btn_plus) {
            //firstVariable = Integer.valueOf(result.getText().toString());
            firstVariable = Double.valueOf(result.getText().toString());
            mPlus = true;
            result.setText(null);
            result.setHint("+");

        } else if (view.getId() == R.id.btn_min) {
            firstVariable = Double.valueOf(result.getText().toString());
            mMinus = true;
            result.setText(null);
            result.setHint("-");

        } else if (view.getId() == R.id.btn_mult) {
            firstVariable = Double.valueOf(result.getText().toString());
            mMultiply = true;
            result.setText(null);
            result.setHint("*");

        } else if (view.getId() == R.id.btn_div) {
            firstVariable = Double.valueOf(result.getText().toString());
            mDivide = true;
            result.setText(null);
            result.setHint("/");

        } else if (view.getId() == R.id.btn_plusminus) {

        } else if (view.getId() == R.id.btn_percent) {
            /*secondVariable = Float.parseFloat(result.getText() + "");
            result.setHint(0);
            if (mMultiply == true) {
                result.setText(firstVariable * (secondVariable) + "");
            }
            if (mDivide == true) {
                result.setText(firstVariable / secondVariable + "");
            }
            if (mPlus == true) {
                result.setText(firstVariable + secondVariable + "");
            }
            if (mMinus == true) {
                result.setText(firstVariable - secondVariable + "");
            }*/

        } else if (view.getId() == R.id.btn_C) {
            result.setText(null);
            result.setHint("0");


        } else if (view.getId() == R.id.btn_equal) { //https://crunchify.com/how-to-create-simple-calculator-android-app-using-android-studio/
            secondVariable = Double.valueOf(result.getText().toString());
            result.setHint(0);
            if (mMultiply == true) {
                resultVariable = firstVariable * secondVariable;
                result.setText(resultVariable + "");
            }
            if (mDivide == true) {
                result.setText(firstVariable / secondVariable + "");
            }
            if (mPlus == true) {
                result.setText(firstVariable + secondVariable + "");
            }
            if (mMinus == true) {
                result.setText(firstVariable - secondVariable + "");
            }

         } else if (view.getId() == R.id.btn_comma) {
            result.setText(result.getText() + ".");
        }
    }
}
