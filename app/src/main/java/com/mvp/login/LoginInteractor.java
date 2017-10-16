package com.mvp.login;

/**
 * Created by wuxiaolong on 2017/10/16.
 */

public interface LoginInteractor {
    interface OnLoginFinishedListener {
        void onUsernameError();

        void onPasswordError();

        void onSuccess();
    }

    void login(String username, String password, OnLoginFinishedListener listener);
}
