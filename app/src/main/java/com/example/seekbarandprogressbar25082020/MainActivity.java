package com.example.seekbarandprogressbar25082020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mTvRGB,mTvHex;
    SeekBar mSkR,mSkA,mSkB,mSkG;
    LinearLayout mBackground;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTvHex = findViewById(R.id.textviewHex);
        mTvRGB = findViewById(R.id.textviewRGB);
        mSkA = findViewById(R.id.seekbarAlpha);
        mSkB = findViewById(R.id.seekbarBlue);
        mSkG = findViewById(R.id.seekbarGreen);
        mSkR = findViewById(R.id.seekbarRed);
        mBackground = findViewById(R.id.linearBackGround);

        // Task 1 : thực hiện kéo seekbar và gắn màu cho background
        // Task 2 : Gắn giá trị màu A _ R _ G _ B
        // Task 3 : dịch mã màu theo hệ hexa

    }
}