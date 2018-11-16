package com.example.joker.androidclasspractice;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

public class DialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
    }

    public void show(View view) {

//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setTitle("Are you sure ?");
//        builder.setMessage("You are exiting the app");
//
//        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                finish();
//            }
//        });
//
//        builder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                dialog.dismiss();
//            }
//        });
//
//        AlertDialog dialog = builder.create();
//
//        dialog.show();

        PopupMenu popupMenu = new PopupMenu(DialogActivity.this, view);
        popupMenu.inflate(R.menu.test_menu);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.mark1:
                        showToast("Mark 1");
                        return true;
                    case R.id.mark2:
                        showToast("Mark 1");
                        return true;
                    case R.id.mark3:
                        showToast("Mark 1");
                        return true;
                    default:
                        return false;
                }
            }
        });
        popupMenu.show();

    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }


}
