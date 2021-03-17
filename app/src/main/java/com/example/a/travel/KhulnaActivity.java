package com.example.a.travel;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

public class KhulnaActivity extends AppCompatActivity {
    ActionBar actionBar;
    ListView mylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khulna);
        mylist=(ListView) findViewById(R.id.lv);
        String[] dhakaarea={"Shait-Gumbad Mosque(Bagrhat)","Sundarban(Bagerhat)","Shilaidaha Kuthibari(Kustia)","Fakir Lalon Shah's Mazaar(kustia)","Harding Bridge(kustia)"};
        int[] areaimz={R.drawable.shait,R.drawable.sundarban,R.drawable.kuthibari,R.drawable.lalonshah,R.drawable.harding};
        CustomAdapter myadapt=new CustomAdapter(this,dhakaarea,areaimz);
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
