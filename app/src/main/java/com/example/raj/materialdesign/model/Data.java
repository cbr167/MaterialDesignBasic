package com.example.raj.materialdesign.model;

import com.example.raj.materialdesign.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Raj on 8/2/2017.
 */

public class Data {

    private String name;
    private int imageId;

    public Data() {

    }

    public Data(String name, int imageId) {

        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }


    public int getImageId() {
        return imageId;
    }


    public List<Data> initializationData() {
        List<Data> dataList = new ArrayList<>();

        dataList.add(new Data("a1", R.drawable.a));
        dataList.add(new Data("a2", R.drawable.ab));
        dataList.add(new Data("a3", R.drawable.abc));
        dataList.add(new Data("a4", R.drawable.abcd));

        return dataList;

    }
}
