package com.example.ndk;

/**
 * Created by caizenghui on 2016/8/25.
 */
public class NdkMonitor {
    static {
        System.loadLibrary("ndk_monitor");	//defaultConfig.ndk.moduleName
    }
    public native int setNativeCrashDir(String dir);
}
