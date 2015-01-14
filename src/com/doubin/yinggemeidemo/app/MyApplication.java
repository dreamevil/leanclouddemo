package com.doubin.yinggemeidemo.app;

import android.app.Application;
import com.avos.avoscloud.AVOSCloud;
import com.doubin.yinggemeidemo.utils.ConstValues;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AVOSCloud.initialize(getApplicationContext(), ConstValues.APP_ID, ConstValues.APP_KEY);
    }
}
