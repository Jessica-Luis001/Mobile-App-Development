package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {
    private CheckBox mAppleMusic, mSpotify, mGooglePlay, mPandora, mSoundCloud, mAmazonMusic;
    private Button mDone;
    private TextView mResultTextView;
    private ArrayList<String> mResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        mAppleMusic = findViewById(R.id.checkBox16);
        mSpotify = findViewById(R.id.checkBox17);
        mGooglePlay =findViewById(R.id.checkBox19);
        mPandora = findViewById(R.id.checkBox20);
        mSoundCloud = findViewById(R.id.checkBox21);
        mAmazonMusic = findViewById(R.id.checkBox22);
        mDone = findViewById(R.id.Done);
        mResultTextView = findViewById(R.id.result);
        mResult = new ArrayList<>();
        mResultTextView.setEnabled(false);

        mAppleMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mAppleMusic.isChecked())
                    mResult.add("Apple Music");
                else
                    mResult.remove("Apple Music");
            }
        });

        mSpotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mSpotify.isChecked())
                    mResult.add("Spotify");
                else
                    mResult.remove("Spotify");
            }
        });

        mGooglePlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mGooglePlay.isChecked())
                    mResult.add("Google Play");
                else
                    mResult.remove("Google Play");
            }
        });

        mPandora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mPandora.isChecked())
                    mResult.add("Pandora");
                else
                    mResult.remove("Pandora");
            }
        });

        mSoundCloud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mSoundCloud.isChecked())
                    mResult.add("Sound Cloud");
                else
                    mResult.remove("Sound Cloud");
            }
        });

        mAmazonMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mAppleMusic.isChecked())
                    mResult.add("Amazon Music");
                else
                    mResult.remove("Amazon Music");
            }
        });

        mDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                for (String s : mResult)
                    stringBuilder.append(s).append("\n");

                mResultTextView.setText(stringBuilder.toString());
                mResultTextView.setEnabled(false);
            }
        });

        Button fifthActivityBtn = (Button) findViewById(R.id.seventhActivityBtn);
        fifthActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(startIntent);

                Intent answer2 = new Intent(getApplicationContext(),MainActivity6.class);
                answer2.putExtra("Platform", "Spotify");
                startActivity(answer2);
                }
            }
    }
}