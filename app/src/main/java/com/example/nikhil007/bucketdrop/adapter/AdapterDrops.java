package com.example.nikhil007.bucketdrop.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nikhil007.bucketdrop.R;

/**
 * Created by Nikhil007 on 06-08-2017.
 */

public class AdapterDrops extends RecyclerView.Adapter<AdapterDrops.DropHolder> {

    private LayoutInflater mInflater;
    public AdapterDrops(Context context){
        mInflater= LayoutInflater.from(context);
    }

    @Override
    public DropHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.row_drop,parent,false);
        DropHolder holder = new DropHolder(view);
        return null;
    }

    @Override
    public void onBindViewHolder(DropHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class DropHolder extends RecyclerView.ViewHolder{

        public DropHolder(View itemView) {
            super(itemView);
        }
    }
}
