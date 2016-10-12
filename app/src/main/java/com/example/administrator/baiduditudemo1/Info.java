package com.example.administrator.baiduditudemo1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/12.
 */
public class Info implements Serializable {

    public  static List<Info> infos= new ArrayList<Info>();
    public double getLongitude() {
        return longitude;
    }

    public String getDistance() {
        return distance;
    }







    public void setDistance(String distance) {
        this.distance = distance;
    }

    public int getZan() {
        return zan;
    }

    public void setZan(int zan) {
        this.zan = zan;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;

    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    private  double latitude;
    private  double longitude;
    //图片id在项目中需要从网络获取
    private int imgId;
    private String name;
    private  String distance;
    private  int zan;

    public Info(double latitude,double longitude,int imgId,String name, String distance,int zan) {
        this.latitude = latitude;this.longitude=longitude;this.imgId=imgId;this.name=name;this.distance=distance;this.zan=zan;
    }
    static {infos.add(new Info(102.752293,27.069071,R.drawable.yy,"宁南县中医医院","距离235米",666));

    }

}

