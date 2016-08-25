#include "com_example_ndk_JniUtil.h"
/*
 * Class:     com_example_ndk_JniUtil
 * Method:    getJniStr
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_example_ndk_JniUtil_getJniStr
        (JNIEnv *env, jobject obj){
    return (*env)->NewStringUTF(env, "This just a test for Android Studio NDK JNI developer!");
}

JNIEXPORT jstring JNICALL Java_com_example_ndk_JniUtil_crash
        (JNIEnv *env, jobject obj){
    return (*env)->NewStringUTF(env,
                                (1 / 0) + "This just a test for Android Studio NDK JNI developer!");
}