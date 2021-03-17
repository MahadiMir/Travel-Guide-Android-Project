package com.example.a.travel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Sajib 17 on 10/16/2017.
 */

public class sylhetlistview extends BaseAdapter{
    String[] nmez;
    int[] imgz;
    Context ct;
    public static LayoutInflater inflater=null;
    public sylhetlistview(SylhetActivity mainact,String[] nameofspot,int[] img){
        nmez=nameofspot;
        imgz=img;
        ct=mainact;
        inflater=(LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return nmez.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }
    public class MyHolder{
        ImageView image;
        TextView text;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        MyHolder myh=new MyHolder();
        View myview;
        myview=inflater.inflate(R.layout.customlayout,null);
        myh.image=(ImageView)myview.findViewById(R.id.imageviewid);
        myh.text=(TextView) myview.findViewById(R.id.textviewid);
        myh.image.setImageResource(imgz[i]);
        myh.text.setText(nmez[i]);
        return myview;
    }

}
