package com.example.intent;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText textFirstName,textLastName;
    private TextView textFeedback;
    public static final int MY_REQUEST_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textFirstName = (EditText)(findViewById(R.id.text_firstName));
        textLastName = (EditText)(findViewById(R.id.text_lastName));
        textFeedback = (TextView)(findViewById(R.id.text_feedback));
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == Activity.RESULT_OK && requestCode == MY_REQUEST_CODE) {
            String feedback = data.getStringExtra("feedback");
            textFeedback.setText(feedback);
        } else {
            textFeedback.setText("???");
        }
    }
    // Phương thức được gọi khi người dùng click vào
    // button "Show Greeting".
    public void showGreeting(View view){
        String firstName= this.textFirstName.getText().toString();
        String lastName= this.textLastName.getText().toString();

        Intent intent = new Intent(this,GreetingActivity.class);
        intent.putExtra("firstName", firstName);
        intent.putExtra("lastName", lastName);
        // Yêu cầu start Activity chỉ định trong Intent.
        // (Gửi yêu cầu mà không cần phản hồi).
        // this.startActivity(intent);

        // Yêu cầu start Activity và chờ phản hồi.
        this.startActivityForResult(intent, MY_REQUEST_CODE);
    }
}
