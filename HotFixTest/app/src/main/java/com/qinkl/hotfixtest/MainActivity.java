package com.qinkl.hotfixtest;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PermissionUtils.requestPermission(MainActivity.this, PermissionUtils.CODE_READ_EXTERNAL_STORAGE, mPermissionGrant);
    }

    public void fix(View view) {
        FixDexUtils.loadFixedDex(MainActivity.this, Environment.getExternalStorageDirectory());
    }

    public void wrong(View view) {
        SimpleHotFixBugTest test = new SimpleHotFixBugTest();
        test.getBug(this);
    }

    private PermissionUtils.PermissionGrant mPermissionGrant = new PermissionUtils.PermissionGrant() {
        @Override
        public void onPermissionGranted(int requestCode) {
            switch (requestCode) {
                case PermissionUtils.CODE_READ_EXTERNAL_STORAGE:
                    break;
                default:
                    break;
            }
        }
    };

}
