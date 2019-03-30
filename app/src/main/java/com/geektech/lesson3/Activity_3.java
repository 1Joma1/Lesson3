package com.geektech.lesson3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_3 extends AppCompatActivity {

    String btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);


        Intent intent = getIntent();
        btn = intent.getStringExtra("mes");

        Button btnBack = findViewById(R.id.btnBack3);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Activity_3.this, MainActivity.class);
                intent2.putExtra("result", btn);
                setResult(RESULT_OK, intent2);
                finish();
            }
        });
    }
}
