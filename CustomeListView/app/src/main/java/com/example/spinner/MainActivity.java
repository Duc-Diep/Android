package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lvStudent ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvStudent = findViewById(R.id.lvStudent);
        List<Student> listStudent = new ArrayList<>();
        listStudent.add(new Student("Nguyen Van A","A"));
        listStudent.add(new Student("Nguyen Van B","B"));
        listStudent.add(new Student("Nguyen Van C","C"));
        listStudent.add(new Student("Nguyen Van D","D"));
        listStudent.add(new Student("Nguyen Van E","E"));
        listStudent.add(new Student("Nguyen Van F","F"));
        listStudent.add(new Student("Nguyen Van G","G"));
        listStudent.add(new Student("Nguyen Van H","H"));
        StudentAdapter stdAdapter = new StudentAdapter(MainActivity.this, listStudent, R.layout.student_cell);
        lvStudent.setAdapter(stdAdapter);
    }
}
