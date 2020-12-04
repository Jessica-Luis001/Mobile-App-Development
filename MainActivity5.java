package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Button tenthButton = (Button) findViewById(R.id.tenthActivity);
        tenthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity6.class);
                startActivity(startIntent);

                Intent answer3 = new Intent(getApplicationContext(),MainActivity6.class);
                answer3.putExtra("Artist", "Ozuna");
                startActivity(answer3);
            }
        )
        };

}