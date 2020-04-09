package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    Button btnAdd, btnSubtract, btnMulti, btnShare, btnEqual, btnAC, btnPoint, btnDel;
    EditText edtInput, edtOutput;
    float a,b;
    int end;
    float result;
    String pheptoan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        edtInput.setFocusable(false);
        edtOutput.setFocusable(false);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.example.com"));
                edtInput.setText(edtInput.getText()+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText()+"9");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            a=Float.parseFloat(edtInput.getText().toString());
            edtInput.setText(edtInput.getText()+"+");
            end = edtInput.getText().toString().length();
            pheptoan="cong";
            }
        });
        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Float.parseFloat(edtInput.getText().toString());
                edtInput.setText(edtInput.getText()+"-");
                end = edtInput.getText().toString().length();
                pheptoan="tru";
            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Float.parseFloat(edtInput.getText().toString());
                edtInput.setText(edtInput.getText()+"x");
                end = edtInput.getText().toString().length();
                pheptoan="nhan";
            }
        });
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Float.parseFloat(edtInput.getText().toString());
                edtInput.setText(edtInput.getText()+":");
                end = edtInput.getText().toString().length();
                pheptoan="chia";
            }
        });
        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText("");
                edtOutput.setText("");
                pheptoan="";
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = edtInput.getText().toString();
                String substr = edtInput.getText().toString().substring(end);
                b = Float.parseFloat(substr);
                switch (pheptoan){
                    case "cong": result = a+b;
                                edtInput.setText(""+temp);
                                edtOutput.setText(String.valueOf(result));
                                Toast.makeText(MainActivity.this,"Có kết quả rồi nè :)",Toast.LENGTH_SHORT).show();
                                break;
                    case "tru" : result= a-b;
                                edtInput.setText(""+temp);
                                edtOutput.setText(String.valueOf(result));
                                Toast.makeText(MainActivity.this,"Có kết quả rồi nè :)",Toast.LENGTH_SHORT).show();
                                break;
                    case "nhan": DecimalFormat fm = new DecimalFormat("0.00000");
                                result= a*b;
                                edtInput.setText(""+temp);
                                edtOutput.setText(String.valueOf(fm.format(result)));
                                Toast.makeText(MainActivity.this,"Có kết quả rồi nè :)",Toast.LENGTH_SHORT).show();
                                break;
                    case "chia": if(b==0){
                                Toast.makeText(MainActivity.this,"Số bị chia phải khác 0",Toast.LENGTH_SHORT).show();
                                edtOutput.setText("Error");
                                break;
                    }
                        else {
                                result = a/b;
                                edtInput.setText(""+temp);
                                edtOutput.setText(String.valueOf(result));
                                Toast.makeText(MainActivity.this,"Có kết quả rồi nè :)",Toast.LENGTH_SHORT).show();
                                break;}
                }

            }
        });
        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtInput.getText().toString().length()==1){
                    Toast.makeText(MainActivity.this,"Không còn gì để xóa!!",Toast.LENGTH_LONG).show();
                }
                edtInput.setText(edtInput.getText().delete(edtInput.getText().length()-1,edtInput.getText().length()));
            }
        });
        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText()+".");
            }
        });
    }
    public void AnhXa(){
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnAdd = findViewById(R.id.btnAdd);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnMulti = findViewById(R.id.btnMulti);
        btnShare = findViewById(R.id.btnShare);
        btnEqual = findViewById(R.id.btnEqual);
        btnAC = findViewById(R.id.btnAC);
        btnDel = findViewById(R.id.btnDel);
        btnPoint =  findViewById(R.id.btnPoint);
        edtInput = findViewById(R.id.edtInput);
        edtOutput = findViewById(R.id.edtOutput);
    }
}
