package com.example.quizappsda;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import java.util.ArrayList;

public class q4 extends AppCompatActivity {
RadioButton b1,b2,b3;
Button next;
    static ArrayList<String> correctAns = new ArrayList<String>();
    static ArrayList<String> collectAns= new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(RadioButton)findViewById(R.id.b1);
        b1=(RadioButton)findViewById(R.id.b1);
        b1=(RadioButton)findViewById(R.id.b1);
        next=(Button)findViewById(R.id.nextB);




    }

    public void nextQ(View view) {
        if(b1.isChecked()){
collectAns.add("3");
        }
        if(b2.isChecked()){
            collectAns.add("5");
        }
        if(b3.isChecked()){
            collectAns.add("6");
        }else{
            collectAns.add("no ans");
        }


    }
}
