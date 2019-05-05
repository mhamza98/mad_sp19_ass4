package com.example.recycler_view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CourseDetails extends AppCompatActivity {

    TextView et1,et2,et3,et4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_details);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        et4 =findViewById(R.id.et4);
        Intent intent = getIntent();
        String message = intent.getStringExtra("data");
        //condition
        if (message.contentEquals("Numerical Computing"))
        {
            et1.setText("CS1001");
            et2.setText("Numerical Computing");
            et3.setText("3");
            et4.setText("Dr Asmat Ara");
        }
        else if (message.contentEquals("Design & Analysis Of Algorithms"))
        {
            et1.setText("CS1002");
            et2.setText("Design & Analysis Of Algorithms");
            et3.setText("3");
            et4.setText("Sir Osama Ahmed Khan");
        }

        else if (message.contentEquals("Computer Architecture & Organization"))
        {
            et1.setText("CS1003");
            et2.setText("Computer Architecture & Organization");
            et3.setText("3 + 1");
            et4.setText("Sir Saqib Riaz");
        }
        else if (message.contentEquals("Artifical Intelligence"))
        {
            et1.setText("CS1004");
            et2.setText("Artifical Intelligence");
            et3.setText("3 + 1");
            et4.setText("Sir Kashif Khan");
        }
        else if (message.contentEquals("Principles Of Management"))
        {
            et1.setText("CS1005");
            et2.setText("Principles Of Management");
            et3.setText("2");
            et4.setText("Dr Shujaat Mubarak");
        }
        else if (message.contentEquals("Mobile Apllication & Development"))
        {
            et1.setText("CS1006");
            et2.setText("Mobile Apllication & Development");
            et3.setText("3");
            et4.setText("Sir Asad Ahsan");
        }
        else if (message.contentEquals("Operating System"))
        {
            et1.setText("CS1007");
            et2.setText("Operating System");
            et3.setText("2 + 1");
            et4.setText("Sir Osama Ahmed Khan");
        }
        else if (message.contentEquals("Software Engineering"))
        {
            et1.setText("CS1008");
            et2.setText("Software Engineering");
            et3.setText("3");
            et4.setText("Sir Ahmed Raza");
        }
        else if (message.contentEquals("Compiler Construction"))
        {
            et1.setText("CS1009");
            et2.setText("Compiler Construction");
            et3.setText("2 + 1");
            et4.setText("Miss Hira Farman");
        }

    }
}
