package com.example.firstweather.gson;

import com.google.gson.annotations.SerializedName;

/*
* city 表示城市名，id 表示城市对应的天气id，update 中的loc 表示天气的更新时间
* */
public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
