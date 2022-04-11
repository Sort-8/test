package com.ph.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String num_0 = "0";
    private static final String num_1 = "1";
    private static final String num_2 = "2";
    private static final String num_3 = "3";
    private static final String num_4 = "4";
    private static final String num_5 = "5";
    private static final String num_6 = "6";
    private static final String num_7 = "7";
    private static final String num_8 = "8";
    private static final String num_9 = "9";

    private StringBuilder currentInput = new StringBuilder("");
    private TextView inputText;
    private TextView outputText;
    private Button btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9;
    private Button btn_clear, btn_backspace, btn_equal, btn_point, btn_plus, btn_minus, btn_multiply, btn_divide;

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            // 横屏
            setContentView(R.layout.activity_main_land);
            setListener();
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            // 竖屏
            setContentView(R.layout.activity_main_port);
            setListener();
        }
    }

    private void setListener() {
        outputText = findViewById(R.id.outputText);
        inputText = findViewById(R.id.inputText);
        btn_clear = findViewById(R.id.btn_clear);
        btn_backspace = findViewById(R.id.btn_backspace);
        btn_equal = findViewById(R.id.btn_equal);
        btn_point = findViewById(R.id.btn_point);
        btn_plus = findViewById(R.id.btn_plus);
        btn_minus = findViewById(R.id.btn_minus);
        btn_multiply = findViewById(R.id.btn_multiply);
        btn_divide = findViewById(R.id.btn_divide);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_0 = findViewById(R.id.btn_0);
        setButtonOut(btn_0, inputText, num_0);
        setButtonOut(btn_1, inputText, num_1);
        setButtonOut(btn_2, inputText, num_2);
        setButtonOut(btn_3, inputText, num_3);
        setButtonOut(btn_4, inputText, num_4);
        setButtonOut(btn_5, inputText, num_5);
        setButtonOut(btn_6, inputText, num_6);
        setButtonOut(btn_7, inputText, num_7);
        setButtonOut(btn_8, inputText, num_8);
        setButtonOut(btn_9, inputText, num_9);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int orientation = getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.activity_main_port);
        } else if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.activity_main_land);
        }
        setListener();
    }

    public void setButtonOut(Button button, TextView inputText, String text) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText.setText(text);
            }
        });
    }

}