package com.example.tarasvolianskyi.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;
    private Button btnPlus;
    private Button btnMin;
    private Button btnMultp;
    private Button btnDevide;
    private Button btnEqvl;
    private Button btnPoint;
    private Button btnPercent;
    private Button btnChange;
    private Button btnC;
    private String num1 = "";
    private String num2 = "";
    private String num3 = "";
    private int intNum1;
    private int intNum2;
    private int intNum3;
    private String stringAction;
    private int numAction = 0;// 1+ 2- 3☓ 4÷
    private boolean boolChangeFirst = false;
    private boolean boolChangeSec = false;
    private boolean action = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        textView = findViewById(R.id.tvText);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        btnPlus = findViewById(R.id.btnPlus);
        btnMin = findViewById(R.id.btnMin);
        btnMultp = findViewById(R.id.btnMult);
        btnDevide = findViewById(R.id.btnDevide);
        btnPoint = findViewById(R.id.btnPoint);
        btnEqvl = findViewById(R.id.btnEqvl);
        btnChange = findViewById(R.id.btnChange);
        btnC = findViewById(R.id.btnC);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btnPlus.setOnClickListener(this);
        btnMin.setOnClickListener(this);
        btnMultp.setOnClickListener(this);
        btnDevide.setOnClickListener(this);
        btnPoint.setOnClickListener(this);
        btnChange.setOnClickListener(this);
        btnEqvl.setOnClickListener(this);
        btnC.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                if (action == false) {
                    num1 += "1";
                    textView.setText(num1);
                } else {
                    num2 += "1";
                    textView.setText(num1 + " " + stringAction + " " + num2);
                }
                break;
            case R.id.btn2:
                if (action == false) {
                    num1 += "2";
                    textView.setText(num1);
                } else {
                    num2 += "2";
                    textView.setText(num1 + " " + stringAction + " " + num2);
                }
                break;
            case R.id.btn3:
                if (action == false) {
                    num1 += "3";
                    textView.setText(num1);
                } else {
                    num2 += "3";
                    textView.setText(num1 + " " + stringAction + " " + num2);
                }
                break;
            case R.id.btn4:
                if (action == false) {
                    num1 += "4";
                    textView.setText(num1);
                } else {
                    num2 += "4";
                    textView.setText(num1 + " " + stringAction + " " + num2);
                }
                break;
            case R.id.btn5:
                if (action == false) {
                    num1 += "5";
                    textView.setText(num1);
                } else {
                    num2 += "5";
                    textView.setText(num1 + " " + stringAction + " " + num2);
                }
                break;
            case R.id.btn6:
                if (action == false) {
                    num1 += "6";
                    textView.setText(num1);
                } else {
                    num2 += "6";
                    textView.setText(num1 + " " + stringAction + " " + num2);
                }
                break;
            case R.id.btn7:
                if (action == false) {
                    num1 += "7";
                    textView.setText(num1);
                } else {
                    num2 += "7";
                    textView.setText(num1 + " " + stringAction + " " + num2);
                }
                break;
            case R.id.btn8:
                if (action == false) {
                    num1 += "8";
                    textView.setText(num1);
                } else {
                    num2 += "8";
                    textView.setText(num1 + " " + stringAction + " " + num2);
                }
                break;
            case R.id.btn9:
                if (action == false) {
                    num1 += "9";
                    textView.setText(num1);
                } else {
                    num2 += "9";
                    textView.setText(num1 + " " + stringAction + " " + num2);
                }
                break;
            case R.id.btn0:
                if (action == false) {
                    num1 += "0";
                    textView.setText(num1);
                } else {
                    num2 += "0";
                    textView.setText(num1 + " " + stringAction + " " + num2);
                }
                break;

            case R.id.btnChange:
                 if (action == false) {
                // num1 += "8";
                if (boolChangeFirst == false) {
                    boolChangeFirst = true;
                    textView.setText("- " + num1);
                } else {
                    boolChangeFirst = false;
                    textView.setText(num1);
                }

                //textView.setText("- " + num1);
                } else {
                     if (boolChangeSec == false) {
                         boolChangeSec = true;
                         textView.setText(num1 + " " + stringAction + " ( -" + num2+")");
                     } else {
                         boolChangeSec = false;
                         textView.setText(num1 + " " + stringAction + " " + num2);
                     }
                   // textView.setText(num1 + " " + stringAction + " " + num2);
                }
                break;
            case R.id.btnPlus:
                action = true;
                stringAction = "+";
                textView.setText(num1 + " " + stringAction);
                numAction = 1;
                break;
            case R.id.btnMin:
                action = true;
                stringAction = "-";
                textView.setText(num1 + " " + stringAction);
                numAction = 2;
                break;
            case R.id.btnMult:
                action = true;
                stringAction = "☓";
                textView.setText(num1 + " " + stringAction);
                numAction = 3;
                break;
            case R.id.btnDevide:
                action = true;
                stringAction = "÷";
                textView.setText(num1 + " " + stringAction);
                numAction = 4;
                break;
            case R.id.btnEqvl:
                intNum1 = Integer.parseInt(num1);
                intNum2 = Integer.parseInt(num2);

                switch (numAction) {
                    case 1:
                        intNum3 = intNum1 + intNum2;
                        break;
                    case 2:
                        intNum3 = intNum1 - intNum2;
                        break;
                    case 3:
                        intNum3 = intNum1 * intNum2;
                        break;
                }
                textView.setText(intNum3 + "");
                num1 = "";
                num2 = "";
                action = false;
                numAction = 0;
                break;
            case R.id.btnC:
                num1 = "";
                num2 = "";
                num3 = "";
                action = false;
                numAction = 0;
                textView.setText("");
                break;
        }
    }
}
