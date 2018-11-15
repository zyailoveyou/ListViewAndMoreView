package com.cop.zqc.listviewdatebackup2.activity;

import android.app.Activity;
import android.os.Bundle;

import android.widget.ProgressBar;


import com.cop.zqc.listviewdatebackup2.R;

import java.util.Timer;
import java.util.TimerTask;

public class Progressbar_indeternimate_atv extends Activity {


    private ProgressBar mProgressbar;
    private Timer mTimer;
    private TimerTask mTimerTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progressbar_indeterminate);


        mProgressbar = findViewById(R.id.progressBar);

        mTimer = new Timer("progreebarstart");

        mTimerTask = new TimerTask() {
            @Override
            public void run() {


                mProgressbar.incrementProgressBy(5);

            }
        };


        mTimer.schedule(mTimerTask,0,1000);

    }
}
