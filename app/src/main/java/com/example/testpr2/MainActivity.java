package com.example.testpr2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Логика нажатия на кнопку буквы
    public void onMyButtonClick(View view) {
        TextView infoTextView = (TextView) findViewById(R.id.textView);
        Button button = (Button) view;
        String buttonText = button.getText().toString();
        infoTextView.append(buttonText);
    }

    // Логика нажатия на кнопку для удаления слова
    public void onDellClick(View view) {
        TextView infoTextView = (TextView) findViewById(R.id.textView);
        infoTextView.setText("");
    }

    // Логика нажатия на кнопку проверки слова
    public void onOkClick(View view) {

    }

}
