package com.cop.zqc.listviewdatebackup2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.cop.zqc.listviewdatebackup2.R;
import com.cop.zqc.listviewdatebackup2.data.ListDataGroup;
import com.cop.zqc.listviewdatebackup2.main.MainActivity;
import androidx.constraintlayout.widget.ConstraintLayout;



public class Myadapter extends BaseAdapter implements View.OnClickListener, AdapterView.OnItemClickListener {



    private ListDataGroup[] mDateGroup;
    private Context mContext;
    private TextView mTextname;
    private TextView mTextManID;
    private Button mTextButton;

    private class IndentifiySaver{

        public Button Bt;
        public String IDtoSwtich;

    }


    public ListDataGroup[] getDateGroup() {
        return mDateGroup;
    }

    public Myadapter(ListDataGroup[] dateGroup, Context context) {
        mDateGroup = dateGroup;
        mContext = context;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


        ((MainActivity)mContext).startActivityForResult(this.getDateGroup()[position].getIntentbindtoStartActivity(),position);

    }


    @Override
    public int getCount() {
        return mDateGroup.length;
    }


    @Override
    public Object getItem(int position) {
        return mDateGroup[position];
    }


    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        IndentifiySaver ClickManager = new IndentifiySaver();

        ConstraintLayout layoutfill = null;


        if (convertView == null) {


            layoutfill = (ConstraintLayout) LayoutInflater.from(mContext).inflate(R.layout.listfill,null);


        } else {

            layoutfill = (ConstraintLayout) convertView;

        }


        mTextname = layoutfill.findViewById(R.id.name);
        mTextManID = layoutfill.findViewById(R.id.ManID);
        mTextButton = layoutfill.findViewById(R.id.testButton);

        mTextname.setText(mDateGroup[position].GetName());
        mTextManID.setText(mDateGroup[position].GetManID());
        mTextButton.setText(mDateGroup[position].getButtonName());

        ClickManager.Bt = mTextButton;
        ClickManager.Bt.setOnClickListener(this);
        ClickManager.Bt.setTag(position);

        return layoutfill;

    }

    @Override
    public void onClick(View v) {

        switch ((Integer) v.getTag()) {
            case 0:

                System.out.println("第一个button点击了");

                return;
            case 1:

                System.out.println("第二个button点击了");

                return;
            case 2:

                System.out.println("第三个button点击了");

                return;
            case 3:

                System.out.println("第四个button点击了");

                return;
            case 4:

                System.out.println("第五个button点击了");

                return;
            case 5:

                System.out.println("第六个button点击了");

                return;

            case 6:

                System.out.println("第七个button点击了");

                return;

            case 7:

                System.out.println("第八个button点击了");

                return;
        }

    }
}
