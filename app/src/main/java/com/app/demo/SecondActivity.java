package com.app.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.d("onCreate Second:","onCreate");
        Button btn_second = (Button) findViewById(R.id.btn_second);

        btn_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(SecondActivity.this,FirstActivity.class));
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("onResume Second:","onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("onStart Second:","onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("onRestart Second:","onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("onPause Second:","onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("onDestroy Second:","onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("onStop Second:","onStop");
    }

}
