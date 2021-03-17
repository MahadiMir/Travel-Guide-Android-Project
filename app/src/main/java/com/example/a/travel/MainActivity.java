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

import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ActionBar actionBar;

    Button txt;
    Button txt1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=(Button)findViewById(R.id.txtid2) ;
        txt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(getApplicationContext(),"clicked on Resourts ",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(MainActivity.this,ResourtsActivity.class);
                startActivity(i);
            }
        });
        txt1=(Button)findViewById(R.id.txtid) ;
        txt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Toast.makeText(getApplicationContext(),"clicked on Tourism area",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(MainActivity.this,Tourismarea.class);
                startActivity(i);
            }
        });
        actionBar= getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#1C2331")));


    }





}
