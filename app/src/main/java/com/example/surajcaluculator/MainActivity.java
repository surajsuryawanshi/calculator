package com.example.surajcaluculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText E;
    EditText E2;
    Button add;
    Button sub;
    Button mul;
    Button div;
    Button clear;
    Button dot;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button zero;
    Button CE;
    Button eql;

    TextView res;


    double num1;
    double num2;

    int a=0;
    int s=0;
    int m=0;
    int d=0;


    double result=0;
    double result1=1;
    double result3=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        E=(EditText)findViewById(R.id.editText);

        add=(Button)findViewById(R.id.button);
        sub=(Button)findViewById(R.id.button2);
        mul=(Button)findViewById(R.id.bmul);
        div=(Button)findViewById(R.id.bdiv);
        clear=(Button)findViewById(R.id.bcl);
        dot=(Button)findViewById(R.id.bdot);
        one=(Button)findViewById(R.id.button11);
        two=(Button)findViewById(R.id.button22);
        three=(Button)findViewById(R.id.button33);
        four=(Button)findViewById(R.id.button44);
        five=(Button)findViewById(R.id.button55);
        six=(Button)findViewById(R.id.button66);
        seven=(Button)findViewById(R.id.button77);
        eight=(Button)findViewById(R.id.button88);
        nine=(Button)findViewById(R.id.button99);
        zero=(Button)findViewById(R.id.button00);
        CE=(Button)findViewById(R.id.bce);
        eql=(Button)findViewById(R.id.beql);



        res=(TextView)findViewById(R.id.textView2);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(TextUtils.isEmpty(E.getText().toString()))
                {
                    return;
                }
                num1=Double.parseDouble(E.getText().toString());
                a++;
                E.setText("");
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(TextUtils.isEmpty(E.getText().toString()))
                {
                    return;
                }
                num1=Double.parseDouble(E.getText().toString());
                s++;
                E.setText("");

            }
        });
        mul.setOnClickListener(new View.OnClickListener() {

            @Override



            public void onClick(View view) {
                if(TextUtils.isEmpty(E.getText().toString()))
                {
                    return;
                }
                num1=Double.parseDouble(E.getText().toString());
                m++;
                E.setText("");
            }
        });



        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(E.getText().toString()))
                {
                    return;
                }
                num1=Double.parseDouble(E.getText().toString());
                d++;
                E.setText("");



                /*E.setText(String.valueOf(d1));*/

            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                E.append("1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                E.append("2");
            }
        });
three.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
       /* E.setText("3");*/
        E.append("3");
    }
});

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                E.append("4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                E.append("5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                E.append("6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                E.append("7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                E.append("8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                E.append("9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                E.append("0");
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                E.append(".");
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                E.setText("");

            }
        });
        CE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                E.setText("");
                num1=0;
                num2=0;
                result=0;
                result1=0;
                result3=0;
                d=0;
            }
        });

        eql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num2=Double.parseDouble(E.getText().toString());
                if(d==1)
                {
                  num1=num1/num2;
                    E.setText(String.valueOf(num1));
                    d=0;
                }
                else if (m==1)
                {
                    num1=num1*num2;
                E.setText(String.valueOf(num1));
                m=0;
            }
                else if (a==1)
                {
                    num1=num1+num2;
                    E.setText(String.valueOf(num1));
                    a=0;
                }
                else if (s==1)
                {

                    num1=num1-num2;
                    E.setText(String.valueOf(num1));
                    s=0;
                }
            }

        });
    }
}
