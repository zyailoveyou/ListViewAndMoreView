package com.cop.zqc.listviewdatebackup2.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.widget.RadioGroup;

import com.cop.zqc.listviewdatebackup2.R;


public class radio1activity extends Activity implements RadioGroup.OnCheckedChangeListener {


    private RadioGroup mRadioGroup1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.radiogroup1);

        mRadioGroup1 = findViewById(R.id.RadioGroup1);

        mRadioGroup1.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

        switch (checkedId) {

            case R.id.radio1_1 :

                System.out.println("radio1-1");


                Intent result = new Intent();

                result.putExtra("result","fanhui,radio1");

                setResult(123,result);

                return;

            case R.id.radio1_2 :

                System.out.println("radio1-2");

                return;
            case R.id.radio1_3 :

                System.out.println("radio1-3");

                return;
        }

    }
}
