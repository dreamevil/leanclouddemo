package com.doubin.yinggemeidemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import com.avos.avoscloud.*;
import com.doubin.yinggemeidemo.utils.ConstValues;

import java.util.List;

public class MainActivity extends Activity {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

//        final AVObject testObject = new AVObject("TestObject");
//        testObject.put("foo", "bar");
//        testObject.saveInBackground(new SaveCallback() {
//            @Override
//            public void done(AVException e) {
//                Toast.makeText(MainActivity.this, "数据已经保存", Toast.LENGTH_SHORT).show();
//                Log.i(ConstValues.LOG_TAG, "数据已经保存 " + testObject.getObjectId());
//            }
//        });
        AVQuery<AVObject> query = new AVQuery<AVObject>("TestObject");
        query.findInBackground(new FindCallback<AVObject>() {
            @Override
            public void done(List<AVObject> list, AVException e) {
                for (int i = 0; i < list.size(); i++) {
                    Log.d(ConstValues.LOG_TAG, " " + list.get(i));
                }
                Log.i(ConstValues.LOG_TAG, "item count: " + list.size());
            }
        });


    }
}
