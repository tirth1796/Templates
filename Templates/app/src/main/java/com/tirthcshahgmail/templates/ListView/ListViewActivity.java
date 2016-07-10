package com.tirthcshahgmail.templates.ListView;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.tirthcshahgmail.templates.R;

import java.util.Collections;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {
    ListView lv;
    CustomListAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        lv= (ListView) findViewById(R.id.customListView);
        adapter=new CustomListAdapter(this,getData(),R.layout.single_list_view_item);
        lv.setAdapter(adapter);
    }

    public static List<Information> getData(){
        List<Information> data= Collections.emptyList();
        return data;
    }
}
