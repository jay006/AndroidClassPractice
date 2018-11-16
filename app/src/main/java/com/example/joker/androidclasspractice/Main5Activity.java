package com.example.joker.androidclasspractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {

    String[] friends = {"Shriom", "Batman", "Superman", "Ironman", "Black Widow", "Caption America"};
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        listView = findViewById(R.id.listView);
        ArrayAdapter<String> listNames = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, friends);
        listView.setAdapter(listNames);
        //1
        registerForContextMenu(listView);

        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PopupMenu popupMenu = new PopupMenu(Main5Activity.this, v);
                popupMenu.inflate(R.menu.action_menu);
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        return false;
                    }
                });




            }
        });


    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.context_menu, menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.context_share:
                showToast("Context Share ");
                return true;
            case R.id.context_delete:
                showToast("COntext Delete");
                return true;
            default:
                return false;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.action_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.action_setting:
                showToast("Setting");
                return true;
            case R.id.action_share:
                showToast("Share");
                return true;
            case R.id.action_about:
                showToast("About us");
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }

    }

    private void showToast(String menuItem) {

        Toast.makeText(this, menuItem, Toast.LENGTH_SHORT).show();

    }
}
