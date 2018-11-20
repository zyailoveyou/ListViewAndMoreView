package com.cop.zqc.listviewdatebackup2.main;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.widget.ListView;

import com.cop.zqc.listviewdatebackup2.R;
import com.cop.zqc.listviewdatebackup2.activity.AutoCompleteTextactivity;
import com.cop.zqc.listviewdatebackup2.activity.Progressbar_indeternimate_atv;
import com.cop.zqc.listviewdatebackup2.activity.ScrollViewActivtiy;
import com.cop.zqc.listviewdatebackup2.activity.Spinneractivity;
import com.cop.zqc.listviewdatebackup2.activity.radio1activity;
import com.cop.zqc.listviewdatebackup2.activity.radio2activity;
import com.cop.zqc.listviewdatebackup2.activity.seekbaractivity;
import com.cop.zqc.listviewdatebackup2.adapter.Myadapter;
import com.cop.zqc.listviewdatebackup2.data.ListDataGroup;

public class MainActivity extends AppCompatActivity {

    private ListView mListView_dynamic;

    private Myadapter mMyAdapter;

    private ListDataGroup[] mListDateGronp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);



        mListDateGronp = new ListDataGroup[]{

                new ListDataGroup("张三","1995","click1",01,this,new Intent(this,radio1activity.class)),
                new ListDataGroup("李四","1996","click2",02,this,new Intent(this,radio2activity.class)),
                new ListDataGroup("王五","1997","click3",03,this,new Intent(this,Progressbar_indeternimate_atv.class)),
                new ListDataGroup("王1","1997","click4",04,this,new Intent(this,Spinneractivity.class)),
                new ListDataGroup("王100","1997","click4",05,this,new Intent(this,AutoCompleteTextactivity.class)),
                new ListDataGroup("狗100","1997","click5",06,this,new Intent(this,seekbaractivity.class)),
                new ListDataGroup("狗102","1999","click6",07,this,new Intent(this,ScrollViewActivtiy.class))

        };

        mMyAdapter = new Myadapter(mListDateGronp, this);

        mListView_dynamic = findViewById(R.id.listView_dynamic);

        mListView_dynamic.setAdapter(mMyAdapter);

        mListView_dynamic.setOnItemClickListener(mMyAdapter);

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case 0:

                String restring = data.getStringExtra("result");


                System.out.println(restring);

                return;

        }

    }


}
