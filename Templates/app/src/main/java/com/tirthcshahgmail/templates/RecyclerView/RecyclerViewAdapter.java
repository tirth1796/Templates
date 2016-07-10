package com.tirthcshahgmail.templates.RecyclerView;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.tirthcshahgmail.templates.R;

import java.util.Collections;
import java.util.List;

/**
 * Created by Tirth Shah on 02-01-2016.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    private final LayoutInflater inflater;
    private int singleXmlLayout;
    List<Information> data= Collections.emptyList();
    public RecyclerViewAdapter(Context context,List<Information> data,int xmlLayout) {
        this.inflater = LayoutInflater.from(context);
        this.data=data;
        this.singleXmlLayout =xmlLayout;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v=inflater.inflate(singleXmlLayout,parent,false);
        MyViewHolder holder=new MyViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Information current=data.get(position);
        holder.title.setText(current.title);
        holder.icon.setImageResource(current.iconId);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView  title;
        ImageView icon;
        public MyViewHolder(View itemView) {
            super(itemView);
            title= (TextView) itemView.findViewById(R.id.recyclerTextView);
            icon= (ImageView) itemView.findViewById(R.id.recyclerImageView);
        }
    }
}
