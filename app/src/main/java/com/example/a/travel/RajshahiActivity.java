package com.example.a.travel;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

public class RajshahiActivity extends AppCompatActivity {

    ActionBar actionBar;
    ListView mylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajshahi);
        mylist=(ListView) findViewById(R.id.lv);
        String[] dhakaarea={"Puthia Temple Complex(Rajshahi City)","Varendra Research Museum(Rajshahi City)","Bagha Mosque(Rajshahi City)","Chhoto Sona Mosque(Rajshahi City)","Mohasthangar(Bogra)","Buddhist Vihare( Paharpur)","Nator Royal place(Nator)"};
        int[] areaimz={R.drawable.puthiatemple,R.drawable.varendra,R.drawable.baghamosque,R.drawable.chotosona,R.drawable.mahasthangarh,R.drawable.paharpur,R.drawable.natorroyal};
        rajshahiadapter myadapt=new rajshahiadapter(this,dhakaarea,areaimz);
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
