package com.winorout.cashbook.changepwd;

/**
 * Created by micheal-yan on 2016/12/9.
 */

public interface IChangePwdPresenter {

    void changePwd(String userPassword, String email);

    void destory();
}
