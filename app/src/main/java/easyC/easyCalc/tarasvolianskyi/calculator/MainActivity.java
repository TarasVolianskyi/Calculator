package easyC.easyCalc.tarasvolianskyi.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.tarasvolianskyi.calculator.R;

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
    private String minusChange1 = "";
    private String minusChange2 = "";
    private String num1WithChang = "";
    private String num2WithChang = "";
    private String num3WithChang = "";
    private double doubleNum1;
    private double doubleNum2;
    private double doubleNum3;
    private String stringAction = "";
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
                methodBtnOfNumber("1");
                break;
            case R.id.btn2:
                methodBtnOfNumber("2");
                break;
            case R.id.btn3:
                methodBtnOfNumber("3");
                break;
            case R.id.btn4:
                methodBtnOfNumber("4");
                break;
            case R.id.btn5:
                methodBtnOfNumber("5");
                break;
            case R.id.btn6:
                methodBtnOfNumber("6");
                break;
            case R.id.btn7:
                methodBtnOfNumber("7");
                break;
            case R.id.btn8:
                methodBtnOfNumber("8");
                break;
            case R.id.btn9:
                methodBtnOfNumber("9");
                break;
            case R.id.btn0:
                methodBtnOfNumber("0");
                break;
            case R.id.btnChange:
                methodBtnChange();
                break;
            case R.id.btnPlus:
                methodBtnActionn(1, "+");
                break;
            case R.id.btnMin:
                methodBtnActionn(2, "-");
                break;
            case R.id.btnMult:
                methodBtnActionn(3, "☓");
                break;
            case R.id.btnDevide:
                methodBtnActionn(4, "÷");
                break;
            case R.id.btnEqvl:
                methodBtnResult();
                break;
            case R.id.btnC:
                methodBtnC();
                break;
        }
        textView.setText(minusChange1 + num1 + " " + stringAction + minusChange2 + " " + num2WithChang + num3);

    }

    private void methodBtnChange() {
        if (action == false) {
            // num1 += "8";
            if (boolChangeFirst == false) {
                boolChangeFirst = true;
                num1WithChang = num1;
                // textView.setText(minusChange1 + num1WithChang + " " + stringAction + minusChange2 + " " + num2);
            } else {
                boolChangeFirst = false;
                num1WithChang = num1;
                // textView.setText(minusChange1 + num1WithChang + " " + stringAction + minusChange2 + " " + num2);

            }
            //textView.setText("- " + num1);
        } else {
            if (boolChangeSec == false) {
                boolChangeSec = true;
                //textView.setText(num1WithChang + " " + stringAction + " ( -" + num2 + ")");
            } else {
                boolChangeSec = false;
                //textView.setText(num1WithChang + " " + stringAction + " " + num2);
            }
            // textView.setText(num1 + " " + stringAction + " " + num2);
        }
    }

    private void methodBtnActionn(int i, String s) {
        action = true;
        stringAction = s;
        numAction = i;
    }

    private void methodBtnOfNumber(String stNum) {
        if (action == false) {
            num1 += stNum;
        } else {
            num2 += stNum;
        }
    }

    private void methodBtnResult() {
        doubleNum1 = Double.parseDouble(num1);

        if (boolChangeFirst = true) {
            doubleNum1 = doubleNum1 * (-1);
        } else {
            doubleNum1 = doubleNum1 * 1;
        }
        doubleNum2 = Double.parseDouble(num2);
        if (boolChangeSec = true) {
            doubleNum2 = doubleNum2 * (-1);
        } else {
            doubleNum2 = doubleNum2 * 1;
        }

        switch (numAction) {
            case 1:
                doubleNum3 = doubleNum1 + doubleNum2;
                break;
            case 2:
                doubleNum3 = doubleNum1 - doubleNum2;
                break;
            case 3:
                doubleNum3 = doubleNum1 * doubleNum2;
                break;
        }
        num1 = "";
        num2 = "";
        num1WithChang = "";
        num2WithChang = "";
        action = false;
        numAction = 0;
    }

    private void methodBtnC() {
        num1 = "";
        num2 = "";
        num3 = "";
        num1WithChang = "";
        num2WithChang = "";
        num3WithChang = "";
        doubleNum1 = 0;
        doubleNum2 = 0;
        doubleNum3 = 0;
        action = false;
        numAction = 0;
    }

}
