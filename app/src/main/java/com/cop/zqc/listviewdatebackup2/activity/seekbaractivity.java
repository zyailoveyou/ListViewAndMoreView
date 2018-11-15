package com.cop.zqc.listviewdatebackup2.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import com.cop.zqc.listviewdatebackup2.R;




public class seekbaractivity extends Activity {

    private SeekBar mSeekBar;
    private TextView progress;
    private TextView mTextprogress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.seekbar);

        mSeekBar = findViewById(R.id.seekBarcommon);
        mTextprogress = findViewById(R.id.progress);

        mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                mTextprogress.setText("当前进度"+progress);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }
}
