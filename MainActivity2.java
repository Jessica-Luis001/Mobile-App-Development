package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private CheckBox mSoul, mPop, mJazz, mAlternative, mDance_Electronic, mRock, mLatin, mR_B, mHipHop, mIndie, mCountry;
    private Button mButton2;
    private TextView mResultTextView;
    private ArrayList<String> mResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mPop = findViewById(R.id.checkBox3);
        mHipHop = findViewById(R.id.checkBox4);
        mCountry =findViewById(R.id.checkBox5);
        mRock = findViewById(R.id.checkBox6);
        mLatin = findViewById(R.id.checkBox7);
        mR_B = findViewById(R.id.checkBox8);
        mDance_Electronic = findViewById(R.id.checkBox9);
        mIndie = findViewById(R.id.checkBox10);
        mAlternative = findViewById(R.id.checkBox11);
        mButton2 = findViewById(R.id.tenthButton);
        mResultTextView = findViewById(R.id.result);
        mResult = new ArrayList<>();
        mResultTextView.setEnabled(false);

        mPop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mPop.isChecked())
                    mResult.add("Pop");
                else
                    mResult.remove("Pop");
            }
        });

        mHipHop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mHipHop.isChecked())
                    mResult.add("Hip Hop");
                else
                    mResult.remove("Hip hop");
            }
        });

        mCountry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCountry.isChecked())
                    mResult.add("Country");
                else
                    mResult.remove("Country");
            }
        });

        mRock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mRock.isChecked())
                    mResult.add("Rock");
                else
                    mResult.remove("Rock");
            }
        });

        mLatin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mLatin.isChecked())
                    mResult.add("Latin");
                else
                    mResult.remove("Latin");
            }
        });

        mR_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mR_B.isChecked())
                    mResult.add("R&B");
                else
                    mResult.remove("R&B");
            }
        });

        mDance_Electronic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mDance_Electronic.isChecked())
                    mResult.add("Dance/Electronic");
                else
                    mResult.remove("Dance/Electronic");
            }
        });

        mIndie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mIndie.isChecked())
                    mResult.add("Indie");
                else
                    mResult.remove("Indie");
            }
        });

        mAlternative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mAlternative.isChecked())
                    mResult.add("Alternative");
                else
                    mResult.remove("Alternative");
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                for (String s : mResult)
                    stringBuilder.append(s).append("\n");

                mResultTextView.setText(stringBuilder.toString());
                mResultTextView.setEnabled(false);
            }
        });

        Button thirdActivityBtn = (Button) findViewById(R.id.thirdActivityBtn);
        thirdActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(startIntent);

                Intent it = new Intent(getApplicationContext(),MainActivity6.class);
                it.putExtra("Genre", "Latin");
                startActivity(it);
            }
        });
    }
}