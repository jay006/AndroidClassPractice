package com.example.joker.androidclasspractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Main4Activity extends AppCompatActivity {

    ListView listView;
    TextView textView;

    List<String> dataList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        listView = findViewById(R.id.listView);
        textView = findViewById(R.id.textView);

        Spinner spinner = new Spinner(this);

        dataList.add("Shriom");
        dataList.add("Pavan");
        dataList.add("Prateek");
        dataList.add("Preetam");
        dataList.add("Sunil");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dataList);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener((parent, view, position, id)-> textView.setText(dataList.get(position)));

        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
