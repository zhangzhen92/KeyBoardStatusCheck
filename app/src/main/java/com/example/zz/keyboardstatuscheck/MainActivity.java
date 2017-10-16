package com.example.zz.keyboardstatuscheck;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RelativeLayout;

import com.example.zz.keyboardstatuscheck.utils.SoftKeyboardStateHelper;

/**
 * 类描述：测试类
 * 创建人：zz
 * 创建时间：2017/10/16 16:18
 */
public class MainActivity extends Activity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout relativeParent = (RelativeLayout) findViewById(R.id.relative_parent);
        SoftKeyboardStateHelper helper = new SoftKeyboardStateHelper(relativeParent);
        helper.addSoftKeyboardStateListener(new SoftKeyboardStateHelper.SoftKeyboardStateListener() {
            @Override
            public void onSoftKeyboardOpened(int keyboardHeightInPx) {
                Log.d(TAG, "onSoftKeyboardOpened: ------open");
            }

            @Override
            public void onSoftKeyboardClosed() {
                Log.d(TAG, "onSoftKeyboardClosed: ------closed");
            }
        });
    }
}
