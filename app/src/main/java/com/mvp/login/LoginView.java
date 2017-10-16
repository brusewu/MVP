package com.mvp.login;

/**
 * Created by wuxiaolong on 2017/10/16.
 */

public interface LoginView {

        void showProgress();

        void hideProgress();

        void setUsernameError();

        void setPasswordError();

        void navigateToHome();

}
