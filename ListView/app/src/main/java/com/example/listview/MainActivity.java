package com.example.listview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvStudent;
    static ArrayList<String> list = new ArrayList<>();;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActionBar actionbar = getSupportActionBar();
        actionbar.hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvStudent = findViewById(R.id.lvStudent);
        list.add("Hihihihi");
        list.add("Hihihihi");
        list.add("Hihihihi");
        list.add("Hihihihi");
        list.add("Hihihihi");
        list.add("Hihihihi");
        list.add("Hihihihi");
        list.add("Hihihihi");
        list.add("Hihihihi");
        list.add("Hihihihi");
        list.add("Hihihihi");
        list.add("Hihihihi");
        list.add("Hihihihi");
        list.add("Hihihihi");
        list.add("Hihihihi");
        list.add("Hihihihi");
        list.add("Hihihihi");
        list.add("Hihihihi");
        list.add("Hihihihi");
        list.add("Hihihihi");
        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,list);
        lvStudent.setAdapter(adapter);
    }
}
