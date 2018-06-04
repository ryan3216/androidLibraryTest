package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mylibrary.MainActivity_Library;

public class MainActivity extends AppCompatActivity {
    private Button btn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.buttonTest);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                switch(v.getId()) {
                    case R.id.buttonTest:
                        startActivity(new Intent(MainActivity.this, MainActivity_Library.class));
                        break;
                }
            }
        });
    }
}
