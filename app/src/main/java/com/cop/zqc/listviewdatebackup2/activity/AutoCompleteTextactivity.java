package com.cop.zqc.listviewdatebackup2.activity;

import android.app.Activity;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import com.cop.zqc.listviewdatebackup2.R;
import com.cop.zqc.listviewdatebackup2.adapter.MyAutoCompleteAdapter;
import com.cop.zqc.listviewdatebackup2.data.ListDataGroupForAutoCompleteTextView;

import java.util.ArrayList;


public class AutoCompleteTextactivity extends Activity {


    private String[] address;
    private ArrayList<Integer> icongroupid;
    private MyAutoCompleteAdapter mMyAutoCompleteAdapter;
    private ListDataGroupForAutoCompleteTextView AutoDataGroup;
    private AutoCompleteTextView mAutoCompleteText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        address = new String[]{"qq","google","163"};

        icongroupid = new ArrayList<Integer>();

        icongroupid.add(R.mipmap.qq);
        icongroupid.add(R.mipmap.google);
        icongroupid.add(R.mipmap.netyi);

        AutoDataGroup = new ListDataGroupForAutoCompleteTextView(address,icongroupid,this);

        super.onCreate(savedInstanceState);

        setContentView(R.layout.autocompletetext);

        mAutoCompleteText = findViewById(R.id.autoCompleteText);

        mMyAutoCompleteAdapter = new MyAutoCompleteAdapter(AutoDataGroup,mAutoCompleteText);

        mAutoCompleteText.setAdapter(mMyAutoCompleteAdapter);

        mAutoCompleteText.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

    }
}
