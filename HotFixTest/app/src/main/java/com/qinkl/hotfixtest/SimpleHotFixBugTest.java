package com.qinkl.hotfixtest;

import android.content.Context;
import android.widget.Toast;

public class SimpleHotFixBugTest {
    public void getBug(Context context) {
        int i = 10;
        int a = 0;
        Toast.makeText(context, "Hello,I am QKL:" + i / a, Toast.LENGTH_SHORT).show();
    }
}
