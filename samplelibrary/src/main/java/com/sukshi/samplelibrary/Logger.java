package com.sukshi.samplelibrary;

import android.util.Log;

/**
 * Created by shashankpashikanti on 9/10/18.
 */

public class Logger {

    public static final String TAG = "shank'sTag";

    public void showLog(String message) {

        Log.e(TAG, message);
    }
}
