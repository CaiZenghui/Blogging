package com.example.ndk;

/**
 * Created by caizenghui on 2016/8/25.
 */
public class JniUtil {
    static {
        System.loadLibrary("jni_test");	//defaultConfig.ndk.moduleName
    }
    public native String getJniStr();
    public native String crash();
}
