package com.cop.zqc.listviewdatebackup2.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.cop.zqc.listviewdatebackup2.R;
import com.cop.zqc.listviewdatebackup2.adapter.MySpinnerAdapter;
import com.cop.zqc.listviewdatebackup2.data.ListDataGroup;

public class Spinneractivity extends Activity {

    private MySpinnerAdapter mMySpinnerAdapter;
    private ListDataGroup[] mListDataGronp;
    private Spinner mMspinner;

    private ArrayAdapter<String> abc = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner);

        mListDataGronp = new ListDataGroup[]{new ListDataGroup("张三","1995","click1",01,this,new Intent(this,radio1activity.class)),
                new ListDataGroup("李四","1996","click2",02,this,new Intent(this,radio2activity.class)),
                new ListDataGroup("王五","1997","click3",03,this,new Intent(this,Spinneractivity.class))

        };

        mMspinner = findViewById(R.id.spinner);

        mMySpinnerAdapter = new MySpinnerAdapter(this,mListDataGronp);

        mMspinner.setAdapter(mMySpinnerAdapter);


        abc = new ArrayAdapter<String>(this,R.layout.spinner);


    }
}
