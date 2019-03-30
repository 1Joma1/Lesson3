package com.geektech.lesson3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Button btnBack;
    String btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        btn = intent.getStringExtra("mes");

        TextView tv = findViewById(R.id.tView);
        tv.setText(btn);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(SecondActivity.this, MainActivity.class);
                intent1.putExtra("result", btn);
                setResult(RESULT_OK, intent1);
                finish();
            }
        });
    }
}
