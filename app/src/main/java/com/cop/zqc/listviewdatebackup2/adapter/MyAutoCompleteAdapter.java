package com.cop.zqc.listviewdatebackup2.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import com.cop.zqc.listviewdatebackup2.R;
import com.cop.zqc.listviewdatebackup2.data.ListDataGroupForAutoCompleteTextView;

import java.util.ArrayList;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MyAutoCompleteAdapter extends BaseAdapter implements Filterable {

    private ListDataGroupForAutoCompleteTextView data;
    private String[] address;
    private ArrayList<String> datastore = new ArrayList<>();
    private AutoCompleteTextView mAutoCompleteTextView;

    public MyAutoCompleteAdapter(ListDataGroupForAutoCompleteTextView data,AutoCompleteTextView mAutoCompleteTextView) {

        this.data= data;
        this.address=data.getAddress();
        this.mAutoCompleteTextView= mAutoCompleteTextView;

    }

    @Override
    public int getCount() {

        if(datastore!=null)

        {return datastore.size();}

        else {return 0;}

    }

    @Override
    public Object getItem(int position) {

        if(datastore!=null)

            {return datastore.get(position);}

        else

            {return null;}

    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView picture;
        TextView email;

        ConstraintLayout layoutfill;

        if(datastore!=null) {

            if (convertView == null)

            {
                layoutfill = (ConstraintLayout) LayoutInflater.from(data.getContext()).inflate(R.layout.autofill, null);
            } else {
                layoutfill = (ConstraintLayout) convertView;
            }


            picture = layoutfill.findViewById(R.id.iconPicture);
            email = layoutfill.findViewById(R.id.email);

            picture.setImageResource((data.getIcongroupid()).get(position));
            email.setText(datastore.get(position));

            return layoutfill;

        }

        else{

            return null;

        }

    }




    @Override
    public Filter getFilter() {

        Filter mfilter = new Filter() {

            @Override
            protected FilterResults performFiltering(CharSequence constraint) {

                ArrayList<String> addresspresent = new ArrayList<String>();

                FilterResults filterResults =new FilterResults();

                if(constraint != null && !constraint.toString().contains("@")){
                    for(String data : address){
                        addresspresent.add(constraint+"@"+data+".com");
                    }
                }

                else{

                    addresspresent = null;

                }

                    filterResults.values = addresspresent;
                    filterResults.count = addresspresent.size();

                return filterResults;

            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {

                datastore = (ArrayList)results.values;
                notifyDataSetChanged();

            }
        };

        return mfilter;
    }


}
