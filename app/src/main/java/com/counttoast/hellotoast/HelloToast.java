package com.counttoast.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HelloToast extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_toast);
         Intent intent=getIntent();
         String num1=intent.getStringExtra("msg");
        TextView text1=(TextView) findViewById(R.id.textView3);
        TextView text2=(TextView) findViewById(R.id.textView2);
        text1.setText(num1);
        text2.setText("Hello!");


    }
}