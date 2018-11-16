package com.example.joker.androidclasspractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class Main2Activity extends AppCompatActivity {

    private String country[] = {"India","America","Australia","Pakistan","China","Japan","Russia"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ListView listView = findViewById(R.id.listView);
        Spinner spinner = findViewById(R.id.spinner);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,country);

        listView.setAdapter(arrayAdapter);

        spinner.setAdapter(arrayAdapter);
    }
}
