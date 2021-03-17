package com.example.a.travel;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

public class RangpurActivity extends AppCompatActivity {
    ActionBar actionBar;
    ListView mylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangpur);
        mylist=(ListView) findViewById(R.id.lv);
        String[] dhakaarea={"Tajhat place(Rangpur)","Kantajew Temple(Dinajpur)","Ramsagar National Park(Dinajpur)","Thakurgaon Sugar Mill(Thakurgaon)","Townhall(Rangpur)"};
        int[] areaimz={R.drawable.tajhat,R.drawable.kantajewtemple,R.drawable.ramsagar,R.drawable.sugarmill,R.drawable.townhall};
        rongpuradaptor myadapt=new rongpuradaptor(this,dhakaarea,areaimz);
        mylist.setAdapter(myadapt);
        actionBar= getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#1C2331")));
        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem Item){
        if(Item.getItemId()==android.R.id.home);
        finish();
        return super.onOptionsItemSelected(Item);
    }
}
