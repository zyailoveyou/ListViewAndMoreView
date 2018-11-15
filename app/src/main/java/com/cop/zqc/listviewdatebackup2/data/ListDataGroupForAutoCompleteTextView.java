package com.cop.zqc.listviewdatebackup2.data;

import android.content.Context;
import android.widget.TextView;

import java.util.ArrayList;

public class ListDataGroupForAutoCompleteTextView extends ListDataGroup{

    private String[] address= null;

    private ArrayList<Integer> icongroupid;


    public ListDataGroupForAutoCompleteTextView(String name, String manID, int ButtonID, String buttonName) {
        super(name, manID, ButtonID, buttonName);
    }

    public ListDataGroupForAutoCompleteTextView(String[] address) {
        super();
        this.address = address;
    }


    public ListDataGroupForAutoCompleteTextView(String[] address, ArrayList<Integer> icongroupid,Context context) {

        this.address = address;
        this.mContext = context;
        this.icongroupid = icongroupid;
    }

    public String[] getAddress() {
        return address;
    }

    public ArrayList<Integer> getIcongroupid() {
        return icongroupid;
    }
}
