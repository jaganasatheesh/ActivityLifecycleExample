package com.app.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Log.d("onCreate:","onCreate");
        Button btn_first = (Button) findViewById(R.id.btn_first);

        btn_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(FirstActivity.this,SecondActivity.class));
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("onResume:","onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("onStart:","onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("onRestart:","onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("onPause:","onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("onDestroy:","onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("onStop:","onStop");
    }


}
