package com.winorout.cashbook.activity;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import com.winorout.cashbook.R;
import com.winorout.cashbook.util.DBUtils;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //创建数据库
        SQLiteDatabase db = DBUtils.createDatabse(this, 1);
        //初始化类目表
        DBUtils.initCategory(db);
    }
}
