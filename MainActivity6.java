package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        if (getIntent().hasExtra("Latin")) {
            TextView tv = (TextView) findViewById(R.id.textView);
            String text = getIntent().getExtras().getString("Latin");
            tv.setText(text);
        }

        if (getIntent().hasExtra("7 (seven) to 12 (twelve) hours")) {
            TextView tv = (TextView) findViewById((R.id.textView2));
            String text1 = getIntent().getExtras().getString("7 (seven) to 12 (twelve) hours");
            tv.setText(text1);
        }

        if (getIntent().hasExtra("Spotify")) {
            TextView tv = (TextView) findViewById((R.id.textView2));
            String text2 = getIntent().getExtras().getString("Spotify");
            tv.setText(text2);
        }

        if (getIntent().hasExtra("Ozuna")) {
            TextView tv = (TextView) findViewById((R.id.textView2));
            String text3 = getIntent().getExtras().getString("Ozuna");
            tv.setText(text3);
        }
    }
}


