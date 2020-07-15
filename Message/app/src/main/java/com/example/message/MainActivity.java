package com.example.message;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lvSender;
    EditText edtsearch;
    final List<Sender> listSender = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar ac = getSupportActionBar();
        ac.hide();

        lvSender = findViewById(R.id.lvSender);
        listSender.add(new Sender(R.drawable.doan,"Doan Vũ","Hello mình là Lép's đến đây :v"));
        listSender.add(new Sender(R.drawable.khanh,"Duy Khánh","Hi mình là Duy Khánh IT "));
        listSender.add(new Sender(R.drawable.linh,"Nguyễn Anh Linh","đã xem...."));
        listSender.add(new Sender(R.drawable.diu,"Nguyễn Hà Hương Dịu","Hi, chào cậu!"));
        listSender.add(new Sender(R.drawable.trung,"Tất Trung","Bạn: ..."));
        listSender.add(new Sender(R.drawable.thu,"Thunder Sword","Bạn: Hi a Sword :v"));
        listSender.add(new Sender(R.drawable.chuong,"Chương Vũ","Chào a e là Chương đây :)"));
        listSender.add(new Sender(R.drawable.ha,"Vinh Hà","Hmmm......"));

        SenderAdapter adapter = new SenderAdapter(MainActivity.this, listSender, R.layout.sender_cell);
        lvSender.setAdapter(adapter);
        edtsearch = findViewById(R.id.edtSearch);
        edtsearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                List<Sender> newlist = new ArrayList<>();
            for(int i=0;i<listSender.size();i++){
                if(listSender.get(i).getName().toLowerCase().contains(s.toString().toLowerCase())){
                    newlist.add(listSender.get(i));
                }
            }
                SenderAdapter newadapter = new SenderAdapter(MainActivity.this, newlist, R.layout.sender_cell);
                lvSender.setAdapter(newadapter);
            }
        });
    }
}
