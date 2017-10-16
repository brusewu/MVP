package com.mvp;

import android.provider.ContactsContract;

import java.util.List;

/**
 * Created by wuxiaolong on 2017/10/16.
 */

public interface FindItemsInteractor {
    interface OnFinishedListener {
        void onFinished(List<String> items);
    }
   // void add(String data);
    void findItems(OnFinishedListener listener);
}
