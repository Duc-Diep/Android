package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class GreetingActivity extends AppCompatActivity {
    String firstName,lastName;
    TextView textGreeting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);
        // Intent truyền sang.
        Toast.makeText(this,"Chuyển màn hình thành công",Toast.LENGTH_LONG).show();
        Intent intent = this.getIntent();
        firstName = intent.getStringExtra("firstName");
        lastName = intent.getStringExtra("lastName");
        textGreeting = (TextView)(findViewById(R.id.text_greeting));
        String greeting = "Hello"+firstName+" "+lastName;
        textGreeting.setText(greeting);
    }
    public void backClicked(View view)  {
        // Gọi phương thức onBackPressed().
        this.onBackPressed();
    }
    // Khi Activity này hoàn thành,
    // có thể cần gửi phản hồi gì đó về cho Activity đã gọi nó
    @Override
    public void finish() {
        // Chuẩn bị dữ liệu Intent.
        Intent data = new Intent();
        data.putExtra("feedback","I'm"+firstName+" "+lastName+" Hi!!");
        // Activity đã hoàn thành OK, trả về dữ liệu.
        this.setResult(Activity.RESULT_OK,data);
        super.finish();
    }
    // Phương thức được gọi khi người dùng nhấn vào nút Back.

}
