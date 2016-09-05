package com.example.xiaoqingdu.servicestest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    private static final String TAG="myServicetag";
    public MyService() {
    }

    public void onCreate(){
        Log.v(TAG,"onCreate()");
        super.onCreate();
    }

    public int onStartCommand(Intent intent,int flags,int startId){
        Log.v(TAG,"onStartCommand");
        int n=intent.getIntExtra("num",0);
        Log.v(TAG,"int is:"+n);
        return super.onStartCommand(intent,flags,startId);
    }

    public void onDestory(){
        Log.v(TAG,"onDestory");
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
