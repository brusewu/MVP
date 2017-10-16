package com.mvp;

/**
 * Created by wuxiaolong on 2017/10/16.
 */

public interface MainPresenter {

    void onResume();

    void onItemClicked(int position);

    void onDestroy();
}
