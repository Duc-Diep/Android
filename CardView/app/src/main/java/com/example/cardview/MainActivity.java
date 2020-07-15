package com.example.cardview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Card> cardList;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar ac = getSupportActionBar();
        ac.hide();
        cardList = new ArrayList<>();
        listView = findViewById(R.id.lvCard);
        cardList.add(new Card(R.drawable.lucy,"Lucy Jessica","Eagle University",2345,1222,433,1));
        cardList.add(new Card(R.drawable.noah,"Joan Noah","Stanford University",4455,122,355,2));
        cardList.add(new Card(R.drawable.sarah,"Sarah Wattson","Harvard University",5676,122,231,3));
        CardAdapter cardAdapter = new CardAdapter(cardList);
        listView.setAdapter(cardAdapter);
    }
}
