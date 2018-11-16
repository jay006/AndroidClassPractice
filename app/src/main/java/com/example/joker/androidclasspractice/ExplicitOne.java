package com.example.joker.androidclasspractice;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExplicitOne extends AppCompatActivity {

    Button bundleBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_one);

        bundleBtn = findViewById(R.id.submitBtn);
        bundleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExplicitOne.this, ExplicitTwo.class);

                Bundle bundle = new Bundle();
                bundle.putString("name","Shriom");
                bundle.putString("course", "CSE");
                bundle.putInt("age",21);

                intent.putExtras(bundle);

                startActivity(intent);

            }
        });



    }

    public void browse(View view) {
        Uri uri = Uri.parse("http://www.google.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);

        //alternate
        Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
        startActivity(intent1);

    }


}
