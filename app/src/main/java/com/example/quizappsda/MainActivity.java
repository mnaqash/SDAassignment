package com.example.quizappsda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RadioButton b1,b2,b3;
Button next;
    static ArrayList<String> correctAns = new ArrayList<String>(){
        {
            add("5");
            add("6");
            add("1");
            add("5");
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

        Intent intent = new Intent(getApplicationContext(), q2.class);
        // intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        this.startActivity(intent);
        finish();
    }
}
