package com.cop.zqc.listviewdatebackup2.data;

import android.content.Context;
import android.content.Intent;

public class ListDataGroup {


    private String name = null;
    private String ManID = null;
    private String ButtonName = null;
    private int ButtonID = 0;
    protected Context mContext = null;
    private Intent  mIntentbindtoStartActivity= null;


    public ListDataGroup() {
        this.name =null;
        this.ManID =null;
        this.ButtonName =null;
        this.ButtonID = 0;
        this.mContext = null;
        this.mIntentbindtoStartActivity =null;
    }

    public ListDataGroup(String name, String manID, int ButtonID, String buttonName) {

        this.name=name;
        this.ManID = manID;
        this.ButtonID=ButtonID;
        this.ButtonName=buttonName;

    }

    public ListDataGroup(String name, String manID, String buttonName, int buttonID, Context context, Intent intentbindtoStartActivity) {
        this.name = name;
        ManID = manID;
        ButtonName = buttonName;
        ButtonID = buttonID;
        mContext = context;
        mIntentbindtoStartActivity = intentbindtoStartActivity;
    }

    public String GetName() {
        return name;
    }

    public String GetManID() {
        return ManID;

    }

    public int GetButtonID() {
        return ButtonID;
    }

    public Intent getIntentbindtoStartActivity() {
        return mIntentbindtoStartActivity;
    }

    public Context getContext() {
        return mContext;
    }

    public String getButtonName() {
        return ButtonName;

    }
}
