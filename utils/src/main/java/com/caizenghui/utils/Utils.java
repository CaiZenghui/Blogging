package com.caizenghui.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/**
 * Created by caizenghui on 16/5/31.
 */
public class Utils {
    public static String getVersion(Context context) {
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packInfo = null;
        String version = "";
        try {
            packInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            version = packInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
        } finally {
            return version;
        }
    }
}
