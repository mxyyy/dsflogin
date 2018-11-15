package com.bwie.dsflogin;

import android.app.Application;

import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.UMShareAPI;

/**
 * date:2018/11/15
 * author:mxy(M)
 * function:
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //U盟SDK初始化
        UMShareAPI.get(this);
    }

    {
        PlatformConfig.setQQZone("1106036236","mjFCi0oxXZKZEWJs");
    }
}
