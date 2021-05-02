package com.sedatepace.service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_start;
    Button btn_end;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_start = (Button)findViewById(R.id.button);
         btn_end = (Button)findViewById(R.id.button2);


        btn_start.setOnClickListener(this::OnClick);
        btn_end.setOnClickListener(this::OnClick);
    }

    public void OnClick(View view){
        switch(view.getId()){
            case R.id.button:
                startService(new Intent( getApplicationContext(),MusicService.class));
                break;
            case R.id.button2:
                stopService(new Intent( getApplicationContext(), MusicService.class));
                break;
        }
    }
}