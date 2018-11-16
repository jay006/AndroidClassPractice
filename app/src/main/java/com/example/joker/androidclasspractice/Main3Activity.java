package com.example.joker.androidclasspractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    private int a = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void showToast(View view) {

        Toast.makeText(this,"Thsi is my toast",Toast.LENGTH_SHORT).show();
    }

    public void add(View view) {
        a++;
        Log.d("value incremented",String.valueOf(a));
    }

    public void sub(View view) {
        a--;
        Log.d("value decremented",String.valueOf(a));
    }
}
