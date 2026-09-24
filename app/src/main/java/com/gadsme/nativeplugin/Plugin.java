package com.gadsme.nativeplugin;

/* JADX INFO: loaded from: classes4.dex */
public class Plugin {
    static {
        System.loadLibrary("GadsmeAndroidPlugin");
    }

    public static native void SendMessage(String str, int i, String str2);
}
