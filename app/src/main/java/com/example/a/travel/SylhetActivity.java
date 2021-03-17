package com.example.a.travel;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

public class SylhetActivity extends AppCompatActivity {
    ActionBar actionBar;
    ListView mylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylhet);
        mylist=(ListView) findViewById(R.id.lv);
        String[] dhakaarea={"Ratargul Swap Forest(Sylhet City)","Jaflong(Sylhet City)","Lawarchara National park(Sreemangal)","Bisnakandi(Sylhet City)","Madhabpur Lake(Sreemagal)","Shahjalal Dorga(Sylhet City)","Madhabkunda Waterfall(MaulaiBazar)","Ali Amjad Clock Tower(Sylhrt City)","Surma Bridge(Sunamganj)","Pangthumai Waterfall(Sylhet City)","Tanguar Haor(Sunamganj)","Hakaluki Haor(Maulavi Bazar)","Hum Hum Waterfall(Sreemangal)","Rema-Kalenga Wildlife Sanctuary(Sylhetcity)","Jadukata River(Sunamganj)","Baikka Beel Wetland Sanctuary(Sreemangal)"};
        int[] areaimz={R.drawable.ratargul,R.drawable.jaflong,R.drawable.lawachara,R.drawable.bisanakandi,R.drawable.madhabpur,R.drawable.dorga,R.drawable.madhbkundawaterfall,R.drawable.aliamjad,R.drawable.surma,R.drawable.pangthumai,R.drawable.tanguarhaor,R.drawable.hakalukihaor,R.drawable.humhum,R.drawable.remakalenga,R.drawable.jadukata,R.drawable.baikka};
        sylhetlistview myadapt=new sylhetlistview(this,dhakaarea,areaimz);
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
