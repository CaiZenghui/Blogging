package com.example.breakpad;

/**
 * Created by caizenghui on 2016/8/29.
 */
public class NdkMonitorManager {
    public native void setUpBreakpad(String filepath);

    public native void nativeCrash();
}
