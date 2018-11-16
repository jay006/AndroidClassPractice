package com.example.joker.androidclasspractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ExplicitTwo extends AppCompatActivity {

    TextView nameTV, courseTV, ageTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_two);

        //get from intent
        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();

        String name = bundle.getString("name");
        String course = bundle.getString("course");
        int age = bundle.getInt("age",0);

        //get the reference and set the value

        nameTV = findViewById(R.id.nameTV);
        ageTV = findViewById(R.id.ageTV);
        courseTV = findViewById(R.id.courseTV);

        nameTV.setText(name);
        ageTV.setText(String.valueOf(age));
        courseTV.setText(course);

    }
}
