package com.cop.zqc.listviewdatebackup2.adapter;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;


import com.cop.zqc.listviewdatebackup2.R;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.cop.zqc.listviewdatebackup2.data.ListDataGroup;

public class MySpinnerAdapter implements SpinnerAdapter {


    private Context mContext = null;
    private ListDataGroup[] mListDataGroups=null;
    private ImageView mImageView = null;
    private TextView mTextViewtop = null;
    private TextView mTextviewdown = null;
    private TextView mTextViewright = null;



    public MySpinnerAdapter(Context context, ListDataGroup[] listDataGroups) {

        mContext = context;

        mListDataGroups = listDataGroups;

    }




    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {


        ConstraintLayout layoutfill = null;


       if (convertView == null) {

            layoutfill= (ConstraintLayout) LayoutInflater.from(mContext).inflate(R.layout.spinnerfill,null);

        } else {

            layoutfill = (ConstraintLayout) convertView;
       }

        return layoutfill;

    }

    @Override
    public void registerDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public int getCount() {
        return mListDataGroups.length;
    }

    @Override
    public Object getItem(int position) {
        return mListDataGroups[position] ;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TextView textView = new TextView(mContext);
        textView.setText("我是孤儿");
        return textView;

    }

    @Override
    public int getItemViewType(int position) {
        return 1;
    }

    @Override
    public int getViewTypeCount() {
        return 1;
    }


    @Override
    public boolean isEmpty() {
        return false;
    }
}
