package com.example.a.travel;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

public class DhakaActivity extends AppCompatActivity {
    ActionBar actionBar;
    ListView mylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka);
        mylist=(ListView) findViewById(R.id.lv);
        String[] dhakaarea={"Lalbagh Fort","Sonargaon","Ahsan Manzil","Jatiya Sangshad Bhaban","Bangladesh National Museam","Dhakeshwari Temple","Bangladesh National Zoo","Shaheed Minar Dhaka","Bahadurshah Park","Taj Mahal Bangladesh","Armenian Church,Dhaka","Hussaini Dalan"};
        int[] areaimz={R.drawable.lalbaghfort,R.drawable.sonargaon,R.drawable.ahsanmanzil,R.drawable.songsod,R.drawable.nationalmuseum,R.drawable.dhakeshwaritemple,R.drawable.dhakazoo,R.drawable.shahedminar,R.drawable.bahadurshahpark,R.drawable.tajmahal,R.drawable.armenianchurch,R.drawable.hussainidalan};
        MyCustomAdapter myadapt=new MyCustomAdapter(this,dhakaarea,areaimz);
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
