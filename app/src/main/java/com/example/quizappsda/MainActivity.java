package com.example.quizappsda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RadioButton b1,b2,b3;
//RadioGroup btnId;
    static ArrayList<String> correctAns = new ArrayList<String>(){
        {
            add("5");
            add("6");
            add("1");
            add("7");
            add("3");
            add("8");
            add("8");
            add("2");
            add("10");
        }
    };
    static ArrayList<String> collectAns= new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(RadioButton)findViewById(R.id.A1q1);
        b2=(RadioButton)findViewById(R.id.A1q2);
        b3=(RadioButton)findViewById(R.id.A1q3);
       // btnId=(RadioGroup)findViewById(R.id.Group);






    }

    public void nextA1(View view) {
        //Toast.makeText(MainActivity.this, "Thank You, You've Successfully Signed Up", Toast.LENGTH_SHORT).show();

        if(b1.isChecked()){
        collectAns.add("3");
        }
        else if(b2.isChecked()){
            collectAns.add("5");
        }
        else if(b3.isChecked()){
            collectAns.add("6");
        }else{
            collectAns.add("no ans");
        }

        Intent intent = new Intent(MainActivity.this, newActivity.class);
        // intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}
