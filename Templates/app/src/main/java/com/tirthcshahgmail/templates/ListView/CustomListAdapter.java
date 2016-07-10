package com.tirthcshahgmail.templates.ListView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by Tirth Shah on 08-10-2015.
 */
public class CustomListAdapter extends BaseAdapter {
    int xmlLayoutInt;
    Context context;
    List<Information> data;
    private static LayoutInflater inflater=null;
    public CustomListAdapter(Context mainIntent, List<Information> list, int l) {
        // TODO Auto-generated constructor stub
        context=mainIntent;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        xmlLayoutInt=l;
        this.data=list;
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        if(data!=null){
            return data.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder
    {
        // set all the views which are dynamic


    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        // TODO Auto-generated method stub
        Holder holder=new Holder();
        View rowView;
        rowView = inflater.inflate(xmlLayoutInt, null);
        Information currentData=data.get(position);

        //set all items using current data;




        return rowView;
    }

}