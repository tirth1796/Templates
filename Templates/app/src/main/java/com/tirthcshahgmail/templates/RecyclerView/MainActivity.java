package com.tirthcshahgmail.templates.RecyclerView;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.tirthcshahgmail.templates.R;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {
    RecyclerView rView;
    RecyclerViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        rView=(RecyclerView)findViewById(R.id.recyclerView);
        List<Information> list=getData();
        adapter=new RecyclerViewAdapter(this,list,R.layout.recycler_view_item);
        rView.setAdapter(adapter);
        rView.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public static List<Information> getData(){
        List<Information> data=new ArrayList<>();
        int[] icons={R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher};
        String[] title={"abc","def","ghi","jkl"};
        for (int i=0;i<icons.length&&i<title.length;i++){
            Information curr=new Information();
            curr.iconId=icons[i];
            curr.title=title[i];
            data.add(curr);
        }
        Log.d("tp",data.get(0).title);
        return data;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
