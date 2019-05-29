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

import static com.example.quizappsda.MainActivity.collectAns;

public class q7 extends AppCompatActivity {
    RadioButton b1,b2,b3;
    //RadioGroup btnId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q7);
        b1=(RadioButton)findViewById(R.id.A21);
        b2=(RadioButton)findViewById(R.id.A22);
        b3=(RadioButton)findViewById(R.id.A23);
        // btnId=(RadioGroup)findViewById(R.id.Group);






    }

    public void nextA2(View view) {
        //Toast.makeText(MainActivity.this, "Thank You, You've Successfully Signed Up", Toast.LENGTH_SHORT).show();

        if(b1.isChecked()){
            collectAns.add("8");
        }
        else if(b2.isChecked()){
            collectAns.add("5");
        }
        else if(b3.isChecked()){
            collectAns.add("7");
        }else{
            collectAns.add("no ans");
        }

        Intent intent = new Intent(q7.this, q8.class);
        // intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
         finish();
    }
}
