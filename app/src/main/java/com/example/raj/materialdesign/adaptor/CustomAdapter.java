package com.example.raj.materialdesign.adaptor;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.raj.materialdesign.R;
import com.example.raj.materialdesign.model.Data;

import java.util.List;

/**
 * Created by Raj on 8/2/2017.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomHolder> {
    List<Data> dataList;

  public  CustomAdapter(List<Data> dataList)
    {
        this.dataList = dataList;
    }
    @Override
    public CustomHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, null);
        return new CustomHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomHolder holder, int position) {
         Data data = dataList.get(position);
        holder.textView.setText(data.getName());
        holder.imageView.setImageResource(data.getImageId());

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class CustomHolder extends  RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public CustomHolder(View itemView) {

            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            textView = (TextView) itemView.findViewById(R.id.textView);

        }


    }
}
