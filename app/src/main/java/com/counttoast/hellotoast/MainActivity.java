package com.counttoast.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE="com.counttoast.hellotoast.HelloToast";

private TextView tv;
 private Button button1,button2;
int n=0;
String number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView) findViewById(R.id.textView);
        button1=(Button) findViewById(R.id.button);
        button2=(Button) findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,HelloToast.class);

                 number=tv.getText().toString();
                intent.putExtra("msg",number);
                startActivity(intent);

            }
        });
button2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        n++;
        tv.setText(Integer.toString(n));
    }
});
    }
    //public void sendMessage(View view){
      // tv=(TextView) findViewById(R.id.textView3);
       // String message=tv.getText().toString();




     /* public void count(View view) {
        n++;
        tv.setText(Integer.toString(n));

    }

  public void toast(View view) {

        //button=(Button) findViewById(R.id.)
        Intent intent=new Intent(MainActivity.this,HelloToast.class);

        String num=tv.getText().toString();
        intent.putExtra("message",num);
        startActivity(intent);


        //Toast.makeText(this,"Hello world",Toast.LENGTH_SHORT).show();
        //String g;

}*/




}