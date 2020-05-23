package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);
        final ArrayList<String> posts = new ArrayList<>();
        posts.add("Red");
        posts.add("Blue");
        posts.add("Orange");
        posts.add("Purple");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, posts);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // parent.setVisibility(View.GONE); // visibility of Array view
                // view.setVisibility(View.GONE); // set visibility of 1 element

                Toast.makeText(MainActivity.this, String.valueOf(position) + "   " + posts.get(position),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
