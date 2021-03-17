package com.example.a.travel;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

public class BarishalActivity extends AppCompatActivity {
    ActionBar actionBar;
    ListView mylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barishal);
        mylist=(ListView) findViewById(R.id.lv);
        String[] dhakaarea={"Kuakata Sea Beach(Potuakhali)","Durga Sagar(Barishal City)","Guthia Mosque(Barishal City)","Kuakata Buddhist Temple(Kuakata)","Jhau forest(Kuakata)","Sonar char(Potuakhali)","Fatrar Char(Kuakata)","Guava Market(Barishal City)"};
        int[] areaimz={R.drawable.kuakata,R.drawable.durgasagar,R.drawable.guthia,R.drawable.kuakatabuddhist,R.drawable.jhauforest,R.drawable.sonarchar,R.drawable.fatrarchar,R.drawable.guavamarket};
        barishaladapter myadapt=new barishaladapter(this,dhakaarea,areaimz);
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
