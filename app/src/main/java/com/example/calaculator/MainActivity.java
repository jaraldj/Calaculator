package com.example.calaculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etn1;
    EditText etn2;
    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etn1=findViewById(R.id.edtN1);
        etn2=findViewById(R.id.edtN2);
        tvResult=findViewById(R.id.txtResult);
    }

    public void btnClick(View view) {
        int n1=Integer.parseInt(etn1.getText().toString());
        int n2=Integer.parseInt(etn2.getText().toString());
        int sum=n1+n2;
        tvResult.setText(String.valueOf(sum));
    }
}