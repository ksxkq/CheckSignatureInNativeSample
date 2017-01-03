package com.ksxkq.checksignatureinnativesample;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        // 如果想要检测签名不通过的时候让 App crash，需要在 native-lib.cpp 的 JNI_OnLoad 函数中返回 -1 即可
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);

        String currentAppSignature = SignatureUtils.getSignMd5Str(this);
        tv.setText("currentAppSignature :\n" + currentAppSignature
                + "\n\ncheckSignature = " + checkSignature(this));
    }


    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */

    public native boolean checkSignature(Context context);

}
