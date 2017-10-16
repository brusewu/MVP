package com.mvp.login;

/**
 * Created by wuxiaolong on 2017/10/16.
 */

public interface LoginPresenter {
    void validateCredentials(String username, String password);

    void onDestroy();
}
