package com.winorout.cashbook.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by micheal-yan on 2016/12/2.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    /**
     * 创建用户表语句
     */
    public static final String CREATE_USER = "create table User ("
            + "id integer primary key autoincrement,"
            + "userName text UNIQUE,"
            + "userPassword text,"
            + "userPhoto blob,"
            + "email text,"
            + "totalAssets real,"
            + "generalIncome real,"
            + "overallCost real)";

    /**
     * 创建类目表语句
     */
    public static final String CREATE_CATEGORY = "create table Category ("
            + "id integer primary key autoincrement,"
            + "categoryType text,"
            + "categoryName text,"
            + "categoryDesc text,"
            + "categoryPic blob,"
            + "UNIQUE (categoryType, categoryName))";

    /**
     * 创建财务表语句
     */
    public static final String CREATE_FINACE = "create table Finace ("
            + "id integer primary key autoincrement,"
            + "userId integer,"
            + "categoryId integer,"
            + "amount real,"
            + "date text,"
            + "note text)";

    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_USER);
        db.execSQL(CREATE_CATEGORY);
        db.execSQL(CREATE_FINACE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
