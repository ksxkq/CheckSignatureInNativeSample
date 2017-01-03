package com.ksxkq.checksignatureinnativesample;

import android.content.Context;

/**
 * OnePiece
 * Created by xukq on 1/3/17.
 */

public class ContextHolder {

    private static Context sContext;

    public static void setContext(Context context) {
        ContextHolder.sContext = context;
    }

    public static Context getContext() {
        return sContext;
    }
}
