package com.example.firstweather.util;


import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
    /*
    发起OkHttp请求
    */
    public static void sendOkHttpRequest(String adress,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder()
                .url(adress)
                .build();
        client.newCall(request).enqueue(callback);
    }

}
