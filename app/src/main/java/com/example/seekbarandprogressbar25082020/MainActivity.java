package com.example.seekbarandprogressbar25082020;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mTvRGB,mTvHex;
    SeekBar mSkR,mSkA,mSkB,mSkG;
    LinearLayout mBackground;
    int mRed,mGreen,mBlue,mAlpha;
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

        mRed = mGreen = mBlue = mAlpha = 0;

        mSkA.setOnSeekBarChangeListener(onSeekBarChangeListener);
        mSkR.setOnSeekBarChangeListener(onSeekBarChangeListener);
        mSkG.setOnSeekBarChangeListener(onSeekBarChangeListener);
        mSkB.setOnSeekBarChangeListener(onSeekBarChangeListener);

        // Task 1 : thực hiện kéo seekbar và gắn màu cho background
        // Task 2 : Gắn giá trị màu A _ R _ G _ B
        // Task 3 : dịch mã màu theo hệ hex
    }
    private SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            switch (seekBar.getId()){
                case R.id.seekbarAlpha :
                    mAlpha = progress;
                    break;
                case R.id.seekbarRed :
                    mRed = progress;
                    break;
                case R.id.seekbarGreen :
                    mGreen = progress;
                    break;
                case R.id.seekbarBlue :
                    mBlue = progress;
                    break;
            }
            mBackground.setBackgroundColor(Color.argb(mAlpha,mRed,mGreen,mBlue));
            mTvRGB.setText(String.format("RBG %d %d %d %d",mAlpha,mRed,mGreen,mBlue));
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };
}