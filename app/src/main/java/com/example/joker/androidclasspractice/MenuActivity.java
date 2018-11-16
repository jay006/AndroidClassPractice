package com.example.joker.androidclasspractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    EditText inputOne, inputTwo;
    Button addBtn;
    TextView resultTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        inputOne = findViewById(R.id.et1);
        inputTwo = findViewById(R.id.et2);

        addBtn = findViewById(R.id.addBtn);

        resultTV = findViewById(R.id.resultTV);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String one = inputOne.getText().toString().trim();
                String two = inputTwo.getText().toString().trim();

                int num1 = Integer.parseInt(one);
                int num2 = Integer.parseInt(two);

                int result = num1 + num2;

                resultTV.setText(String.valueOf(result)          );

            }
        });



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.test_menu, menu);
        return true;

    }



}
