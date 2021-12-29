#include <jni.h>

//
// Created by huchao on 2021/12/23.
//
#include <android/log.h>

extern "C" {

JNIEXPORT void JNICALL
Java_com_huchao_mysystemloadlibrary_jni_MyTestJni_printLog(JNIEnv *env, jclass clazz) {
    __android_log_print(ANDROID_LOG_DEBUG, "huchao", "Java_com_huchao_mysystemloadlibrary_jni_MyTestJni_printLog");
}

}