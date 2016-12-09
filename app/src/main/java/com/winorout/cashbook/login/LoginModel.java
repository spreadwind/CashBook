package com.winorout.cashbook.login;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import static com.winorout.cashbook.MyApplication.dbHelper;

/**
 * Created by micheal-yan on 2016/12/9.
 */

public class LoginModel implements ILoginModel {

    @Override
    public void login(String userName, String userPassword, OnLoginListener listener) {
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        Cursor result = db.query("User", new String[]{"userPassword"}, "userName = ?", new String[]{userName}, null, null, null);
        if (result.moveToFirst()) {
            String password = result.getString(result.getColumnIndex("userPassword"));
            if (password.equals(userPassword)) {
                listener.onSuccess();
            } else {
                listener.onFailed("密码输入错误");
            }
        } else {
            listener.onFailed("用户不存在");
        }
        if (db != null) {
            db.close();
        }
    }
}
