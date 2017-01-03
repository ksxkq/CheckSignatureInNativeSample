package com.ksxkq.checksignatureinnativesample;

import android.app.Application;

/**
 * OnePiece
 * Created by xukq on 1/3/17.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ContextHolder.setContext(this);
    }
}
