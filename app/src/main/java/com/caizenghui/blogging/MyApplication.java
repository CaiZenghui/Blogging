package com.caizenghui.blogging;

import android.app.Application;

import com.alipay.euler.andfix.patch.PatchManager;
import com.caizenghui.utils.Utils;

/**
 * Created by caizenghui on 16/5/31.
 */
public class MyApplication extends Application{
    public static PatchManager patchManager;
    @Override
    public void onCreate() {
        super.onCreate();

        patchManager = new PatchManager(this);
        patchManager.init(Utils.getVersion(this));//current version
        patchManager.loadPatch();
    }
}
