package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
    private CheckBox mSix, mTwelve, mEighteen, mTwentyFour;
    private Button mButton2;
    private TextView mResultTextView;
    private ArrayList<String> mResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mSix = findViewById(R.id.checkBox);
        mTwelve = findViewById(R.id.checkBox2);
        mEighteen =findViewById(R.id.checkBox3);
        mTwentyFour = findViewById(R.id.checkBox4);
        mButton2 = findViewById(R.id.tenthButton);
        mResultTextView = findViewById(R.id.result);
        mResult = new ArrayList<>();
        mResultTextView.setEnabled(false);

        mSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mSix.isChecked())
                    mResult.add("1 (one) to 6 (six) hours");
                else
                    mResult.remove("7 (seven) to 12 (twelve) hours");
            }
        });

        mTwelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mTwelve.isChecked())
                    mResult.add("7 (seven) to 12 (twelve) hours");
                else
                    mResult.remove("7 (seven) to 12 (twelve) hours");
            }
        });


        mEighteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEighteen.isChecked())
                    mResult.add("13 (thirteen) to 18 (eighteen) hours");
                else
                    mResult.remove("13 (thirteen) to 18 (eighteen) hours");
            }
        });

        mTwentyFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mTwentyFour.isChecked())
                    mResult.add("19 (nineteen) to 24 (twenty four) hours");
                else
                    mResult.remove("19 (nineteen) to 24 (twenty four) hours");
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

        Button fourthActivityBtn = (Button) findViewById(R.id.sixthActivityBtn);
        fourthActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(startIntent);


                Intent answer = new Intent(getApplicationContext(),MainActivity6.class);
                answer.putExtra("Hours", "7 (seven) to 12 (twelve) hours");
                startActivity(answer);
            }
        });
    }
}