package com.example.joker.androidclasspractice;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ImageCaptureActivity extends AppCompatActivity {

    ImageView imageView ;
    final int REQUEST_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_capture);

        imageView = findViewById(R.id.imageView);

    }

    public void openGallery(View view) {

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
//
//        if (requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK) {
//            Bitmap photo = (Bitmap) data.getExtras().get("data");
//            imageView.setImageBitmap(photo);
//        }


        if(requestCode == REQUEST_CODE && resultCode == RESULT_OK){

            Bundle bundle = data.getExtras();
            Bitmap imageBitmap = (Bitmap) bundle.get("data");

            imageView.setImageBitmap(imageBitmap);

        }

    }
}
