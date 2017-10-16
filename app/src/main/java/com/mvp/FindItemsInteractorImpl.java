package com.mvp;

import android.os.Handler;
import android.provider.ContactsContract;

import java.util.Arrays;
import java.util.List;

/**
 * Created by wuxiaolong on 2017/10/16.
 */

public class FindItemsInteractorImpl implements FindItemsInteractor {

    //private List<String> mData;

    @Override public void findItems(final OnFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                listener.onFinished(createArrayList());
            }
        }, 2000);
    }

    //public void add()
    private List<String> createArrayList() {
        return Arrays.asList(
                "Item 1",
                "Item 2",
                "Item 3",
                "Item 4",
                "Item 5",
                "Item 6",
                "Item 7",
                "Item 8",
                "Item 9",
                "Item 10"
        );
    }
}
