package com.example.a.travel;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ResourtsActivity extends AppCompatActivity {
    ListView lv;
    ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resourts);
        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }


        actionBar= getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#1C2331")));
        lv=(ListView) findViewById(R.id.lv);
        final String[] area={" In Dhaka"};
        ArrayAdapter adaptar=new ArrayAdapter(this,R.layout.lvlayout,R.id.txtid2,area);

        lv.setAdapter(adaptar);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"clicked on "+ area[i],Toast.LENGTH_SHORT).show();
                if(i==0){
                    Intent area=new Intent(view.getContext(),ResourtActivity.class);
                    startActivity(area);
                }
            }
        });






    }




}
