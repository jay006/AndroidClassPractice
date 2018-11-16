package com.example.joker.androidclasspractice;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;

public class Main6Activity extends AppCompatActivity {

    boolean isFirst = true;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        Button button = findViewById(R.id.toggleBtn);

        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .add(R.id.fragmentContainer,new FragmentOne())
                .commit();

        button.setOnClickListener(v->{
            swapFragment();
        });

    }

    private void swapFragment() {

        if(isFirst){
            fragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainer,new FragmentTwo())
                    .commit();
        }else{
            fragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainer,new FragmentOne())
                    .commit();
        }

        isFirst = !isFirst;
    }
}
