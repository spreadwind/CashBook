package com.winorout.cashbook.changepwd;

/**
 * Created by micheal-yan on 2016/12/9.
 */

public interface IChangepwdModel {

    interface OnChangePwdListener {

        void onSuccess();

        void onFailed(String msg);
    }

    void changePwd(String userPassword, String email, OnChangePwdListener listener);
}
