package easyC.easyCalc.tarasvolianskyi.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tarasvolianskyi.calculator.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

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
    private Button btnMinOne;
    private Button btnC;
    private String num1 = "";
    private String num2 = "";
    private String num3 = "";
    private String minusChange1 = "";
    private String minusChange2 = "";
    private String minusChange2After = "";
    private String minusChange_1 = "";
    private String minusChange_2 = "";
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
        adMobView();
    }

    private void adMobView() {
        MobileAds.initialize(this, "ca-app-pub-3623739700338204~4196875821");
        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
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
        btnMinOne = findViewById(R.id.btnMinOne);
        btnPercent = findViewById(R.id.btnPercent);

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
        btnMinOne.setOnClickListener(this);
        btnPercent.setOnClickListener(this);
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
            case R.id.btnPoint:
                methodBtnOfNumber(".");
                break;
            case R.id.btnMinOne:
                methodBtnMinOne();
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
            case R.id.btnPercent:
                methodBtnPercent();
                break;
        }
        textView.setText(minusChange1 + num1 + " " + stringAction + minusChange2 + " " +
                num2 + minusChange2After + num3);
    }

    private void methodBtnPercent() {
        if (action == false) {
            doubleNum1 = Double.parseDouble(minusChange_1 + num1) * 0.01;
            methodClear();
            num1 = doubleNum1 + "";
        } else {
            doubleNum1 = Double.parseDouble(minusChange_1 + num1);
            doubleNum2 = Double.parseDouble(minusChange_2 + num2);
            doubleNum2 = doubleNum1 / 100 * doubleNum2;
            num2 = doubleNum2 + "";
        }
    }

    private void methodBtnMinOne() {
        if (action == false) {
            num1 = num1.substring(0, num1.length() - 1);
        } else {
            num2 = num2.substring(0, num2.length() - 1);
        }
    }

    private void methodBtnChange() {
        if (action == false) {
            if (boolChangeFirst == false) {
                boolChangeFirst = true;
                Toast.makeText(this, "first -", Toast.LENGTH_SHORT).show();
                minusChange1 = "- ";
                minusChange_1 = "-";
            } else if (boolChangeFirst == true) {
                boolChangeFirst = false;
                Toast.makeText(this, "first + plus", Toast.LENGTH_SHORT).show();
                minusChange1 = "";
                minusChange_1 = "";
            }
        } else if (action == true) {
            if (boolChangeSec == false) {
                boolChangeSec = true;
                minusChange2 = "(- ";
                minusChange2After = " )";
                minusChange_2 = "-";
                Toast.makeText(this, "sec -", Toast.LENGTH_SHORT).show();
            } else if (boolChangeSec == true) {
                boolChangeSec = false;
                minusChange2 = "";
                minusChange2After = "";
                minusChange_2 = "";
                Toast.makeText(this, "sec + plus", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void methodBtnActionn(int i, String s) {
        action = true;
        Toast.makeText(this, "action true", Toast.LENGTH_SHORT).show();
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
        if (num1 == "") {
            Toast.makeText(this, "Click for first number", Toast.LENGTH_SHORT).show();
        } else if (action == false) {
            Toast.makeText(this, "Chose action for calculation", Toast.LENGTH_SHORT).show();
        } else if (num2 == "") {
            Toast.makeText(this, "Click for second number", Toast.LENGTH_SHORT).show();
        } else {
            doubleNum1 = Double.parseDouble(minusChange_1 + num1);
            doubleNum2 = Double.parseDouble(minusChange_2 + num2);

            switch (numAction) {
                case 0:
                    doubleNum3 = doubleNum1;
                    break;
                case 1:
                    doubleNum3 = doubleNum1 + doubleNum2;
                    break;
                case 2:
                    doubleNum3 = doubleNum1 - doubleNum2;
                    break;
                case 3:
                    doubleNum3 = doubleNum1 * doubleNum2;
                    break;
                case 4:
                    doubleNum3 = doubleNum1 / doubleNum2;
                    break;
            }
            methodClear();
            num3 = doubleNum3 + "";
        }

    }

    private void methodBtnC() {
        methodClear();
        num3 = "";//
        doubleNum1 = 0;
        doubleNum2 = 0;
        doubleNum3 = 0;
    }

    private void methodClear() {
        num1 = "";
        num2 = "";
        minusChange1 = "";
        minusChange2 = "";
        minusChange2After = "";
        stringAction = "";
        action = false;
        numAction = 0;
    }
}
