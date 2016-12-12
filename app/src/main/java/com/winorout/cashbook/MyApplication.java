package com.winorout.cashbook;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.winorout.cashbook.common.db.DatabaseHelper;
import com.winorout.cashbook.common.util.DBUtils;

/**
 * Created by micheal-yan on 2016/12/9.
 */

public class MyApplication extends Application {

    //数据库名
    public static final String DATABASE_NAME = "CashBook.db";
    public static DatabaseHelper dbHelper;

    @Override
    public void onCreate() {
        super.onCreate();
        dbHelper = new DatabaseHelper(this, DATABASE_NAME, null, 1);
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        DBUtils.initCategory(db);
        if (db != null) {
            db.close();
        }
    }
}
