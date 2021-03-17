package com.example.a.travel;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

public class ChittagongActivity extends AppCompatActivity {
    ActionBar actionBar;
    ListView mylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chittagong);
        mylist=(ListView) findViewById(R.id.lv);
        String[] dhakaarea={"Coxbazar beach(Coxbazar)","Inani beach(Coxbazar)","Saint Martin Island(Coxbazar)","Himchori(Coxbazar)","100 feet Buddha(Coxbazar)","Kana raja's Cave(Coxbazar)","Nilachal(Bandarban)","Buddha Dhatu Jadi(Bandarban)","Nilgiri Mountain(Bandarban)","Sangu Rivar(Bandarban)","Nafakhum(Bandarban)","Shoilo Propat(Bandarban)","Rijuk Jhorna(Bandarban)","Foy's Lake(Chittagong City)","Neval Beach(Chittagong City)","Boga Lake(Chittagong City)","Potenga Beach(Chittagong City)","Vatiary Lake(Chittagong City)","khoiyachara Falls(Chittagong City)","Shalban bihar(Comilla)","Rupban Mura(comilla)","Shuvolong(Rangamati)","Parjatan Haging Bridge(Rangamati)","Kaptai lake(Rangamati)"};
        int[] areaimz={R.drawable.coxbazar,R.drawable.inani,R.drawable.saintmartin,R.drawable.himchori,R.drawable.feetbuddha,R.drawable.kanaraja,R.drawable.nilachol,R.drawable.buddhadhatu,R.drawable.nilgiri,R.drawable.sanguriver,R.drawable.nafakhum,R.drawable.shoilopropat,R.drawable.rijuk,R.drawable.foyslake,R.drawable.nevalbeach,R.drawable.bogalake,R.drawable.patengabeach,R.drawable.vatiarlake,R.drawable.khoiyachora,R.drawable.shalbanbihar,R.drawable.rupbanmura,R.drawable.shuvolong,R.drawable.parjatanhaging,R.drawable.kaptailake};
        chittagongadapter myadapt=new chittagongadapter(this,dhakaarea,areaimz);
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
